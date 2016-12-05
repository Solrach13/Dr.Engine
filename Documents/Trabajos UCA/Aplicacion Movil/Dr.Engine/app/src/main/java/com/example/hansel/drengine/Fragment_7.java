package com.example.hansel.drengine;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment_7 extends Fragment {

    public Fragment_7(){



    }

    public static com.example.hansel.drengine.Fragment_7 getInstance(){

        com.example.hansel.drengine.Fragment_7 fragment = new com.example.hansel.drengine.Fragment_7();
        return fragment;


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragmnent_7, container, false);
        return  view;
    }
}
