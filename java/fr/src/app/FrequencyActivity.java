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

public class FrequencyActivity extends AppCompatActivity {

    private Button mOne;
    private Button mTwo;
    private Button mThree;
    private Button mFour;
    private Button mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequency);

        mOne= findViewById(R.id.freq_one);
        mTwo= findViewById(R.id. freq_two);
        mThree = findViewById(R.id.freq_three);
        mFour = findViewById(R.id.freq_four);
        mNext = findViewById(R.id.freq_next);

        mNext.setEnabled(false);
        mOne.setEnabled(true);
        mTwo.setEnabled(true);
        mThree.setEnabled(true);
        mFour.setEnabled(true);



        mOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOne.setAlpha(1f);
                mTwo.setAlpha(0.4f);
                mThree.setAlpha(0.4f);
                mFour.setAlpha(0.4f);
                mNext.setEnabled(true);
            }
        });

        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOne.setAlpha(0.4f);
                mTwo.setAlpha(1f);
                mThree.setAlpha(0.4f);
                mFour.setAlpha(0.4f);
                mNext.setEnabled(true);
            }
        });

        mThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOne.setAlpha(0.4f);
                mTwo.setAlpha(0.4f);
                mThree.setAlpha(1f);
                mFour.setAlpha(0.4f);
                mNext.setEnabled(true);
            }
        });

        mFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOne.setAlpha(0.4f);
                mTwo.setAlpha(0.4f);
                mThree.setAlpha(0.4f);
                mFour.setAlpha(1f);
                mNext.setEnabled(true);
            }
        });


        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent sportsActivityIntent = new Intent(FrequencyActivity.this, FavSportsActivity.class);
                startActivity(sportsActivityIntent);

            }
        });
    }
}