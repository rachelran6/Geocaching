package com.example.geocachingdemo0;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment33 extends Fragment {
    private Button button1;
    private Button button2;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    //private Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment3,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView1=(TextView)getActivity().findViewById(R.id.fragment3_tv0);
        textView2=(TextView)getActivity().findViewById(R.id.fragment3_tv1);
        textView3=(TextView)getActivity().findViewById(R.id.fragment3_tv2);
        button1=(Button)getActivity().findViewById(R.id.fragment3_button1);
        button2=(Button)getActivity().findViewById(R.id.fragment3_button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Log out",Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Edit Draft",Toast.LENGTH_SHORT).show();
            }
        });


    }
}

