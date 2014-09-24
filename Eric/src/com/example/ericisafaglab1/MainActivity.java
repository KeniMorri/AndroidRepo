package com.example.ericisafaglab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
//import android.view.Menu;
//import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        EditText et = (EditText) findViewById(R.id.editText1);
        
        Button b1 = (Button) findViewById(R.id.eig);

        final Intent myIntent = new Intent(this, SecondActivity.class);
        myIntent.putExtra("key", et.getText());
        
        
        
        OnClickListener ocl = new MyOnClickListener(myIntent);
        b1.setOnClickListener(ocl);
        
        /*
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(myIntent);
            }
        });
*/
    }

    

	public class MyOnClickListener implements OnClickListener
	{
		Intent anIntent;
		MyOnClickListener(Intent i)
		{
			anIntent = i;
		}
		public void onClick(View v)
		{
			startActivity(anIntent);
		}
	}
}
