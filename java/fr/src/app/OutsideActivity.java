package fr.src.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class OutsideActivity extends AppCompatActivity {

    private Button mYes;
    private Button mNo;
    private Button mNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outside);
        mYes= findViewById(R.id.outside_yes);
        mNo= findViewById(R.id. outside_no);
        mNext = findViewById(R.id.outside_next);

        mNext.setEnabled(false);
        mYes.setEnabled(true);
        mNo.setEnabled(true);



        mNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNo.setAlpha(1f);
                mYes.setAlpha(0.4f);
                mNext.setEnabled(true);
            }
        });

        mYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mYes.setAlpha(1f);
                mNo.setAlpha(0.4f);
                mNext.setEnabled(true);
            }
        });


        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent objActivityIntent = new Intent(OutsideActivity.this, DistanceActivity.class);
                startActivity(objActivityIntent);

            }
        });

    }
}