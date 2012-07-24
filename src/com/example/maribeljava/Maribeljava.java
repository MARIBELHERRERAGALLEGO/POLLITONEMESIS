package com.example.maribeljava;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.content.*; 
import android.view.*;

public class Maribeljava extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maribeljava);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_maribeljava, menu);
        return true;
    }
//solo es el menu
    

public void abreteSesamo(View View){
	Intent hi = new Intent(this, Maribel2.class);
	startActivity(hi);
}

}
