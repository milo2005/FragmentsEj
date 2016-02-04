package com.example.estacionvl_tc_014.fragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.estacionvl_tc_014.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContenidoFragment extends Fragment {


    TextView txt;
    String info;

    public ContenidoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contenido, container, false);
        txt = (TextView) v.findViewById(R.id.txt);
        txt.setText(info);
        return v;
    }

    public void setInfo(String info){
        this.info = info;
    }

}
