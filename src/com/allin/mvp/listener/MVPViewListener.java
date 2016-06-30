package com.allin.mvp.listener;
/**
 * MVPViewListener
 * @author Allin
 * 2015.11.24
 */
public interface MVPViewListener extends BaseViewListener{
	
	/**
	 * 创建无序数组并在ListView显示
	 * @param array
	 */
	void showList(int[] array);
	
	/**
	 * 排序然后刷新列表
	 */
	void sort();
	
	/**
	 * 统计有多少项的值为value
	 * @param value
	 */
	void count(int value);

}
