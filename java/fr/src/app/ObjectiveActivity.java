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

public class ObjectiveActivity extends AppCompatActivity {

    private Button mLoss;
    private Button mGain;
    private Button mMaintain;
    private Button mStress;
    private Button mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objective);

        mLoss= findViewById(R.id.obj_loss);
        mGain= findViewById(R.id. obj_gain);
        mMaintain = findViewById(R.id.obj_maintain);
        mStress = findViewById(R.id.obj_stress);
        mNext = findViewById(R.id.obj_next);

        mNext.setEnabled(false);
        mLoss.setEnabled(true);
        mGain.setEnabled(true);
        mMaintain.setEnabled(true);
        mStress.setEnabled(true);



        mLoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLoss.setAlpha(1f);
                mGain.setAlpha(0.4f);
                mMaintain.setAlpha(0.4f);
                mStress.setAlpha(0.4f);
                mNext.setEnabled(true);
            }
        });

        mGain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLoss.setAlpha(0.4f);
                mGain.setAlpha(1f);
                mMaintain.setAlpha(0.4f);
                mStress.setAlpha(0.4f);
                mNext.setEnabled(true);
            }
        });

        mMaintain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLoss.setAlpha(0.4f);
                mGain.setAlpha(0.4f);
                mMaintain.setAlpha(1f);
                mStress.setAlpha(0.4f);
                mNext.setEnabled(true);
            }
        });

        mStress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLoss.setAlpha(0.4f);
                mGain.setAlpha(0.4f);
                mMaintain.setAlpha(0.4f);
                mStress.setAlpha(1f);
                mNext.setEnabled(true);
            }
        });


        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent freqActivityIntent = new Intent(ObjectiveActivity.this, FrequencyActivity.class);
                startActivity(freqActivityIntent);

            }
        });
    }
}