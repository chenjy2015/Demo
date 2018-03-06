package com.android.volley;

import android.os.Environment;
import android.text.format.DateFormat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Calendar;
import java.util.concurrent.Executors;

/**
 * @version V1.0
 * @createAuthor chenxiaoping
 * @createDate 2017/4/13 10:31
 * @updateAuthor
 * @updateDate
 * @company 跨越速运
 * @description
 * @copyright copyright(c)2016 Shenzhen Kye Technology Co., Ltd. Inc. All rights reserved.
 */
public class IoUtils {
    /**
     * 一行一行写入文件，解决写入中文字符时出现乱码
     * <p>
     * 流的关闭顺序：先打开的后关，后打开的先关，
     * 否则有可能出现java.io.IOException: Stream closed异常
     *
     * @throws IOException
     */
    public static void writeFileToLocal(final String content) {

        Executors.newSingleThreadExecutor().submit(new Runnable() {
            @Override
            public void run() {

                BufferedWriter bw = null;
                OutputStreamWriter osw = null;
                FileOutputStream fos = null;
                try {

                    //写入中文字符时解决中文乱码问题

                    File saveFile = null;//保存的文件
                    String currentDate = DateFormat.format("yyyy-MM-dd", Calendar.getInstance().getTime()).toString();//当天时间
                    boolean isExist = false;//当前文件名是否存在

                    File questLog = new File(getKyeRootFolder().getAbsolutePath() + File.separator + "HttpLog");
                    if (!questLog.exists()) {
                        questLog.mkdirs();
                    }

                    File[] files = questLog.listFiles();
                    if (files != null && files.length > 0) {
                        for (File f : files) {
                            if (currentDate.equals(f.getName())) {
                                //   如果存在当天的文件保存日志，则续写到当天日志
                                isExist = true;
                                saveFile = f;
                            }
                        }
                    }

                    if (!isExist) {
                        //  如果不存在当天的日志文件，则创建
                        saveFile = new File(questLog, currentDate);
                    }

                    fos = new FileOutputStream(saveFile, true);
                    osw = new OutputStreamWriter(fos, "UTF-8");
                    bw = new BufferedWriter(osw);

                    bw.write(content);
                    bw.newLine();//换行

                    //注意关闭的先后顺序，先打开的后关闭，后打开的先关闭
                    bw.close();
                    osw.close();
                    fos.close();
                } catch (Exception i) {
                    i.printStackTrace();
                } finally {
                    if (bw != null) {
                        try {
                            bw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (osw != null) {
                        try {
                            osw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fos != null) {
                        try {
                            fos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    private static File getSDCardFolder() {
        File root = null;
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
            root = Environment.getExternalStorageDirectory();
        } else {
            root = Environment.getDataDirectory();
        }

        return root;
    }

    private static File getKyeRootFolder() {
        File root = new File(getSDCardFolder(), "kye");
        if (!root.exists()) {
            root.mkdirs();
        }

        return root;
    }
}
