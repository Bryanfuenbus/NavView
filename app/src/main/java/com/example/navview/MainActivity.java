package com.example.navview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu1 , menu);
    return true;
}

@Override
public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
        case R.id.mnuNuevo:
            Toast.makeText(this.getApplicationContext(),"Ha presionado opción Nuevo ",Toast.LENGTH_LONG).show();
            return true;
        case R.id.mnuBuscar:
            Toast.makeText(this.getApplicationContext(),"Ha presionado opción Buscar " ,Toast.LENGTH_LONG).show();
            return true;
        case R.id.mnuSetting:
            Toast.makeText(this.getApplicationContext(),"Ha presionado opción Setting" ,Toast.LENGTH_LONG).show();
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
}
}
