package com.syedmurtaza.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Syed Murtaza Mehdi on 21/12/2015.
 */
public class fragmentA extends Fragment implements AdapterView.OnItemClickListener{

    ListView listView ;
    communicator com;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        return view;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        com = (communicator) getActivity();
        listView = (ListView) getActivity().findViewById(R.id.listView);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.titles, android.R.layout.simple_list_item_1);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener((AdapterView.OnItemClickListener) this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        com.respond(position);

    }
}
