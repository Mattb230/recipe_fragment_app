package com.bootsysoftware.smellslikebacon;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bootsysoftware.smellslikebacon.adapters.ListAdapter;

/**
 * Created by Matthew Boydston on 9/20/2016.
 */
public class ListFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // layout, and the viewgroup where our new view gets added
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.listRecyclerView);
        ListAdapter listAdapter = new ListAdapter();
        // Attach adapter to view
        recyclerView.setAdapter(listAdapter);
        // Set Layout Manager for recycler View
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        //Attach LayoutManager to recyclerView
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }
}
