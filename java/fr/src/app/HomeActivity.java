package fr.src.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private ImageView mLogo;
    private TextView mWelcome;
    private BottomNavigationView mBottomNavigationView;
    private SearchView mSearchView;
    private ListView mListView;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mBottomNavigationView = findViewById(R.id.bottom_navigation);

    }
}