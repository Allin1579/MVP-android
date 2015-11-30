package com.allin.android.presenter;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * MVP架构中Prestener的基类，主要用于与View建立关联并管理生命周期
 * @author Allin
 * 2015.11.24
 * @param <V> View接口
 */
public abstract class BasePrestener<V> {
	protected Reference<V> mViewRef; //持有一个V的引用，用来调用Activity或Fragment中的视图逻辑
	
	public void attachView(V view){
		mViewRef = new WeakReference<V>(view); //此处使用弱引用，防止因Activity或Fragment异常关闭造成内存泄露
	}
	
	protected V getView(){
		return mViewRef.get();
	}
	
	public boolean isViewAttached(){
		return mViewRef != null && mViewRef.get() != null;
	}
	
	public void detachView(){
		if(mViewRef != null){
			mViewRef.clear();
			mViewRef = null;
		}
	}
	
}
