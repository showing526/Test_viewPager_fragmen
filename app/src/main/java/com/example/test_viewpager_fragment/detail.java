package com.example.test_viewpager_fragment;

import android.app.Activity;
<<<<<<< Updated upstream
import android.os.Bundle;
=======
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

>>>>>>> Stashed changes

/**
 * Created by sks on 2017/4/10.
 */
public class detail extends Activity {
     protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
<<<<<<< Updated upstream
=======

       Button btn = (Button)findViewById(R.id.baoming);
         btn.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(detail.this, get.class));
             }


             });

        /* final TextView love = (TextView) findViewById(R.id.love);
         love.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v) {

                 love.setBackgroundResource(R.drawable.heart);
             }


         });*/

         Button btn1 = (Button)findViewById(R.id.backtolayout2);

         btn1.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {
                 // TODO Auto-generated method stub
                 //Toast.makeText(getActivity(), "123", Toast.LENGTH_SHORT).show();
                 // Activity不能直接跳转到Fragment，需要先跳转到Fragment所附着的Activity中，然后再更改Activity当前显示哪个Fragment。

                 Intent intent=new Intent(detail.this,MainActivity.class);
                 intent.putExtra("page",1);
                 startActivity(intent);
                 finish();
             }
         });


>>>>>>> Stashed changes
    }


}
