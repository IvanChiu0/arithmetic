package com.aikine.arithmetic.binaryChop;

/**
 * 二分查找的必须条件：数组是有序的，不然没意义
 * @author Administrator
 *
 */
public class BinaryChop {
	
	/**
	 * 二分查找法
	 * @param key：查找的条件
	 * @param keys：查找的数组
	 * @return
	 */
	public static int search(int key,int[] keys) {
		
		int start = 0;
		int end = keys.length - 1;
		
		if(key == keys[start]) {
			return start;
		}else if(key == keys[end]) {
			return end;
		}
		
		while(start <= end) {
			int mid = (start + end) / 2;
			if(key < keys[mid]) {
				end = mid -1;
			}else if(key > keys[mid]) {
				start = mid + 1;
			}else {
				return mid;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int key = 209;
		int[] keys = new int[100];
		for(int i =127;i <= 226 ; i++) {
			keys[i-127] = i;
		}
		int result = search(key, keys);
		System.out.println("key:" + keys[result]);
		System.out.println("result:" + result);
	}

}
