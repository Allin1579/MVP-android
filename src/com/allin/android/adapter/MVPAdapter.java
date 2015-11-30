package com.allin.android.adapter;

import com.allin.android.mvp.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MVPAdapter extends BaseAdapter {
	private int[] array;

	public MVPAdapter(int[] array) {
		this.array = array;
	}

	@Override
	public int getCount() {
		return array.length;
	}

	@Override
	public Object getItem(int position) {
		return array[position];
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Context context = parent.getContext();
		ViewHolder viewHolder = null;
		if(convertView == null){
			convertView = LayoutInflater.from(context).inflate(R.layout.mvp_item, null);
			viewHolder = new ViewHolder();
			viewHolder.valueText = (TextView) convertView.findViewById(R.id.value);
			convertView.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder) convertView.getTag();
		}
		
		viewHolder.valueText.setText(String.valueOf(array[position]));
		
		return convertView;
	}
	
	private static class ViewHolder{
		TextView valueText;
	}

}
