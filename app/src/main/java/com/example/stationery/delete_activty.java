package com.example.stationery;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

public class delete_activty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_activty);

        final Activity activity1 = this;
        activity1.setTitle("Delete Products");

//        setTitle(R.string.title_Delete_Products);
    }
}
