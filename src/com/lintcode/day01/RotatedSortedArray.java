package com.lintcode.day01;

public class RotatedSortedArray {
	public static void main(String[] args) {
		
		int arrs[]= {6,1,2,3,4,5};
		System.out.println(getRotatedSortedArray(arrs));
		
	}
	
	public static int getRotatedSortedArray(int[] arrs) {
		int left = 0;
		int right = arrs.length-1;
		while(left<=right) {
			int mid = left + (right-left)/2;
			if (arrs[left]<=arrs[mid]) {
				if (arrs[mid]<=arrs[right]) {
					right= right-1;
				}else {
					left= mid+1;
				}
			}else {
				if (arrs[mid]<=arrs[right])
					right=mid;
			}
		}
		return arrs[left];
	}

}
