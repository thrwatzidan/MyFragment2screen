package com.example.thrwat_zidan.myfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFragment(View view) {
        FragmentOne fragmentOne=new FragmentOne();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.placeholder,fragmentOne)
                .commit();
    }

    public void addFragment2(View view) {
        FragmentTwo fragmentOne=new FragmentTwo();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.placeholder,fragmentOne)
                .commit();
    }
}
