package com.wicture.wochu.utils;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
//                                      LWKKKKKKKWKKEGGDEEGGDfLEEKDLDKEEKDEGGEKKEDKG:
//                                     i##W######EEKKW######LEKLLD#fGKKK#EEEKDGE#WK#K
//                                     E#####WWEDK###########K#KfGDGf#EEKEKDLDDKK###KD:
//                                    jW#####EDW#########W######K#fLLW#LGLDG#DGGDKWW#Kt
//                                 .####K###DG######KEKW###KKKKE##LtDEKffLD##KDEGEKKW#Wj
//                                ,#;DG####DK####DDLGGGGED###GEDD#WtDDDLftD###KLLGGKDDEWG
//                                G.,KK###EK###KtiLKKW##KKDD##GDD##tDKL#;D#K#EGffLKK#####f
//                               ;f; E###KW###DfLK#########KLDKLE##DG#f#tD###Kf;G#########
//                               ;D  K##KE###DLjD######W#W##KfLEtK##E#DDGWE##EtE#KE#######t
//                               ;L :W#WK##KDKLKK#######KW##EDDfDt##K#DEE#K##Df#DK#########
//                                ffDKDK##WfKLKW############KffEftL#K#KKK#E##G#Gf#EK#######;
//                                 D###KKKDKEKW###############fjDGtD##K#W#DK#K#t#DEK#W###W#D
//                               G######WW############KK#####KEffGjGW#KK#EGW##KK#LLW####W###
//                              t#########################KWWGfKEDKfK##K#Gj#W####GfLK####W#K
//                               Lf#K###################WKDDWKWKEGfLGGGGEDDtfD##EEKEDW##WW##
//                              :#########################DtGLfLi;ii;;itGLGtjGW#KLt;fK#####E
//                             ;W############W###########EjGtii,:,: .::,iGGtitGW#WKWDGK#K##t
//                             :E####WW#################KGLi,,:,:   ..:,iiLi:;iGKDiL##KW###
//                              L##W############W######KGfti;,:.     ...:,;,::,ifEKDGW#E###
//                             f####WW#######KWW#WW##EKGjti,::.       ..:,,:::::,LW#EGDf##L
//                             ##EW#KWKW###WK##KEEDLGGj;,::...       . ..::...::,;G#DDEEW#;
//                             ##ijfDEW###EE##f,,,,,;i,:::....         .......::,,tKELWW##i
//                           j#####DGGGD#EK#Wt:::,,,,::::......      .........:::,tGELK###;
//                          D#E#DG######WW#G,.::::,:...........  .     ........:::tDDfE###.
//                        :#Ei##EKt:jDtEWD,.:::::,,;i;,.    ..    .  ..........:::tKKDL#KWf
//                       t#t ###ftWtLLDEf,:,::::::,:;itL;,.  ..     .........:.::,jK#DK#KEt
//                     D#f ,W###E .,:,:ii::::.::::,,,::.;tj;. .. . ............::;L##KK#WW;
//                    Lf :iW##K##. .:.:i;,,::::..::,,::...:tf, ...............::;tE###E##K
//                   ;L jL###K####.   :ii;,:::....:,iii;,:. iLi  .......:....::,ijW###K##G
//                    i#####DW##K##Lij:it;,:,:.....:ijEEWGGt,ift:....:..:....:,;tf####W#W;
//                     .f############W;it;,,,::.....:;ffEK#WEfitt,:::::::.::::,;iD######W.
//                        ,#########Kjiiii;,,:::.....,,:tff;tEfiii::::::::::.::;;W#####WD:
//                      :;;#W#######E;tii;;,,::......:,,,;. .fLi;;,::::::::,;fGEK#KW###GE:
//                     ::.#K########E;tii;;,,,:.... ..:,,;;,iit,i::::,::ijLGGGLLE#KWW#KDj
//                     .t;##########E;ti;;;,,,::...  ..:,;iitt,.,,..::jKE##ELtiiW#DW##LLi
//                     :t###KW######E;t;;,;;,,::..   . .:::,::. ,, .:GEEKKff#KjW#KD#W#tLi
//                     . ##D##W#####tit;;,;;,,::...   ....:....::: .iEi,tt :WWK###f#GKL;.
//                      tKL#WDKKK##E;tt;;,;;,,,:...   .::......::: :j:,:,::tKtL#WEG#GfL::
//                      DGWKL##E##D;;tt;,,;;,,,::.........   ...:. ,t::,iitGj;LfWLWDtG,..
//                     ;GKWDWEjK#W,i;tt;,,,;,,:::.........  ....:  ;i:::,ifj,tL;ffEjEj;
//                    .EEGtfEfKE#t,;;tt,,,,,,,,:::........  ..... .ii,::::,,,i;t;EjtL:
//                    D#jGGfE#W#K,;;,tt,,,,,,,,,:::.............  .i;,:::,,,;:;.tEiEi
//                   jKf;#tK#DK#;,,;;it,,,,,,,,,:::.....:.::::..  :i;:::::,,it,:GfDj.
//                  :LK:GKKKE##L:,,,;it;,,,:,,:,,:::.:::::.::::   ,i;::::,,ii. GGLL;
//                   EE:#EGW###,,,,,,it;,,:,::::::::::::..:,..:  .,i,::,,:;, jGGLLi
//                   GGEKWK###t,,:,,,iti,,::::::::::::.   ,:...  .,i:::::,;iDEjffi:
//                    j######ti,:,,,,;ti,:,::::::::::...  :i;..  .,;:::,,ifEE;;tt::
//                     DjG##t:,,::,,,,it,,,:::::..:. .....  it,. .i;::,,i,;; .:t:::
//                       ##f:,,,::,,,,;j;,,,::::..:it   ...  ,i.:fj,:,,it   .  i: ,
//                      .#L:,,,::::,,,,tt,,,::::.:: iL,     ..ifLft,,;i: .i:   t  i
//                       j:,,,,::::,,,,;f;,,::::::.  iLji,:... ,;;;;i,f:  .    i  t.
//                     ,i,:::,::::::,,,,tj,,::::::.. ,;iLj;;,:,;,;;i,t#,  t    ;  :;
//                   ,ii,::::,::::::,:,,;ft,,::::.....tt iDDjtttLit,t#f. .:    ,. :;
//                :,ii,:::::,,:..::::::,,ifi,,:::.:...:ji::tjLLGji,t##E  :      : .,
//            .:;;;,,:::::.,::.....:::::,,tf;,,::......:jt;,,iLf;;:f##f  :      .  ,
//         .,i;;,::::::::.::::..:::::::::,;tj;,:::......,tLjjft;iG K#W:  :         ;
//      :,;;;:::::....::::..::.::::::.::::,;tt;,::.......:,itti G ;KKG:         . .:
//.:,,;;;;,:::::...........::.:.....::.::::,itf,::::.....:::;iiE .DWLG.          ::,
//,;;;,,,,::::.............:.........::.:::,;tjf;:::...:::,,,fWiGLWttE           ;t .
//:,,,,,,,,,,::.::..:......:..........:..::,,iijLi:::::::,,,t#WEfGt jL           ,i
//::...:::,,;,,::::........:.............::,:,ittLj,::::::,f .  ;f iD:           ::
//..:.....::,,;,,::......................::,,:,itjLGfi,,,tD#LG:jD.Lj,            j: .
//.........:::,,i,,::.....:................:::,;ifLLKWKEDEDfDLGKGDtj      .     :t
//

