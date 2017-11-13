
package xyz.kongjing.ui;

import xyz.kongjing.widget.TitleActivity;

import android.os.Bundle;

public class MainActivity extends TitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("标题");
        showBackwardView(R.string.text_back,true);
        showForwardView(R.string.text_forward, true);

    }
}
