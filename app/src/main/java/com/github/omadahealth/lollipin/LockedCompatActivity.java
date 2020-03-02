package com.github.omadahealth.lollipin;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.github.omadahealth.lollipin.lib.PinCompatActivity;
import lollipin.orangegangsters.github.com.lollipin.R;

/**
 * Created by callmepeanut on 16-1-14.
 */
public class LockedCompatActivity extends PinCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compat_locked);
        initView();
    }

    private void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.id_toolbar);
        setSupportActionBar(toolbar);

        toolbar.setTitle("Title");
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        toolbar.setSubtitle("SubTitle");
        toolbar.setSubtitleTextColor(getResources().getColor(android.R.color.white));
        toolbar.setLogo(R.drawable.ic_launcher);
        toolbar.setNavigationIcon(R.drawable.ic_menu_white_36dp);
    }
}