/**
 * Created by qianpeng on 2016/12/21.
 */

public class GlideUtil {
    //重载3个方法，适用于activity环境，fragment环境，context 环境
    //其中 activity和fragment的时候 能够节省资源
    //目前没有适配低分屏的处理，往后加上
    private static int scale = 1;
    public static final int baseSmallWidth = 96;
    public static final int baseMiddleWidth = 220;
    public static final int baseLargeWidth = 540;

    public static void setScale(int dimen){
        scale = dimen;
    }
    public static void setImgFromNet(Activity activity, String url, ImageView targetView, int placeDrawable){
      Glide.get(activity.getApplication()).with(activity).load(url).fitCenter().placeholder(placeDrawable).into(targetView);
   }
    public static void setImgFromNet(Activity activity, String url, ImageView targetView){
        Glide.with(activity).load(url).asBitmap().fitCenter().into(targetView);
    }
    public static void setImgFromNet(Fragment fragment, String url, ImageView targetView, int placeDrawable){
        Glide.with(fragment).load(url).asBitmap().fitCenter().placeholder(placeDrawable).into(targetView);
    }
    public static void setImgFromNet(Fragment fragment, String url, ImageView targetView){
        Glide.with(fragment).load(url).asBitmap().fitCenter().into(targetView);
    }
    public static void setImgFromNet(Context context, String url, ImageView targetView, int placeDrawable){
        Glide.with(context).load(url).asBitmap().fitCenter().placeholder(placeDrawable).into(targetView);
    }
    public static void setImgFromNet(Context context, String url, ImageView targetView){
        Glide.with(context).load(url).asBitmap().fitCenter().into(targetView);
    }
    public static void setImgFromNetNobitmap(Context context, String url, ImageView targetView){
        Glide.with(context).load(url).asBitmap().fitCenter().into(targetView);
    }
    public static void setImgFromNet(Context context, String url, GlideDrawableImageViewTarget targetView){
        Glide.with(context).load(url).fitCenter().into(targetView);

    }

