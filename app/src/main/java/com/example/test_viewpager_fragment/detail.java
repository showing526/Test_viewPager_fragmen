package com.example.test_viewpager_fragment;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by sks on 2017/4/10.
 */
public class detail extends Activity {
     protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        /* Button btn = (Button)savedInstanceState.findViewById(R.id.fragment1_btn);
         btn.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {
                 // TODO Auto-generated method stub
                 //Toast.makeText(getActivity(), "123", Toast.LENGTH_SHORT).show();
                 // Activity不能直接跳转到Fragment，需要先跳转到Fragment所附着的Activity中，然后再更改Activity当前显示哪个Fragment。

                 intent.putExtra("fragid",1);
//首先在Activity跳转之前，在Intent中传入一个flag，用来标记跳转到哪一个Fragment。

// 然后根据flag来判断显示哪个Fragment

                 FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
// import android.support.v4.app.FragmentTransaction;

                 transaction.replace(R.id.frame_content, new CenterFragment());

                 transaction.commit();


             }
         });*/


    }


}
