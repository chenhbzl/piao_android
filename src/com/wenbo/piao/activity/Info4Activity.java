package com.wenbo.piao.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.wenbo.androidpiao.R;

public class Info4Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.info4, menu);
		return true;
	}

}
