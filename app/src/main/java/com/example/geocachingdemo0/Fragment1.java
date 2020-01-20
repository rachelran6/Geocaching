package com.example.geocachingdemo0;

import com.example.geocachingdemo0.constant.AppConfig;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class Fragment1 extends Fragment {
    public static final String TAG = "Fragment1";
    public static final MediaType JSON=MediaType.parse("application/json; charset=utf-8");

    private TextView textView0;
    private TextView textView01;
    private TextView textView02;
    private TextView textView1;
    private TextView textView11;
    private TextView textView2;
    private TextView textView22;
    private TextView textView3;
    private TextView textView33;
    private TextView textView4;
    private Button button1;
    private Button button2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1,container,false);

        System.out.println("~~here!!!onCreateView0!!!");

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView0=(TextView)getActivity().findViewById(R.id.fragment1_tv00);
        textView01=(TextView)getActivity().findViewById(R.id.fragment1_tv0);
        textView02=(TextView)getActivity().findViewById(R.id.fragment1_tv01);
        textView1=(TextView)getActivity().findViewById(R.id.fragment1_tv1);
        textView11=(TextView)getActivity().findViewById(R.id.fragment1_tv11);
        textView2=(TextView)getActivity().findViewById(R.id.fragment1_tv2);
        textView22=(TextView)getActivity().findViewById(R.id.fragment1_tv22);
        textView3=(TextView)getActivity().findViewById(R.id.fragment1_tv3);
        textView33=(TextView)getActivity().findViewById(R.id.fragment1_tv33);
        textView4=(TextView)getActivity().findViewById(R.id.fragment1_tv4);
        button1=(Button)getActivity().findViewById(R.id.fragment1_button1);
        button2=(Button)getActivity().findViewById(R.id.fragment1_button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Found Caches",Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Posted Caches",Toast.LENGTH_SHORT).show();
            }
        });

        System.out.println("~~here!!!onActivityCreated000!!!");
        getData();
        System.out.println("~~here!!!onActivityCreated222!!!");


    }

/*
    private void postJson() {
        //申明给服务端传递一个json串
        //创建一个OkHttpClient对象
        OkHttpClient okHttpClient = new OkHttpClient();
        //创建一个RequestBody(参数1：数据类型 参数2传递的json串)

        RequestBody requestBody = RequestBody.create(JSON, json);
        //创建一个请求对象
        Request request = new Request.Builder()
                .url("http://localhost:3801/userInfo/username/Dan")
                .post(requestBody)
                .build();
        //发送请求获取响应
        try {
            Response response=okHttpClient.newCall(request).execute();
            //判断请求是否成功
            if(response.isSuccessful()){
                //打印服务端返回结果
                Log.i(TAG,response.body().string());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
*/

    private String urlStr = "http://localhost:3801/hello";
    /**
     * 得到数据库所有的数据
     * **/
    private void getData(){
        System.out.println("~~here!!!GetData000!!!");
        OkHttpClient mOkHttpClient = new OkHttpClient();
        final Request request = new Request.Builder().url(urlStr).build();
        Call call = mOkHttpClient.newCall(request);
        call.enqueue(new Callback()
        {
/*            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println("~~here!!!GetData Failure!!!");

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println("~~here!!!GetData Response!!!");
                String responseStr = response.body().string();
                System.out.println(responseStr);
                //Message msg = mHandler.obtainMessage();
                //msg.obj = responseStr;
                //mHandler.sendMessage(msg);
            }*/

            @Override
            public void onFailure(Request request, IOException e) {
                System.out.println("~~here!!!GetData Failure!!!");
            }

            @Override
            public void onResponse(final Response response) throws IOException {
                System.out.println("~~here!!!GetData Response!!!");
                String responseStr = response.body().string();
                System.out.println(responseStr);
                //Message msg = mHandler.obtainMessage();
                //msg.obj = responseStr;
                //mHandler.sendMessage(msg);
            }
        });
    }




}

