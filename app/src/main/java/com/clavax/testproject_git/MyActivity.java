package com.clavax.testproject_git;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MyActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        BlankFragment blank = new BlankFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,blank).commit();


    }


    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }
}
