package com.example.test_viewpager_fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1 extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view= inflater.inflate(R.layout.layout1, container, false);
		
		/*
		Button btn = (Button)view.findViewById(R.id.fragment1_btn);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Toast.makeText(getActivity(), "123", Toast.LENGTH_SHORT).show();


			}
		});*/
		return view;
	}
}
