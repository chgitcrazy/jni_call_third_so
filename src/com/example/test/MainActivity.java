package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView  tv = new TextView(this);
        tv.setText(test());
        //tv.setText("hello");
        setContentView(tv);
      
    }
    
    public native String test();
    
    static{
    	System.loadLibrary("test");
    }
}
