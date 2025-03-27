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

public class FavSportsActivity extends AppCompatActivity {

    private Button mYes;
    private Button mNo;
    private EditText mAnswer;
    private Button mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_sports);

        mYes= findViewById(R.id.sports_yes);
        mNo= findViewById(R.id. sports_no);
        mAnswer= findViewById(R.id.sports_answer);
        mNext = findViewById(R.id.sports_next);

        mNext.setEnabled(false);
        mYes.setEnabled(true);
        mNext.setEnabled(true);



        mYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mYes.setAlpha(1f);
                mNo.setAlpha(0.4f);
                mNext.setEnabled(true);
            }
        });

        mNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mYes.setAlpha(0.4f);
                mNo.setAlpha(1f);
                mNext.setEnabled(true);
            }
        });



        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent homeActivityIntent = new Intent(FavSportsActivity.this, GroupActivity.class);
                startActivity(homeActivityIntent);

            }
        });
    }
}