package com.example.circle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	
	private Button btn;
	private MenuView menuView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initViews();
		initData();
		setListeners();
	}
	
	private void initViews(){
		btn = (Button) findViewById(R.id.btn);
		menuView = (MenuView) findViewById(R.id.menu);
	}
	
	private void initData(){
		
	}
	
	private void setListeners(){
		btn.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn:
			if (menuView.isShown())
				menuView.in();
			else
				menuView.out();
			break;

		default:
			break;
		}
	}

}
