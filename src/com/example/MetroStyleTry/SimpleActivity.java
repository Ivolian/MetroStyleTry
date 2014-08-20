package com.example.MetroStyleTry;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class SimpleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.simple_activity);

        ZoomAnim.addAnimFor(findViewById(R.id.textView), 0.7f, 500, new AfterEndAnimFinish() {

                    @Override
                    public void doSomething() {

                        Toast.makeText(SimpleActivity.this, "android", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        ZoomAnim.addAnimFor(findViewById(R.id.textView2), 0.02f, 2000, new AfterEndAnimFinish() {

                    @Override
                    public void doSomething() {

                        Toast.makeText(SimpleActivity.this, "github", Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }
}