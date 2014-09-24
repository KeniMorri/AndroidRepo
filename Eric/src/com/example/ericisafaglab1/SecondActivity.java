package com.example.ericisafaglab1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondary);
        
        TextView tv = (TextView) findViewById(R.id.textView4);
        
        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
        	tv.setText(extras.getCharSequence("key", "defaultValue"));
        }
        
        
    }
	
    
	
}
