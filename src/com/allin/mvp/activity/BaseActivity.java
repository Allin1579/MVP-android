package com.allin.mvp.activity;

import com.allin.mvp.presenter.BasePrestener;

import android.app.Activity;
import android.os.Bundle;

/**
 * MVP架构中Activity的基类，主要用于与Prestener建立关联并管理生命周期
 * @author Allin
 * 2015.11.24
 * @param <V> BaseActivity子类需继承的View接口，该接口声明了Activity的各种视图操作逻辑, MVP中的V
 * @param <P> BasePrestener子类, MVP中的P
 */
public abstract class BaseActivity<V, P extends BasePrestener<V>> extends Activity {
	protected P mPrestener; //持有一个Prestener对象的引用，用来调用Prestener中的数据逻辑

	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mPrestener = createPrestener();
		mPrestener.attachView((V)this);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		mPrestener.detachView();
	}
	
	protected abstract P createPrestener(); //mPrestener对象延迟到子类生产
	
}
