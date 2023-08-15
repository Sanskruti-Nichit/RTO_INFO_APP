package com.example.rtoinfoapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class officesnumber extends Activity{
	
	Button b1;
	EditText et1;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.officesnumber);
		
		b1=(Button)findViewById(R.id.button5);
		et1=(EditText)findViewById(R.id.editText1);
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
                String str11=et1.getText().toString();
				
				Intent i1=new Intent(Intent.ACTION_CALL);
				i1.setData(Uri.parse("tel:"+str11));
				startActivity(i1);
				
				
			}
		});
	}
	
	

}
