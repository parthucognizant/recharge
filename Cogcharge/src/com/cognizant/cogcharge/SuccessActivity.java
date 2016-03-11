package com.cognizant.cogcharge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SuccessActivity extends ActionBarActivity implements OnClickListener {

	TextView message;
	Button another_payment,register;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_success);
		message = (TextView)findViewById(R.id.tv_success_message);
		another_payment = (Button)findViewById(R.id.button_another_payment);
		register = (Button)findViewById(R.id.button_new_register);
		message.setText("Recharge done successfully for mobile number 8122303392");
		another_payment.setOnClickListener(this);
		register.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.button_another_payment:
			Intent homeintetnt = new Intent(SuccessActivity.this, MainActivity.class);
			startActivity(homeintetnt);
			break;
		case R.id.button_new_register:
			Intent registerintent = new Intent(SuccessActivity.this, RegisterNumberActivity.class);
			startActivity(registerintent);
			break;
		default:
			break;
		}

	}
}
