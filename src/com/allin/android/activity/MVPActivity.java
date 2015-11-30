package com.allin.android.activity;

import com.allin.android.adapter.MVPAdapter;
import com.allin.android.listener.MVPViewListener;
import com.allin.android.mvp.R;
import com.allin.android.presenter.MVPPrestener;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * MVPActivity
 * @author Allin
 * 2015.11.24
 */
public class MVPActivity extends BaseActivity<MVPViewListener, MVPPrestener> implements MVPViewListener, OnClickListener{
	/*
	 * 以下全部为视图相关变量，Activity彻底解耦
	 */
	private ListView mListView;
	private EditText mEditText;
	private TextView mCountText;
	private TextView mSortText;
	
	private MVPAdapter mAdapter;
	
	/**
	 * 父类BasePrestener的抽象函数，必须在子类中实现，用来创建具体的Prestener对象
	 * Prestener对象及其生命周期全部交给父类管理，子类只需要创建就可以了
	 */
	@Override
	protected MVPPrestener createPrestener() {
		return new MVPPrestener();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mvp);
		initView(savedInstanceState);
		initData();
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.count:
			String edit = mEditText.getText().toString();
			int value = Integer.parseInt(edit);
			count(value);
			break;
		case R.id.sort:
			sort();
			break;
		default:
			break;
		}
	}
	
	@Override
	public void initView(Bundle savedInstanceState) {
		mListView = (ListView) findViewById(R.id.list);
		mEditText = (EditText) findViewById(R.id.edit);
		mCountText = (TextView) findViewById(R.id.count);
		mSortText = (TextView) findViewById(R.id.sort);
		
		mCountText.setOnClickListener(this);
		mSortText.setOnClickListener(this);
	}
	
	@Override
	public void initData() {
		mPrestener.init(); //数据逻辑交给Prestener去处理
	}

	@Override
	public void showList(int[] array) {
		mAdapter = new MVPAdapter(array);
		mListView.setAdapter(mAdapter);
	}
	
	@Override
	public void sort() {
		mPrestener.sort(); //数据逻辑交给Prestener去处理
	}

	@Override
	public void count(int value) {
		int count = mPrestener.count(value); //数据逻辑交给Prestener去处理
		Toast.makeText(this, String.valueOf(count), Toast.LENGTH_SHORT).show();
	}

}
