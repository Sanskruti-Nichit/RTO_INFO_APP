package com.example.rtoinfoapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       b1=(Button)findViewById(R.id.button1);
       b2=(Button)findViewById(R.id.button2);
       b3=(Button)findViewById(R.id.button3);
       

       b1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i1=new Intent(MainActivity.this,rules.class);
			startActivity(i1);
			
		}
	});
       
       b2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i2=new Intent(MainActivity.this,fines.class);
			startActivity(i2);
		}
	});
       
       b3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i3=new Intent(MainActivity.this,officesnumber.class);
			startActivity(i3);
			
		}
	});
       
       
       
    }
    
   

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
