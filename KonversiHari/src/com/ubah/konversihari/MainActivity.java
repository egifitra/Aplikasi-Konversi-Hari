package com.ubah.konversihari;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button Jumlah=(Button)findViewById(R.id.button1);
				
		Jumlah.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				EditText Hari = (EditText)findViewById(R.id.editText1);
				TextView Result = (TextView)findViewById(R.id.textView2);
				
				int hari = Integer.parseInt(Hari.getText().toString());
				int tahun = hari/365;
				int sisatahun = hari%365;
				int bulan = sisatahun/30;
				int sisabulan = sisatahun/30;
				Result.setText("dibutuhkan waktu "+ tahun + " tahun "+ bulan+ " bulan "+ sisabulan + " hari ");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
