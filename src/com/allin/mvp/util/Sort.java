package com.allin.mvp.util;
/**
 * 排序算法
 * @author Allin
 */
public class Sort {
	
	public static void sort(int[] s){
		//算法
		selectSort(s);
	}
	
	/**
	 * 冒泡排序
	 * @param s
	 * @return
	 */
	public static void bubbleSort(int[] s){
		if(s == null || s.length <= 0){
			return;
		}
		
		for(int i = 0; i < s.length; i++){
			for(int j = 0; j < s.length - i - 1; j++){
				if(s[j] > s[j + 1]){
					int temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
	}
	
	/**
	 * 选择排序
	 * @param s
	 * @return
	 */
	public static void selectSort(int[] s){
		if(s == null || s.length <= 0){
			return;
		}
		
		for(int i = 0; i < s.length - 1; i++){ //O = n + (n + 1) + (n + 2) + ... + 1 = O(n^2)
			for(int j = i + 1; j< s.length; j++){
				if(s[i] > s[j]){
					int temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
	}
	
	/**
	 * 插入排序
	 * @param s
	 * @return
	 */
	public static void insertSort(int[] s){
		if(s == null || s.length <= 0){
			return;
		}
	}
	
	/**
	 * 快速排序
	 * @param s
	 * @return
	 */
	public static void fastSort(int[] s){
		if(s == null || s.length <= 0){
			return;
		}
	}
	
	/**
	 * 归并排序
	 * @param s
	 * @return
	 */
	public static void mergerSort(int[] s){
		if(s == null || s.length <= 0){
			return;
		}
	}
	
	/**
	 * 基数排序
	 * @param s
	 * @return
	 */
	public static void cardinalSort(int[] s){
		if(s == null || s.length <= 0){
			return;
		}
	}
	
	/**
	 * 希尔排序
	 * @param s
	 * @return
	 */
	public static void shellSort(int[] s){
		if(s == null || s.length <= 0){
			return;
		}
	}
	
	/**
	 * 堆排序
	 * @param s
	 * @return
	 */
	public static void heapSort(int[] s){
		if(s == null || s.length <= 0){
			return;
		}
	}
	
	/**
	 * 检查排序是否正确
	 * @param s
	 * @return
	 */
	public static boolean isOrder(int[] s){
		for(int i = 0; i< s.length - 1; i++){
			if(s[i] > s[i+1]){
				System.out.println("排序失败");
				return false;
			}
		}
		
		for(int i = 0; i< s.length; i++){
			System.out.println(String.format("s[%d] = %d", i, s[i]));
		}
		System.out.println("排序成功");
		return true;
	}
	
	public static void BubbleSort(){
		int score[] = {67, 69, 75, 87, 89, 90, 99, 100};
        for (int i = 0; i < score.length -1; i++){    //最多做n-1趟排序
            for(int j = 0 ;j < score.length - i - 1; j++){    //对当前无序区间score[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
                if(score[j] < score[j + 1]){    //把小的值交换到后面
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }            
            System.out.print("第" + (i + 1) + "次排序结果：");
            for(int a = 0; a < score.length; a++){
                System.out.print(score[a] + "\t");
            }
            System.out.println("");
        }
        System.out.print("最终排序结果：");
        for(int a = 0; a < score.length; a++){
            System.out.print(score[a] + "\t");
        }
	 }

}
