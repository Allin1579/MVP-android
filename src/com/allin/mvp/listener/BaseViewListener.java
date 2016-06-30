package com.allin.mvp.listener;

import android.os.Bundle;

/**
 * BaseViewListener
 * @author Allin
 * 2015.11.24
 */
interface BaseViewListener {

	/**
	 * 初始化View
	 * @param savedInstanceState
	 */
	void initView(Bundle savedInstanceState);
	
	/**
	 * 初始化数据
	 */
	void initData();
	
}
