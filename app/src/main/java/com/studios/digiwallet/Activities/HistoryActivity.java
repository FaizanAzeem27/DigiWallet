package com.studios.digiwallet.Activities;

import android.os.Bundle;

import com.studios.digiwallet.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import static com.studios.digiwallet.MyApplication.statusBarColor;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        init();
        statusBarColor(this);
    }

    private void init() {
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar9);
        setSupportActionBar(myToolbar);
        setTitle("");
    }
}