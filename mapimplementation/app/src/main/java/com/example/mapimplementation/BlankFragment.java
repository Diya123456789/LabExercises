package com.example.mapimplementation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#
 * newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {
    public BlankFragment() {      // Required empty public constructor
            }
            RecyclerView recyclerView;
    List<Model> itemList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        recyclerView=view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new ItemAdapter(initData(),getContext()));
        return view;
    }
    private List<Model> initData() {
        itemList=new ArrayList<>();
        itemList.add(new Model(R.drawable.plumber,"Mr.Plumber","9866"));
        itemList.add(new Model(R.drawable.babulal,"Babulal","0176"));
        itemList.add(new Model(R.drawable.chuck,"Chuck Norris","977"));
        itemList.add(new Model(R.drawable.,"Hari Bahadur","97798"));
        return itemList;    }
    }
