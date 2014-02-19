package com.reddot.emenu.activitys;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;

import android.widget.DatePicker;
import android.widget.EditText;

@SuppressLint("ValidFragment")
public class OnlineReservation extends Activity {
	EditText mEdit;

	private static final Pattern EMAIL_PATTERN = Pattern
			.compile("[a-zA-Z0-9+._%-+]{1,100}" + "@"
					+ "[a-zA-Z0-9][a-zA-Z0-9-]{0,10}" + "(" + "."
					+ "[a-zA-Z0-9][a-zA-Z0-9-]{0,20}" + ")+");
	private static final Pattern USERNAME_PATTERN = Pattern
			.compile("[a-zA-Z0-9]{1,250}");
	private static final Pattern PASSWORD_PATTERN = Pattern
			.compile("[a-zA-Z0-9+_.]{4,16}");
	EditText usname;
	EditText pword;
	EditText email1;
	Button btSubmit;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_onlinereservation);

		usname = (EditText) findViewById(R.id.editText1);
		pword = (EditText) findViewById(R.id.editText2);
		email1 = (EditText) findViewById(R.id.editText3);
		btSubmit = (Button) findViewById(R.id.btnRegister);

		btSubmit.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				String username = usname.getText().toString();
				String password = pword.getText().toString();
				String email = email1.getText().toString();
				if (username.equals("") || password.equals("")
						|| email.equals("")) {
					if (username.equals("")) {
						Toast.makeText(OnlineReservation.this,
								"ENTER USERNAME", Toast.LENGTH_LONG).show();

					}
					if (password.equals("")) {
						Toast.makeText(OnlineReservation.this,
								"ENTER PASSWORD", Toast.LENGTH_LONG).show();

					}
					if (email.equals("")) {
						Toast.makeText(OnlineReservation.this,
								"ENTER EMAIL ID", Toast.LENGTH_LONG).show();

					}
				} else {
					if (!CheckUsername(username)) {
						Toast.makeText(OnlineReservation.this,
								"ENTER VALID USERNAME", Toast.LENGTH_LONG)
								.show();
					}
					if (!CheckPassword(password)) {
						Toast.makeText(OnlineReservation.this,
								"ENTER VALID PASSWORD", Toast.LENGTH_LONG)
								.show();
					}
					if (!CheckEmail(email)) {
						Toast.makeText(OnlineReservation.this,
								"ENTER VALID EMAIL ID", Toast.LENGTH_LONG)
								.show();
					}
				}

			}

			private boolean CheckEmail(String email) {
				return EMAIL_PATTERN.matcher(email).matches();
			}

			private boolean CheckPassword(String password) {
				return PASSWORD_PATTERN.matcher(password).matches();
			}

			private boolean CheckUsername(String username) {
				return USERNAME_PATTERN.matcher(username).matches();
			}
		});

	}

}
