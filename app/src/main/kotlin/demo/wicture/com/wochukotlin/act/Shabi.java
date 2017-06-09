package demo.wicture.com.wochukotlin.act;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

/**
 * 用来测试kotlin语法对应java语法
 * Created by qianpeng on 2017/6/8.
 */

public class Shabi extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        new Dialog(this);
    }

  
}
