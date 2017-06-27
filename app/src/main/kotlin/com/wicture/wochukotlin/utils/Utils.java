package com.wicture.wochukotlin.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    /**
     * 获取终端SDK版本
     *
     * @return
     */
    public static int getTerminalSDKVersion() {
        // TODO Auto-generated method stub
        return Build.VERSION.SDK_INT;
    }

    /**
     * 获取当前版本
     *
     * @param cont
     * @return
     */
    public static String getVersion(Context cont) {
        PackageManager packageManager = cont.getPackageManager();
        try {
            PackageInfo info = packageManager.getPackageInfo(cont.getPackageName(), 0);
            return info != null ? info.versionName : "";
        } catch (NameNotFoundException e) {
            return "";
        }
    }

    /**
     * 获取当前版本号 code
     *
     * @return
     */
    public static int getVersionCode(Context mContext) {
        int versionCode = 1;
        try {
            PackageInfo info = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0);
            versionCode = info.versionCode;
        } catch (NameNotFoundException e) {
            e.printStackTrace(System.err);
        }
        return versionCode;
    }

    /**
     * 获取 IMSI id码 （默认88888888888）
     *
     * @param cont
     * @return
     */
    public static String getImsiid(Context cont) {
        TelephonyManager tphoneMamager = (TelephonyManager) cont.getSystemService(Context.TELEPHONY_SERVICE);
        return tphoneMamager.getSubscriberId() != null ? tphoneMamager.getSubscriberId() : "88888888888";
    }

    /**
     * 获取设备码（默认88888888888）
     *
     * @param cont
     * @return
     */
    public static String getDeviceid(Context cont) {
        try {


            TelephonyManager tphoneMamager = (TelephonyManager) cont.getSystemService(Context.TELEPHONY_SERVICE);
            return tphoneMamager.getDeviceId() != null ? tphoneMamager.getDeviceId() : "88888888888";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 屏幕的宽dp
     *
     * @param cont
     * @return
     */
    public static int getWindowWidth(Context cont) {
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager wm = (WindowManager) cont.getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;// 屏幕的宽dp
    }

    /**
     * // 屏幕的高dp
     *
     * @param cont
     * @return
     */
    public static int getWindowHeight(Activity cont) {
        DisplayMetrics metrics = new DisplayMetrics();
        cont.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.heightPixels;// 屏幕的高dp
    }

    /**
     * 获取屏幕比例
     *
     * @param cont
     * @return
     */
    public static String getWindowWH(Context cont) {
        DisplayMetrics metric = new DisplayMetrics();
        ((Activity) cont).getWindowManager().getDefaultDisplay().getMetrics(metric);
        int width = metric.widthPixels; // 屏幕宽度（像素）
        int height = metric.heightPixels; // 屏幕高度（像素）
        return width + "*" + height;
    }

    /**
     * 显示输入法
     *
     * @param cont
     */
    public static void showSoftInput(Activity cont) {
        cont.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE | WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

    /**
     * 隐藏输入法
     *
     * @param cont
     */
    public static void hideSoftInput(Activity cont) {
        cont.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
    }

    /**
     * 制作二维码
     *
     * @param img
     * @param url
     * @param width
     * @param height
     */
//    public static void createQRImage(ImageView img, String url, int width, int height) {
//        try {
//            int QR_WIDTH = width;
//            int QR_HEIGHT = height;
//            //判断URL合法性
//            if (url == null || "".equals(url) || url.length() < 1) {
//                return;
//            }
//            Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
//            hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
//            //图像数据转换，使用了矩阵转换
//            BitMatrix bitMatrix = new QRCodeWriter().encode(url, BarcodeFormat.QR_CODE, QR_WIDTH, QR_HEIGHT, hints);
//            int[] pixels = new int[QR_WIDTH * QR_HEIGHT];
//            //下面这里按照二维码的算法，逐个生成二维码的图片，
//            //两个for循环是图片横列扫描的结果
//            for (int y = 0; y < QR_HEIGHT; y++) {
//                for (int x = 0; x < QR_WIDTH; x++) {
//                    if (bitMatrix.get(x, y)) {
//                        pixels[y * QR_WIDTH + x] = 0xff000000;
//                    } else {
//                        pixels[y * QR_WIDTH + x] = 0xffffffff;
//                    }
//                }
//            }
//            //生成二维码图片的格式，使用ARGB_8888
//            Bitmap bitmap = Bitmap.createBitmap(QR_WIDTH, QR_HEIGHT, Bitmap.Config.ARGB_8888);
//            bitmap.setPixels(pixels, 0, QR_WIDTH, 0, 0, QR_WIDTH, QR_HEIGHT);
//            //显示到一个ImageView上面
//            img.setImageBitmap(bitmap);
//        } catch (WriterException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * 若账号密码登陆接口下发msg中包含Unicode码，将其转换为可读的字符输出
     *
     * @param read
     * @return
     * @author wwei
     */
    public static String transUnicodeToString(String read) {
        // TODO Auto-generated method stub
        Pattern mPattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");
        Matcher mMatcher = mPattern.matcher(read);
        char tempChar;
        while (mMatcher.find()) {
            tempChar = (char) Integer.parseInt(mMatcher.group(2), 16);
            read = read.replace(mMatcher.group(1), tempChar + "");
        }
        return read;
    }

    public static String formatDistance(double param) {
        String distance = "";
        DecimalFormat df = new DecimalFormat("#.#");
        if (param < 1 && param >= 0) {
            param = param * 1000;
            if (param <= 100) {
                distance = "100米内";
            } else {
                distance = df.format(param) + "米内";
            }
        } else {
            distance = df.format(param) + "公里内";
        }
        return distance;
    }

    /**
     * 两次点击的时间间隔
     */
    private static long lastClickTime;

    public static boolean isFastDoubleClick() {
        long time = System.currentTimeMillis();
        long timeD = time - lastClickTime;
        if (0 < timeD && timeD < 10000) {
            lastClickTime = time;
            return false;
        }
        return true;
    }

    public static void dialPhoneNumber(String phoneNumber, Context context) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    /**
     * 分页使用
     *
     * @param cou 总条目
     * @param pag 每页条目数量
     * @return
     */
    private static int getPageSize(int cou, int pag) {
        if (cou % pag == 0) {
            return cou / pag;
        } else {
            return cou / pag + 1;
        }
    }

    /**
     * //截取数字
     *
     * @param content
     * @return
     */
    public static String getNumbers(String content) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            return matcher.group(0);
        }
        return "";
    }

    /**
     * 判断链表中是否包含空字符
     *
     * @param list
     * @return
     */
    public static boolean isListHasEmpty(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("")) {
                return true;
            }
            break;
        }
        return false;
    }

    public static List<String> removeEmptyfromList(List<String> list) {
        List<String> tempList = new ArrayList<>();
        for (String s : list
                ) {
            if (s.length() < 1) {
                tempList.add(s);
            }
        }
        list.removeAll(tempList);
        return list;
    }

//    private static boolean isInDistrict(java.util.List<LatLng> mPoints,
//                                        LatLng point) {
//        return SpatialRelationUtil.isPolygonContainsPoint(mPoints, point);
//    }
//
//    public static List<PoiInfo> flatPoints(java.util.List<LatLng> mPoints, List<PoiInfo> poiInfos) {
//        ArrayList<PoiInfo> temp = new ArrayList<>();
//        for (PoiInfo poi : poiInfos) {
//            if (!isInDistrict(mPoints, poi.location)) {
//                temp.add(poi);
////                Log.i("不在范围内",poi.address);
//            }
//
//
//        }
//        poiInfos.removeAll(temp);
//        return poiInfos;
//    }
//
//    public static Observable<PoiInfo> flatPoints_ob(final java.util.List<LatLng> mPoints, List<PoiInfo> poiInfos) {
//        return Observable.from(poiInfos).filter(new Func1<PoiInfo, Boolean>() {
//            @Override
//            public Boolean call(PoiInfo poiInfo) {
//                return isInDistrict(mPoints, poiInfo.location);
//            }
//        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
//    }

}