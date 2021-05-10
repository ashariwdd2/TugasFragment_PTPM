package com.example.recycleview173;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentDinas extends Fragment {
    @Nullable @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_dinas, container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().setTitle("Dinas Application");

        DinasAdapter dinasAdapter = new DinasAdapter(DataDinas.getListData(),getContext());
        RecyclerView rvDinas = getView().findViewById(R.id.rv_dinas);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        rvDinas.setLayoutManager(layoutManager);
        rvDinas.setHasFixedSize(true);
        rvDinas.setAdapter(dinasAdapter);
    }
}
