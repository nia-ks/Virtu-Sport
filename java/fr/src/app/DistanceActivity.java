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

public class DistanceActivity extends AppCompatActivity {

    private Button mOne;
    private Button mTwo;
    private Button mThree;
    private Button mFour;
    private Button mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        mOne= findViewById(R.id.dist_one);
        mTwo= findViewById(R.id. dist_two);
        mThree = findViewById(R.id.dist_three);
        mNext = findViewById(R.id.dist_next);


        mNext.setEnabled(false);
        mOne.setEnabled(true);
        mTwo.setEnabled(true);
        mThree.setEnabled(true);



        mOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOne.setAlpha(1f);
                mTwo.setAlpha(0.4f);
                mThree.setAlpha(0.4f);
                mNext.setEnabled(true);
            }
        });

        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOne.setAlpha(0.4f);
                mTwo.setAlpha(1f);
                mThree.setAlpha(0.4f);
                mNext.setEnabled(true);
            }
        });

        mThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOne.setAlpha(0.4f);
                mTwo.setAlpha(0.4f);
                mThree.setAlpha(1f);
                mNext.setEnabled(true);
            }
        });



        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sportsActivityIntent = new Intent(DistanceActivity.this, HomeActivity.class);
                startActivity(sportsActivityIntent);

            }
        });
    }
}