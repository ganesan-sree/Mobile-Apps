
package com.reddot.emenu.activitys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.reddot.emenu.adapter.CustomGridViewAdapter;
import com.reddot.emenu.bean.Item;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListView;

public class HomeActivity extends Activity {
	
	GridView gridView;	
	CustomGridViewAdapter customGridAdapter;
	ArrayList<Item> gridArray = new ArrayList<Item>();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);//set grid view item
		Bitmap homeIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.home);
		
		gridArray.add(new Item(homeIcon,"Calendar"));
		gridArray.add(new Item(homeIcon,"Our Beers"));
		gridArray.add(new Item(homeIcon,"Menu"));
		gridArray.add(new Item(homeIcon,"Events"));
		gridArray.add(new Item(homeIcon,"Gallery"));
		gridArray.add(new Item(homeIcon,"Media & Press"));
		gridArray.add(new Item(homeIcon,"About Us"));
		gridArray.add(new Item(homeIcon,"Contact Us"));
		
		
		
		gridView = (GridView) findViewById(R.id.gridView1);
		customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid_home, gridArray);
		gridView.setAdapter(customGridAdapter);
		
		
		
	}

}
