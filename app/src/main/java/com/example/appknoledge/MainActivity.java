package com.example.appknoledge;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;

import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 1;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView) findViewById(R.id.img);
        registerForContextMenu(img);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {

            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, MY_PERMISSIONS_REQUEST_CALL_PHONE);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_CALL_PHONE: {
// If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                }
                return;
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.menuAcercaDe:
                i = new Intent(this, AcercaDe.class);
                startActivity(i);

                String aboutTxt = "(c) 2020 Master-A";
                Toast.makeText(MainActivity.this, aboutTxt,
                        Toast.LENGTH_LONG).show();
                break;

            case R.id.salir:
                finish();
                break;
        }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_guay, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.correo:

                i = new Intent(Intent.ACTION_SEND);

                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"direccioncorreo@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Prueba de asunto");
                i.putExtra(Intent.EXTRA_TEXT, "Es una prueba de texto para un email de prueba.");
                i.setType("message/rfc822");
                startActivity(i);


                break;
            case R.id.telefono:
                i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:628272057"));
                startActivity(i);
                break;

            case R.id.ubicacion:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.3978595,-3.67274"));
                startActivity(i);
                break;
            case R.id.web:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reformashenares.es/"));
                startActivity(i);
                break;
            case R.id.salir2:
                System.exit(0);
                break;
        }

        return true;
    }



    public void onClick(View view) {
        Intent i;

                i=new Intent(this,lista_onclick.class);
                startActivity(i);

    }
}

