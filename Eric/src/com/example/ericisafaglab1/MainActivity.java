package com.example.ericisafaglab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.view.Menu;
//import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.eig);

        final Intent myIntent = new Intent(this, SecondActivity.class);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(myIntent);
            }
        });

    }

    }

