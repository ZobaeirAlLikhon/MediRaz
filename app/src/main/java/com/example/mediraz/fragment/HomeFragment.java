package com.example.mediraz.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mediraz.ItemList;
import com.example.mediraz.R;


public class HomeFragment extends Fragment {
    View view;
    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_home, container, false);
        itemOnClick();

        return view;

    }

    private void itemOnClick() {
        CardView clinicSV=view.findViewById(R.id.clinicCV);
        clinicSV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), ItemList.class);
                startActivity(intent);
            }
        });
    }
}