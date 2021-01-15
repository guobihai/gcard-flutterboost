package com.gcard.flutterboost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flutter_text);

        findViewById(R.id.button).setOnClickListener(v -> {
            //默认启动模式
            Map<String, Object> param = new HashMap<>();
            param.put("name", "hello key");
            PageRouter.openPageByUrl(this, "homeGallery", param);
        });

        findViewById(R.id.btnGallery).setOnClickListener(v -> {
            Map<String, Object> param = new HashMap<>();
            param.put("name", "hello key");
            PageRouter.openPageByUrl(this, "home", param);
        });

        findViewById(R.id.btnCache).setOnClickListener(v -> {
            startActivity(new Intent(this, FlutterFragmentPageActivity.class));
        });
    }
}