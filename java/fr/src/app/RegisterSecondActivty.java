package fr.src.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterSecondActivty extends AppCompatActivity {
    private TextView mHeading;
    private TextView mGender;
    private Button mMan;
    private Button mWoman;
    private TextView mHeightq;
    private EditText mHeight;
    private TextView mHeightu;
    private TextView mWeightq;
    private EditText mWeight;
    private TextView mWeightu;
    private Button mConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_second_activty);

        mHeading = findViewById(R.id.register_text);
        mGender = findViewById(R.id.gender_question);
        mMan = findViewById(R.id.man);
        mWoman = findViewById(R.id.woman);
        mHeightq = findViewById(R.id.height_question);
        mHeight = findViewById(R.id.register_height);
        mHeightu = findViewById(R.id.height_unit);
        mWeightq = findViewById(R.id.weight_question);
        mWeight = findViewById(R.id.register_weight);
        mWeightu = findViewById(R.id.weight_unit);
        mConfirm = findViewById(R.id.finish_button);
        mConfirm.setEnabled(false);

       mWoman.setEnabled(true);
        mMan.setEnabled(true);
        mMan.setAlpha(1f);
        mWoman.setAlpha(1f);



  mWoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWoman.setAlpha(1f);
                mMan.setAlpha(0.4f);
                mConfirm.setEnabled(true);
            }
        });

        mMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMan.setAlpha(1f);
                mWoman.setAlpha(0.4f);
                mConfirm.setEnabled(true);
            }
        });


        mConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent disableActivityIntent = new Intent(RegisterSecondActivty.this, DisabilityActivity.class);
                startActivity(disableActivityIntent);

            }
        });

    }
}