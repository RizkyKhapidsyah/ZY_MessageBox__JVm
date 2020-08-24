package com.wilis.messagebox;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;

public class messagebox extends Activity implements View.OnClickListener {
	
	Button alert;
	Button toast;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);
        

		alert=(Button)findViewById(R.id.alert);
		alert.setOnClickListener(this);
		toast=(Button)findViewById(R.id.toast);
		toast.setOnClickListener(this);
	}
	
	public void onClick(View view) {
		if (view==alert) {
			new AlertDialog.Builder(this)
				.setTitle("Message title")
				.setMessage("Ini adalah bagian setMessage")
				.setNeutralButton("Close", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dlg, int sumthin) {
						// do nothing -- it will close on its own
					}
				})
				.show();
		}
		else {
			Toast
				.makeText(this, "Hai..Message toast", Toast.LENGTH_SHORT)
				.show();
		}
	
        
        
    }
}