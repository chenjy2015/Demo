package com.example.base.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;

import com.blankj.utilcode.utils.ConstUtils;
import com.blankj.utilcode.utils.FileUtils;
import com.example.base.ImageBean;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ImageUtils {




    /**
     * 将bitmap转化为字符串,转化过程中进行质量压缩,默认为大于150KB则压缩
     *
     * @param image
     * @return
     */
    public static String bitmaptoString(Bitmap image) {
        return bitmaptoString(image, 150);
    }

    /**
     * 将bitmap转化为字符串,转化过程中进行质量压缩
     *
     * @param image
     * @param minImageSize 图片压缩的标准 ,KB
     * @return
     */
    public static String bitmaptoString(Bitmap image, int minImageSize) {
        return bitmaptoString(image, minImageSize, Base64.NO_WRAP);

    }

    /**
     * 将bitmap转化为字符串,转化过程中进行质量压缩
     *
     * @param image
     * @param minImageSize 图片压缩的标准 ,KB
     * @param flags        BASE64压缩的格式
     * @return
     */
    public static String bitmaptoString(Bitmap image, int minImageSize, int flags) {

        int quality = getQuality(getSize(image), minImageSize);//根据图像的大小得到合适的有损压缩质量

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, quality, baos);
        byte[] bytes = baos.toByteArray();
        String s = Base64.encodeToString(bytes, flags);
        return s;
    }

    /**
     * 获取一个bitmap在内存中所占的大小
     *
     * @param image
     * @return
     */
    private static int getSize(Bitmap image) {
        int size = 0;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {    //API 19
            size = image.getAllocationByteCount();
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1) {//API 12
            size = image.getByteCount();
        } else {
            size = image.getRowBytes() * image.getHeight();
        }
        return size;
    }

    /**
     * 根据图像的大小得到合适的有损压缩质量，因为此时传入的bitmap大小已经比较合适了，靠近1000*1000，所以根据其内存大小进行质量压缩
     *
     * @param size
     * @return
     */
    private static int getQuality(int size, int minImageSize) {
        int mb = size >> 20;//除以100万，也就是m
        int kb = size >> 10;
        if (mb > 70) {
            return 17;
        } else if (mb > 50) {
            return 20;
        } else if (mb > 40) {
            return 25;
        } else if (mb > 20) {
            return 40;
        } else if (mb > 10) {
            return 50;
        } else if (mb > 3) {//目标压缩大小 100k，这里可根据实际情况来判断
            return 50;
        } else if (mb >= 2) {
            return 60;
        } else if (kb > 1500) {
            return 70;
        } else if (kb > 1000) {
            return 80;
        } else if (kb > 500) {
            return 85;
        } else if (kb > 150) {
            return 90;
        } else {
            return 100;
        }
    }


    /**
     * 获得本地图片,获取过程中做了尺寸压缩
     *
     * @param imagePath 图片的本地路径
     * @return
     */
    public static Bitmap getBitmap(String imagePath) {
        return getBitmap(imagePath, 480, 800, 100);
    }

    /**
     * 获得本地图片,获取过程中做了尺寸压缩
     *
     * @param imagePath   图片的本地路径
     * @param reqWidth    压缩后期望的宽
     * @param reqHeight   压缩后期望的高
     * @param minFileSize 文件小于这个值不做尺寸压缩
     * @return
     */
    public static Bitmap getBitmap(String imagePath, int reqWidth, int reqHeight, long minFileSize) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        //      通过这个Bitmap获得图片的宽高
        BitmapFactory.decodeFile(imagePath, options);

        //      计算压缩值
        int compressSize = calculateInSampleSize(options, reqWidth, reqHeight, imagePath, minFileSize);
        options.inSampleSize = compressSize;
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        //      获得图片
        return BitmapFactory.decodeFile(imagePath, options);
    }

    /**
     * 保存并覆盖之前的图片图片
     *
     * @param bmp      原图bitmap对象
     * @param path     原图路径
     * @param filename 原图名称
     * @param quality  压缩比例
     */
    // 保存图片
    public static void saveImage(Bitmap bmp, String path, String filename,
                                 int quality) {
        if (bmp != null) {
            try {

                File f = new File(path);
                if (!f.exists()) {
                    f.mkdirs();
                }
                /* 保存相片文件 */
                File n = null;
                n = new File(f, filename);

                FileOutputStream bos = new FileOutputStream(n.getAbsolutePath());

				/* 文件转换 */
                bmp.compress(Bitmap.CompressFormat.JPEG, quality, bos);
                /* 调用flush()方法，更新BufferStream */
                bos.flush();
                /* 结束OutputStream */
                bos.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (bmp != null && !bmp.isRecycled()) {
            bmp = null;
        }
    }


    /**
     * 第一：质量压缩法 按质量比例压缩图片
     *
     * @param image   原图片
     * @param maxSize 目标大小 单位：KB
     * @return
     */
    public static Bitmap compressImage(Bitmap image, int maxSize) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.JPEG, 100, baos);//质量压缩方法，这里100表示不压缩，把压缩后的数据存放到baos中
        int options = 100;
        while (baos.toByteArray().length / 1024 > maxSize) {    //循环判断如果压缩后图片是否大于100kb,大于继续压缩
            baos.reset();//重置baos即清空baos
            options -= 10;//每次都减少10
            image.compress(Bitmap.CompressFormat.JPEG, options, baos);//这里压缩options%，把压缩后的数据存放到baos中
        }
        image.recycle();
        ByteArrayInputStream isBm = new ByteArrayInputStream(baos.toByteArray());//把压缩后的数据baos存放到ByteArrayInputStream中
        Bitmap bitmap = BitmapFactory.decodeStream(isBm, null, null);//把ByteArrayInputStream数据生成图片
        //        Bitmap bitmap = BitmapFactory.decodeByteArray(baos.toByteArray(), 0, baos.size());
        return bitmap;
    }

    /**
     * 基于质量的压缩算法， 此方法未 解决压缩后图像失真问题
     * <br> 可先调用比例压缩适当压缩图片后，再调用此方法可解决上述问题
     *
     * @param bitmap
     * @param maxBytes 压缩后的图像最大大小 单位为byte
     * @return
     */
    public final static Bitmap compressBitmap(Bitmap bitmap, long maxBytes) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
            int options = 90;
            while (baos.toByteArray().length > maxBytes) {
                baos.reset();
                bitmap.compress(Bitmap.CompressFormat.PNG, options, baos);
                if (options <= 0) {
                    break;
                } else {
                    options -= 10;
                }
            }
            byte[] bts = baos.toByteArray();
            Bitmap bmp = BitmapFactory.decodeByteArray(bts, 0, bts.length);
            baos.close();
            return bmp;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 第二：图片按比例大小压缩方法（根据路径获取图片并压缩）：
     * 默认会调用质量比例压缩方法
     *
     * @param srcPath
     * @return
     */
    public static Bitmap getimage(String srcPath, int maxSize) {
        BitmapFactory.Options newOpts = new BitmapFactory.Options();
        //开始读入图片，此时把options.inJustDecodeBounds 设回true了
        newOpts.inJustDecodeBounds = true;
        Bitmap bitmap = BitmapFactory.decodeFile(srcPath, newOpts);//此时返回bm为空

        newOpts.inJustDecodeBounds = false;
        int w = newOpts.outWidth;
        int h = newOpts.outHeight;
        //现在主流手机比较多是800*480分辨率，所以高和宽我们设置为
        float hh = 800f;//这里设置高度为800f
        float ww = 480f;//这里设置宽度为480f
        //缩放比。由于是固定比例缩放，只用高或者宽其中一个数据进行计算即可
        int be = 1;//be=1表示不缩放
        if (w > h && w > ww) {//如果宽度大的话根据宽度固定大小缩放
            be = (int) (newOpts.outWidth / ww);
        } else if (w < h && h > hh) {//如果高度高的话根据宽度固定大小缩放 // 这里再进行质量压缩的意义不大，反而耗资源，删除
            be = (int) (newOpts.outHeight / hh);
        }
        if (be <= 0)
            be = 1;
        newOpts.inSampleSize = be;//设置缩放比例
        //重新读入图片，注意此时已经把options.inJustDecodeBounds 设回false了
        bitmap = BitmapFactory.decodeFile(srcPath, newOpts);
        //        compressImage(bitmap, maxSize);//压缩好比例大小后再进行质量压缩
        return bitmap;
    }

    /**
     * 第三：图片按比例大小压缩方法（根据Bitmap图片压缩）：
     * 默认会调用质量比例压缩方法
     *
     * @param image
     * @param maxSize 图片目标大小 单位:KB
     * @return
     */
    public static Bitmap comp(Bitmap image, int maxSize) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.PNG, 100, baos);
        if (baos.toByteArray().length / 1024 > maxSize) {//判断如果图片大于1M,进行压缩避免在生成图片（BitmapFactory.decodeStream）时溢出
            baos.reset();//重置baos即清空baos
            image.compress(Bitmap.CompressFormat.PNG, 50, baos);//这里压缩50%，把压缩后的数据存放到baos中
        }
        ByteArrayInputStream isBm = new ByteArrayInputStream(baos.toByteArray());
        BitmapFactory.Options newOpts = new BitmapFactory.Options();
        //开始读入图片，此时把options.inJustDecodeBounds 设回true了
        newOpts.inJustDecodeBounds = true;
        Bitmap bitmap = BitmapFactory.decodeStream(isBm, null, newOpts);
        newOpts.inJustDecodeBounds = false;
        int w = newOpts.outWidth;
        int h = newOpts.outHeight;
        //现在主流手机比较多是800*480分辨率，所以高和宽我们设置为
        float hh = 800f;//这里设置高度为800f
        float ww = 480f;//这里设置宽度为480f
        //缩放比。由于是固定比例缩放，只用高或者宽其中一个数据进行计算即可
        int be = 1;//be=1表示不缩放
        if (w > h && w > ww) {//如果宽度大的话根据宽度固定大小缩放
            be = (int) (newOpts.outWidth / ww);
        } else if (w < h && h > hh) {//如果高度高的话根据宽度固定大小缩放
            be = (int) (newOpts.outHeight / hh);
        }
        if (be <= 0)
            be = 1;
        newOpts.inSampleSize = be;//设置缩放比例
        newOpts.inPreferredConfig = Bitmap.Config.RGB_565;//降低图片从ARGB888到RGB565
        //重新读入图片，注意此时已经把options.inJustDecodeBounds 设回false了
        isBm = new ByteArrayInputStream(baos.toByteArray());
        bitmap = BitmapFactory.decodeStream(isBm, null, newOpts);
        //        return compressImage(bitmap, maxSize);//压缩好比例大小后再进行质量压缩 // 这里再进行质量压缩的意义不大，反而耗资源，删除
        return bitmap;
    }

    /**
     * 计算图片的缩放值
     *
     * @param options
     * @param reqWidth    压缩后期望的宽
     * @param reqHeight   压缩后期望的高
     * @param filePath    图片文件路径
     * @param minFileSize 图片期望最小的大小
     * @return 最小值为1, 表示不压缩;若为2,表示长宽各位原来的1/2;
     */
    public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight, String filePath, long minFileSize) {
        long fileSize = (long) FileUtils.getFileSize(new File(filePath), ConstUtils.MemoryUnit.BYTE);
        int height = options.outHeight;
        int width = options.outWidth;

        if (width > height) { //当图片的宽大于高时,交换宽,高的值
            int temp = height;
            height = width;
            width = temp;
        }
        int inSampleSize = 1;
        if (height > reqHeight || width > reqWidth) {
            final int heightRatio = Math.round((float) height / (float) reqHeight + 0.5f);
            final int widthRatio = Math.round((float) width / (float) reqWidth + 0.5f);
            inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
        }
        if (fileSize / 1024 <= minFileSize) {//图片小于期望值,不压缩
            return 1;
        } else if (fileSize / 1024 <= (300 + minFileSize)) {
            return inSampleSize < 1 ? 1 : inSampleSize;
        } else {//图片比期望值大300Kb时,长,宽至少压缩1/2
            return inSampleSize < 2 ? 2 : inSampleSize;
        }

    }

    /**
     * 回收bitmap图片
     *
     * @param bitmap
     */
    public static void recycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public static void saveImageToGallery(Context context, Bitmap bmp) {
        // 首先保存图片
        File appDir = new File(Environment.getExternalStorageDirectory(), "kyeImage");
        if (!appDir.exists()) {
            appDir.mkdir();
        }
        String fileName = System.currentTimeMillis() + ".jpg";
        File file = new File(appDir, fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 其次把文件插入到系统图库
        try {
            MediaStore.Images.Media.insertImage(context.getContentResolver(),
                    file.getAbsolutePath(), fileName, null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 最后通知图库更新
        context.sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://" + Environment.getExternalStorageDirectory())));
    }

    public static String saveImageToGalleryBackPath(Context context, Bitmap bmp) {
        // 首先保存图片
        File appDir = new File(Environment.getExternalStorageDirectory(), "kyeImage");
        if (!appDir.exists()) {
            appDir.mkdir();
        }
        String fileName = System.currentTimeMillis() + ".jpg";
        File file = new File(appDir, fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 其次把文件插入到系统图库
        try {
            MediaStore.Images.Media.insertImage(context.getContentResolver(),
                    file.getAbsolutePath(), fileName, null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 最后通知图库更新
        context.sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://" + Environment.getExternalStorageDirectory())));
        return file.getAbsolutePath();
    }

    /**
     * 字节数组转Bitmap
     *
     * @param base64String
     * @return
     */
    public static Bitmap Base64StringToBitmap(String base64String) {
        if (TextUtils.isEmpty(base64String)) {
            return null;
        }
        byte[] b = Base64.decode(base64String, Base64.NO_WRAP);
        return (b == null || b.length == 0) ? null : BitmapFactory.decodeByteArray(b, 0, b.length);
    }

    /**
     * 字节数组转Bitmap
     *
     * @param base64String
     * @return
     */
    public static Bitmap Base64StringToBitmap2(String base64String) {
        if (TextUtils.isEmpty(base64String)) {
            return null;
        }
        byte[] bitmapArray = Base64.decode(base64String, Base64.DEFAULT);
        Bitmap bitmap = BitmapFactory.decodeByteArray(bitmapArray, 0, bitmapArray.length);
        return bitmap;
    }

    /**
     * 获取相册图片
     *
     * @param context
     * @return
     */
    public static ArrayList<ImageBean> getImages(Context context) {
        ArrayList<ImageBean> list = new ArrayList<ImageBean>();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        String[] projection = {MediaStore.Images.Media._ID, MediaStore.Images.Media.DATA,};
        String sortOrder = MediaStore.Images.Media.DATE_ADDED + " desc";
        Cursor cursor = contentResolver.query(uri, projection, null, null, sortOrder);
        int iId = cursor.getColumnIndex(MediaStore.Images.Media._ID);
        int iPath = cursor.getColumnIndex(MediaStore.Images.Media.DATA);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String id = cursor.getString(iId);
            String path = cursor.getString(iPath);
            ImageBean imageModel = new ImageBean(id, path);
            list.add(imageModel);
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }

    /**
     * 删除SD卡或者手机的缓存图片和目录
     */
    public static void deleteFile(String imagePath) {
        File dirFile = new File(imagePath);
        if (!dirFile.exists()) {
            return;
        }
        if (dirFile.isDirectory()) {
            String[] children = dirFile.list();
            for (int i = 0; i < children.length; i++) {
                new File(dirFile, children[i]).delete();
            }
        }
        dirFile.delete();
    }

}
