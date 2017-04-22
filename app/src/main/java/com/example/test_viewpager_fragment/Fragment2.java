package com.example.test_viewpager_fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment{

	ListView listView;
	String[] titles={"标题1","标题2","标题3","标题4"};
	String[] texts={"文本内容A","文本内容B","文本内容C","文本内容D"};
	int[] resIds={R.drawable.qq,R.drawable.qq,R.drawable.qq,R.drawable.qq};


	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.layout2, container, false);

		listView=(ListView)view.findViewById(R.id.MyListView);
		listView.setAdapter(new ListViewAdapter(titles,texts,resIds));

		return view;
	}


	public class ListViewAdapter extends BaseAdapter {
		View[] itemViews;

		public ListViewAdapter(String[] itemTitles, String[] itemTexts,
							   int[] itemImageRes) {
			itemViews = new View[itemTitles.length];

			for (int i = 0; i < 4; i++) {
				itemViews[i] = makeItemView(itemTitles[i], itemTexts[i],
						itemImageRes[i]);
			}
		}

		public int getCount() {
			return itemViews.length;
		}

		public View getItem(int position) {
			return itemViews[position];
		}

		public long getItemId(int position) {
			return position;
		}

		private View makeItemView(String strTitle, String strText, int resId) {

			LayoutInflater inflater = LayoutInflater.from(getActivity());


			// 使用View的对象itemView与R.layout.item关联
			View itemView = inflater.inflate(R.layout.item, null);


			// 通过findViewById()方法实例R.layout.item内各组件
			TextView title = (TextView) itemView.findViewById(R.id.itemTitle);
			title.setText(strTitle);
			TextView text = (TextView) itemView.findViewById(R.id.itemText);
			text.setText(strText);
			ImageView image = (ImageView) itemView.findViewById(R.id.itemImage);
			image.setImageResource(resId);

			return itemView;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null)
				return itemViews[position];
			return convertView;
		}
	}


}
