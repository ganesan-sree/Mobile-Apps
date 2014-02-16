package com.reddot.emenu.activitys.dashboard;

import com.reddot.emenu.activitys.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoardActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_dashboard_layout);
        
        /**
         * Creating all buttons instances
         * */
       
        Button btn_menu = (Button) findViewById(R.id.btn_menu);
        
       
        Button btn_beer = (Button) findViewById(R.id.btn_beer);
        
       
        Button btn_calandar = (Button) findViewById(R.id.btn_calandar);
        
       
        Button btn_about = (Button) findViewById(R.id.btn_about);
        
       
        Button btn_events = (Button) findViewById(R.id.btn_events);
        
       
        Button btn_gallery = (Button) findViewById(R.id.btn_gallery);
        
        /**
         * Handling all button click events
         * */
        
       
        btn_menu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {		
				Intent i = new Intent(getApplicationContext(), MenusActivity.class);
				startActivity(i);
			}
		});
        
      
        btn_beer.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), BeersActivity.class);
				startActivity(i);
			}
		});
        
        btn_calandar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {				
				Intent i = new Intent(getApplicationContext(), CalandarActivity.class);
				startActivity(i);
			}
		});
        
        btn_about.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), AboutUsActivity.class);
				startActivity(i);
			}
		});
        
        btn_events.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), EventsActivity.class);
				startActivity(i);
			}
		});
        

        btn_gallery.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), GalleryActivity.class);
				startActivity(i);
			}
		});
    }
}