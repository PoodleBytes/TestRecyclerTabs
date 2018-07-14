package com.example.john.testrecyclertabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentOne extends Fragment {
    DataSource array_of_data = new DataSource();//source is array of data
    ArrayList<DataClass> WorkingData = new ArrayList<>();
    DataAdapter adapter;

    public static FragmentOne newInstance() {
        FragmentOne fragment = new FragmentOne();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        RecyclerView defaultRecycler = rootView.findViewById(R.id.default_view);

        WorkingData.clear();
        WorkingData = array_of_data.getData();


        //Create your LinearLayoutManager with your context
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(rootView.getContext());

        //Create your adapter based on the custom class you created
        adapter = new DataAdapter(rootView.getContext(),WorkingData);

        //Set your LayoutManager and Adapter
        defaultRecycler.setLayoutManager(linearLayoutManager);
        defaultRecycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return rootView;
    }
}
