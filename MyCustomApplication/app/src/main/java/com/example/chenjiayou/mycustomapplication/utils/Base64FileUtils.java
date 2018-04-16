package com.example.chenjiayou.mycustomapplication.utils;

import android.util.Base64;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version V1.0
 * @createAuthor yzw
 * @createDate 2016/7/12 19:51
 * @updateAuthor
 * @updateDate
 * @company 跨越速运
 * @description base64字符串操作工具 可以保存在本地为一个文件 ，本地文件转换成base64字符串
 * @copyright copyright(c)2016 Shenzhen Kye Technology Co., Ltd. Inc. All rights reserved.
 */
public class Base64FileUtils {


    /**
     * 保存文件到本地
     *
     * @param path                文件路径
     * @param fileName            文件名
     * @param base64DecodeContent
     */
    public static void saveFileToLocal(String path, String fileName, String base64DecodeContent) {
        File dirfile = new File(path);
        if (!dirfile.exists()){
            dirfile.mkdirs();
        }
        saveFileToLocal(new File(path, fileName), base64DecodeContent);
    }

    /**
     * 保存文件到本地
     *
     * @param targetFile          文件路径
     * @param base64DecodeContent
     * @return true 保存成功
     */
    public static boolean saveFileToLocal(File targetFile, String base64DecodeContent) {
        boolean result = false;
        if (targetFile.exists()) {
            targetFile.delete();
        }
        try {
            targetFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] fileByte = Base64.decode(base64DecodeContent, Base64.NO_WRAP);
        try {
            FileOutputStream fos = new FileOutputStream(targetFile);
            fos.write(fileByte);
            fos.flush();
            fos.close();
            result = true;
        } catch (FileNotFoundException e) {
            result = false;
        } catch (IOException e) {
            result = false;
        }
        return result;
    }

    /**
     * 文件转换成base64字符串
     *
     * @param path
     * @return
     */
    public static String fileToBase64String(String path) {
        if (path == null) {
            return null;
        }
        File targetFile = new File(path);
        byte[] byteFile = getBytesFromFile(targetFile);
        if (byteFile != null) {
            return Base64.encodeToString(byteFile, Base64.NO_WRAP);
        }
        return null;
    }

    /**
     * 文件转化为字节数组
     *
     * @param file
     * @return
     */
    public static byte[] getBytesFromFile(File file) {
        byte[] ret = null;
        try {
            if (file == null) {
                // log.error("helper:the file is null!");
                return null;
            }
            FileInputStream in = new FileInputStream(file);
            ByteArrayOutputStream out = new ByteArrayOutputStream(4096);
            byte[] b = new byte[4096];
            int n;
            while ((n = in.read(b)) != -1) {
                out.write(b, 0, n);
            }
            in.close();
            out.close();
            ret = out.toByteArray();
        } catch (IOException e) {
            // log.error("helper:get bytes from file process error!");
            e.printStackTrace();
        }
        return ret;
    }
}