    /**
     *以下的方法为裁剪图片，节省内存资源
     * centercrop会增加内存占用
     */

    public static void setSmallImgFromNet(Context context, String url, ImageView targetView){
        //小图片有的为gif
        if(url!=null&&url.endsWith(".gif")){
            //为gif优化加载
            Glide.with(context).load(url).asGif().override(baseSmallWidth*scale,baseSmallWidth*scale).centerCrop().diskCacheStrategy(DiskCacheStrategy.SOURCE)
                    .into(targetView);
        }else {
            Glide.with(context).load(url).fitCenter().override(baseSmallWidth * scale, baseSmallWidth * scale).into(targetView);//小icon
        }
    }

    public static void setMiddleImgFromNet(Context context, String url, ImageView targetView){
        Glide.with(context).load(url).fitCenter().override(baseMiddleWidth*scale,baseMiddleWidth*scale).into(targetView);//商品预览
    }
    public static void setMiddleImgFromNet(Context context, String url, ImageView targetView, int placeHolder){
        Glide.with(context).load(url).fitCenter().placeholder(placeHolder).override(baseMiddleWidth*scale,baseMiddleWidth*scale).into(targetView);//商品预览
    }
    public static void setLargeImgFromNet(Context context, String url, ImageView targetView){
        Glide.with(context).load(url). skipMemoryCache(true).fitCenter().override(baseLargeWidth*scale,baseMiddleWidth*scale).into(targetView);//活动、轮播图
    }
    public static void setLargeImgFromNet(Context context, String url, ImageView targetView, int placeHolder){
        Glide.with(context).load(url).fitCenter(). skipMemoryCache(true).placeholder(placeHolder).override(baseLargeWidth*scale,baseMiddleWidth*scale).into(targetView);
    }
    public static void clearMemory(Context context) {
        Glide.get(context).clearMemory();

    }
    public static void setImgFromNetAsbitmap(Context context, String url, ImageView targetView){
        Glide.get(context).with(context).load(url).asBitmap().fitCenter().into(targetView);
    }
    public static void setImgFromNetWithSize(Context context, String url, ImageView tagetView, int width, int height){
        Glide.with(context).load(url).asBitmap().override(width,height).fitCenter().into(tagetView);
    }
}