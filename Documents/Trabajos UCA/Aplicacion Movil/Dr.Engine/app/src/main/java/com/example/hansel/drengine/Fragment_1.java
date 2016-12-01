package com.example.hansel.drengine;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Hansel on 11/11/2016.
 */

public class Fragment_1 extends Fragment {

    static TextView mSuper, mDiesel, mRegular;
    ImageButton bDrawer;
    DrawerLayout mDrawerLayout;
    ListView mDrawerList;

    public Fragment_1(){




    }

    public static Fragment_1 getInstace(){

        Fragment_1 fragment = new Fragment_1();
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1_layout, container, false);
        mSuper = (TextView) view.findViewById(R.id.txtSuper);
        mDiesel = (TextView) view.findViewById(R.id.txtDiesel);
        mRegular = (TextView) view.findViewById(R.id.txtRegular);


        return view;

    }

    public static void setSuper(String value){

        mSuper.setText(value);

    }

    public static void setRegular(String value2){

        mDiesel.setText(value2);


    }

    public static void setDiesel(String value3){
        mRegular.setText(value3);


    }

}
