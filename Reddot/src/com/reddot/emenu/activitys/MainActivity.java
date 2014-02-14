package com.reddot.emenu.activitys;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final ImageButton fadeactionBarBtn = (ImageButton) findViewById(R.id.homebtn);
		fadeactionBarBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(getBaseContext(), DashBoardActivity.class);
				startActivity(i);
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
    public void onConfigurationChanged(Configuration newConfig) {
    // TODO Auto-generated method stub
    super.onConfigurationChanged(newConfig);
     
    if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
     
    System.out.println("On Config ChangeLANDSCAPE");
    setContentView(R.layout.activity_main);
     
    }else{
     
    System.out.println("On Config ChangePORTRAIT");
    setContentView(R.layout.activity_main);
     
    }
    }
    
}
