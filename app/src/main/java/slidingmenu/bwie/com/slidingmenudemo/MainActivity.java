package slidingmenu.bwie.com.slidingmenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SlidingMenu slidingMenu= new SlidingMenu(this);

        //设置侧滑方向
        slidingMenu.setMode(SlidingMenu.LEFT);
        //设置整个屏幕都能滑出
        //  slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        //设置整个屏幕不让滑出
        //  slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
        //设置侧滑宽度
        slidingMenu.setBehindOffset(200);
        //让侧滑依附到activity上
        slidingMenu.attachToActivity(MainActivity.this, SlidingMenu.SLIDING_CONTENT);
        //设置侧滑布局

        slidingMenu.setMenu(R.layout.slidingmenu);

    }
}
