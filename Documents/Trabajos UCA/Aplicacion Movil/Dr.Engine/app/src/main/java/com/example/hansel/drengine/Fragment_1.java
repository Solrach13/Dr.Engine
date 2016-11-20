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

/**
 * Created by Hansel on 11/11/2016.
 */

public class Fragment_1 extends Fragment {


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


   /*     bDrawer = (ImageButton)  view.findViewById(R.id.Bmenu);
        mDrawerLayout = (DrawerLayout) getActivity().findViewById(R.id.drawer_layout);
        bDrawer.setOnClickListener(this);
*/
        return view;

    }



}
