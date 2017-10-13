package com.contraintlayoutbug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LaggyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laggy);

        LaggyFragment fragment = new LaggyFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit();
    }
}
