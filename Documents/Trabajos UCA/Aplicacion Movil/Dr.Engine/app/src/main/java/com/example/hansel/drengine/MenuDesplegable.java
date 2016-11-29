package com.example.hansel.drengine;


import android.content.Intent;
import android.net.Uri;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static android.R.attr.data;
import static android.R.attr.onClick;
import static android.R.attr.targetActivity;

public class MenuDesplegable extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    private String FIRE_BASE_URL = "https://dr-engine.firebaseio.com";
    private String FIREBASE_CHILD = "dr-engine";
    Firebase firebase;

    ImageButton home;
    DrawerLayout mDrawerLayout;

    String datos[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_desplegable);
        //Firebase.setAndroidContext(this);
        //firebase = new Firebase(FIRE_BASE_URL);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(Fobject.DIESEL);
        myRef.addValueEventListener(new com.google.firebase.database.ValueEventListener() {
            @Override
            public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {

            String valor = dataSnapshot.getValue(String.class);
                Fragment_1.setDiesel(valor);




            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                //this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        //drawer.setDrawerListener(toggle);
        //toggle.syncState();


        home = (ImageButton) findViewById(R.id.Bhome);



        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        Fragment fragment = Fragment_1.getInstace();
        mostrarFragment(fragment);




    }





    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_desplegable, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            //Fragment Numero 1

            //Fragment fragment = Fragment_1.getInstace();
            //mostrarFragment(fragment);

            Fragment fragment2 = Fragment_2.newInstance("Texto1","Texto2");
            mostrarFragment(fragment2);


        } else if (id == R.id.nav_gallery) {

            Fragment fragment3 = Fragment_3.newInstance("Texto1","Texto2");
            mostrarFragment(fragment3);

        } else if (id == R.id.nav_slideshow) {

            Fragment fragment5 = Fragment_5.getInstance();
            mostrarFragment(fragment5);


        } else if (id == R.id.nav_manage) {

            Fragment fragment4 = Fragment_4.getInstance();
            mostrarFragment(fragment4);


        } else if (id == R.id.nav_share) {

            Intent intent = new Intent(MenuDesplegable.this, MapsActivity.class);
            startActivity(intent);


        } else if (id == R.id.nav_send) {

            Fragment fragment6 = Fragment_6.getInstance();
            mostrarFragment(fragment6);

        } else if (id == R.id.nav_ajustes) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {

    }


    public void openDrawer (){

        mDrawerLayout.openDrawer(Gravity.LEFT);

    }

    public void mostrarFragment(Fragment fragment){
      FragmentManager fragmentManager = getSupportFragmentManager();
      FragmentTransaction transaction = fragmentManager.beginTransaction();
      transaction.replace(R.id.fap, fragment);
      transaction.addToBackStack(null);
      transaction.commit();






  }



}
