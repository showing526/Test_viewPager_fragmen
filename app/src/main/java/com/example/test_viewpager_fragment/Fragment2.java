package com.example.test_viewpager_fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Fragment2 extends Fragment implements AdapterView.OnItemClickListener {


	private ListView listView;
	List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();


	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.layout2, container, false);

		/*listView=(ListView)view.findViewById(R.id.MyListView);
		listView.setAdapter(new ListViewAdapter(titles,texts,resIds));*/
		listView = (ListView)view.findViewById(R.id.MyListView);
		List<Map<String, Object>> list=getData();
		listView.setAdapter(new ListViewAdapter(getActivity(), list,mListener));
		//listView.setOnItemClickListener(getActivity());


		/*listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
									long arg3) {
				// TODO Auto-generated method stub

					startActivity(new Intent(getActivity(), detail.class));

			}

		});*/

		return view;
	}

	public List<Map<String, Object>> getData(){

		for (int i = 0; i < 10; i++) {
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("image", R.drawable.ic_launcher);
			map.put("title", "这是一个标题"+i);
			map.put("info", "这是一个详细信息" + i);
			list.add(map);
		}
		return list;
	}

	//响应item点击事件
	@Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
		Toast.makeText(getActivity(), "listview的item被点击了！，点击的位置是-->" + position,
				Toast.LENGTH_SHORT).show();
	}

	/**
	 * 实现类，响应按钮点击事件
	 */
	private ListViewAdapter.MyClickListener mListener = new ListViewAdapter.MyClickListener() {
		@Override
		public void myOnClick(int position, View v) {
			Toast.makeText(
					getActivity(),
					"listview的内部的按钮被点击了！，位置是-->" + position + ",内容是-->"
							+ list.get(position), Toast.LENGTH_SHORT)
					.show();

			startActivity(new Intent(getActivity(), detail.class));
		}
	};




}
