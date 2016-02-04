package com.example.estacionvl_tc_014.fragments;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.estacionvl_tc_014.fragments.adapters.ContenidoAdapter;
import com.example.estacionvl_tc_014.fragments.fragments.ContenidoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;

    List<Fragment> data;
    ContenidoAdapter adapter;

    Toolbar toolbar;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager) findViewById(R.id.pager);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabs);

        setSupportActionBar(toolbar);

        initData();
        adapter =  new ContenidoAdapter(getSupportFragmentManager(), data);
        pager.setAdapter(adapter);

        tabLayout.setTabsFromPagerAdapter(adapter);
        tabLayout.setupWithViewPager(pager);
    }

    public void initData(){
        data = new ArrayList<>();

        ContenidoFragment f1 = new ContenidoFragment();
        f1.setInfo("Pagina 1");

        ContenidoFragment f2 = new ContenidoFragment();
        f2.setInfo("Pagina 2");

        ContenidoFragment f3 = new ContenidoFragment();
        f3.setInfo("Pagina 3");

        data.add(f1);
        data.add(f2);
        data.add(f3);
    }

}
