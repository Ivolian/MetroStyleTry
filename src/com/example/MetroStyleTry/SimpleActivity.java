package com.example.MetroStyleTry;

import android.app.Activity;
import android.os.Bundle;


public class SimpleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.simple_activity);

        ZoomAnim.addAnimFor(findViewById(R.id.textView), 0.1f, 1000);
        ZoomAnim.addAnimFor(findViewById(R.id.textView2), 0.02f, 5000);
    }

}
