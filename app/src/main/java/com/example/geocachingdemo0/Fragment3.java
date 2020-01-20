package com.example.geocachingdemo0;

import android.app.Activity;
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
import com.baidu.mapapi.SDKInitializer;

import com.baidu.mapapi.map.*;

public class Fragment3 extends Fragment {
    //private TextView textView1;
    //private Button button;
    private MapView mMapView = null;
    @Nullable
/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment3);
        //获取地图控件引用
        mMapView = (MapView) findViewById(R.id.bmapView);
    }*/


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        DemoApplication app = (DemoApplication) getActivity().getApplication();
        SDKInitializer.initialize(getActivity().getApplicationContext());
        View view=inflater.inflate(R.layout.fragment3,container,false);
        mMapView = (MapView)view.findViewById(R.id.bmapView);



        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
        mMapView.onResume();
    }
    @Override
    public void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
        mMapView.onPause();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mMapView.onDestroy();
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //textView1=(TextView)getActivity().findViewById(R.id.fragment3_tv1);

        //button=(Button)getActivity().findViewById(R.id.button1);
        /*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Fragment1",Toast.LENGTH_SHORT).show();
            }
        }); */
    }




}

