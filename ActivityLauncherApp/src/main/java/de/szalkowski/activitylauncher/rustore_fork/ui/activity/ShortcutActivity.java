package de.szalkowski.activitylauncher.rustore_fork.ui.activity;

import static org.thirdparty.Launcher.launchActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class ShortcutActivity extends BaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Intent launchIntent = Intent.parseUri(getIntent().getStringExtra("extra_intent"), 0);
            launchActivity(this, launchIntent.getComponent(), false, false);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            finish();
        }
    }
}
