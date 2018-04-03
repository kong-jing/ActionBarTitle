package xyz.kongjing.titlebar.base;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import xyz.kongjing.R;


/**
 * @description 基础的 toolbar 工具类
 * @author kongjing
 * @date 17/11/13
 */
public abstract class BaseToolbarActivity extends AppCompatActivity {
    //step5 toolbar使用
    public Toolbar toolbar;
    int backIconRes;
    public ImageView mRightBtn;
    public TextView mRightText;
    private boolean isShowBackIcon;
    public TextView mTitleText;




    public void showToolbar(int titleResid, int backIconRes) {
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        mRightBtn = (ImageView) findViewById(R.id.ivRightToolBar);
        mRightText = (TextView) findViewById(R.id.tvRightToolBar);
        mTitleText = (TextView) findViewById(R.id.tvToolBar);
        this.backIconRes = backIconRes;
        if (toolbar != null) {

            toolbar.setTitle("");
            mTitleText.setText(titleResid);
            // toolbar.setTitleTextColor(getResources().getColor(titleColorRes));

            mRightBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onRightClick(v);
                }
            });
            mRightText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onRightClick(v);
                }
            });
            toolbar.showOverflowMenu();
            setSupportActionBar(toolbar);
        }
    }

    public void showBackIcon(boolean isShowBackIcon) {
        this.isShowBackIcon = isShowBackIcon;
        if (isShowBackIcon&&toolbar!=null) {
            //toolbar.setNavigationIcon(R.mipmap.toolbar_back);
            toolbar.setNavigationIcon(backIconRes);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
        }
    }

    public void setRightBtnIcon(Drawable icon) {
        if (toolbar != null && mRightBtn != null) {
            if (mRightText != null) mRightText.setVisibility(View.GONE);
            mRightBtn.setVisibility(View.VISIBLE);
            mRightBtn.setImageDrawable(icon);
        }
    }

    public void setRightText(int resId) {
        setRightText(getResources().getString(resId));
    }

    public void setRightText(String text) {
        if (toolbar != null && mRightText != null) {
            if (!TextUtils.isEmpty(text)) {
                mRightText.setVisibility(View.VISIBLE);
                mRightText.setText(text);
                if (mRightBtn != null) mRightBtn.setVisibility(View.GONE);
            } else {
                mRightText.setVisibility(View.GONE);

                if (mRightBtn != null) mRightBtn.setVisibility(View.GONE);
            }

        }
    }

    public void setRightBackground(int resId) {
        if (toolbar != null && mRightText != null) {
            mRightText.setVisibility(View.VISIBLE);
            mRightText.setBackgroundResource(resId);
            if (mRightBtn != null) mRightBtn.setVisibility(View.GONE);
        }
    }

    public void setRightBtnIcon(int iconResID) {
        setRightBtnIcon(getResources().getDrawable(iconResID));
    }


    public void onRightClick(View v) {

    }
}