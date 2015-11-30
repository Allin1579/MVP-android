package com.allin.android.presenter;

import com.allin.android.listener.MVPViewListener;
import com.allin.android.util.Factory;
import com.allin.android.util.Sort;

/**
 * MVPPrestener
 * @author Allin
 * 2015.11.24
 */
public class MVPPrestener extends BasePrestener<MVPViewListener> {
	private int[] array;
	
	public void init(){
		array = Factory.createArray(1000);
		getView().showList(array);
	}

	public void sort(){
		Sort.sort(array);
		getView().showList(array);
	}
	
	public int count(int value){
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if(value == array[i]){
				count++;
			}
		}
		
		return count;
	}

}
