package com.example.recicladotandil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView signUpButton;
    private ImageView searchButton;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUpButton = findViewById(R.id.button_signup);
        searchButton = findViewById(R.id.button_punto);
        loginButton = findViewById(R.id.login);

        initListener();
    }

    private void initListener() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CreateUser.class);
                startActivity(intent);
            }
        });
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.setComponent(ComponentName.unflattenFromString("com.android.chrome/com.android.chrome.Main"));
                    intent.addCategory("android.intent.category.LAUNCHER");
                    intent.setData(Uri.parse(getString(R.string.pnto_limpio_tandil)));
                    startActivity(intent);
                }
                catch(ActivityNotFoundException e) {
                    // Chrome is not installed
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.pnto_limpio_tandil)));
                    startActivity(intent);
                }
            }
        });
    }
}
