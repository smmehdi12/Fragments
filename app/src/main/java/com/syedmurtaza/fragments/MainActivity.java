package com.syedmurtaza.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int i) {
        FragmentManager manager = getSupportFragmentManager();
        fragmentB fragmentB = (com.syedmurtaza.fragments.fragmentB) manager.findFragmentById(R.id.fragment2);
        fragmentB.changeData(i);

    }
}
