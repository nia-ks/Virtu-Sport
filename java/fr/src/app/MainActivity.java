package fr.src.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import fr.src.app.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private TextView mWelcomeText;
    private Button mLoginButton;
    private Button mRegisterButton;
    private ImageView mLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWelcomeText= findViewById(R.id.main_welcome_text);
        mLoginButton = findViewById(R.id.main_button);
        mRegisterButton = findViewById(R.id.main_button2);
        mLogo = findViewById(R.id.main_imageView);
        mLogo.setAlpha(0.4f);
        mLoginButton.setEnabled(true);
        mRegisterButton.setEnabled(true);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginActivityIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginActivityIntent);
            }
        });
      mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerActivityIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(registerActivityIntent);
            }
        });
    }
}