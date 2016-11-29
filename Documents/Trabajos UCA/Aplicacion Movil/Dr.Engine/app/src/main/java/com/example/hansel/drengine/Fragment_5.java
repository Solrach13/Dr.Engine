package com.example.hansel.drengine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.telecom.TelecomManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by Hansel on 27/11/2016.
 */



    public class Fragment_5 extends Fragment{

    static TextView mDiesel;
    public Fragment_5(){



    }

    public static Fragment_5 getInstance(){
    Fragment_5 fragment = new Fragment_5();
        return fragment;



    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quinta_pantalla, container, false);

        mDiesel = (TextView) view.findViewById(R.id.diesel);


        return view;
    }

    public static void setDiesel(String value){

        mDiesel.setText(value);

    }

}
