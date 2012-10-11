package com.jifho.aprendiendoandroid;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FundamentalesAndroidActivity extends ListActivity {
	
	String pruebas[] ={"LifeCicleTest","SingleTouchTest","MultiTouchTest","KeyTest","AcelerometerTest",
						"AssetsTest","ExternalStorageTest","SoundPoolTest","MediaPlayerTest","FullScreenTest",
						"RenderViewTest","FontTest","SurfaceViewTest"};
	
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pruebas));
		
	}
	
	@Override
	protected void onListItemClick(ListView list, View view, int position, long id){
		super.onListItemClick(list, view, position, id);
		String nombrePosicion = pruebas[position];
		
		try{
			Class<?> clazz = Class.forName("com.jifho.aprendiendoandroid."+nombrePosicion);
			Intent intent = new Intent(this,clazz);
			startActivity(intent);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	


    
}
