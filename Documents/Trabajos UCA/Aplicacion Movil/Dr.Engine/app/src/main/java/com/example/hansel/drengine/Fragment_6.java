package com.example.hansel.drengine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hansel on 27/11/2016.
 */

public class Fragment_6 extends Fragment {

    public Fragment_6(){



    }

    public static Fragment_6 getInstance(){

        Fragment_6 fragment = new Fragment_6();
        return fragment;


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sexta_pantalla, container, false);
        return  view;
    }
}
