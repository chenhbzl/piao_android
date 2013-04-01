package com.wenbo.piao.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.wenbo.androidpiao.R;

public class Info1Activity extends Activity {
	
	private static final String[] m={"00:00-24:00","00:00-06:00","06:00-12:00","12:00-18:00","18:00-24:00"};

	private Spinner spinner;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info1);
		spinner = (Spinner)findViewById(R.id.spinner1);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		        R.array.planets_array, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner.setAdapter(adapter);
	}
	
	

	@Override
	protected void onDestroy() {
		Log.i("method","onDestroy");
		super.onDestroy();
	}



	@Override
	protected void onPause() {
		Log.i("method","onPause");
		super.onPause();
	}



	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		Log.i("method","onRestart");
		super.onRestart();
	}



	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Log.i("method","onResume");
		super.onResume();
	}



	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		Log.i("method","onStart");
		super.onStart();
	}



	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		Log.i("method","onStop");
		super.onStop();
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.info1, menu);
		return true;
	}

}