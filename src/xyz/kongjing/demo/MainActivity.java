
package xyz.kongjing.demo;

import xyz.kongjing.R;
import xyz.kongjing.titlebar.base.BaseToolbarActivity;

import android.os.Bundle;

/**
 * Demo 主界面
 */
public class MainActivity extends BaseToolbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToolbar(R.string.app_name, R.drawable.back_arrow);
        showBackIcon(true);
//        setTitle("标题");
//        showBackwardView(R.string.text_back,true);
//        showForwardView(R.string.text_forward, true);

    }
}
