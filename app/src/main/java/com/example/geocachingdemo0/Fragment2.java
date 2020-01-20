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

public class Fragment2 extends Fragment {
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView0;
    private TextView textView01;
    private Button button1;
    private Button button2;
    private Button button3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment2,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView1=(TextView)getActivity().findViewById(R.id.fragment2_tv1);
        textView2=(TextView)getActivity().findViewById(R.id.fragment2_tv2);
        textView3=(TextView)getActivity().findViewById(R.id.fragment2_tv3);
        textView4=(TextView)getActivity().findViewById(R.id.fragment2_tv4);
        button1=(Button)getActivity().findViewById(R.id.fragment2_button1);
        button2=(Button)getActivity().findViewById(R.id.fragment2_button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Read messages",Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Send messages",Toast.LENGTH_SHORT).show();
            }
        });
        button3=(Button)getActivity().findViewById(R.id.fragment2_button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Post a status update",Toast.LENGTH_SHORT).show();
            }
        });



    }
}

