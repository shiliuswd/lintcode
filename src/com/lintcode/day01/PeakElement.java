package com.lintcode.day01;

public class PeakElement {

	public static void main(String[] args) {
		int arr[] ={1,3,5,3,2,6};
		System.out.println(findPeakElement(arr));
	}
	
	public static int findPeakElement(int[] arrs){
		
		int left =0; int right = arrs.length-1;
		
		while(left<right){
			int mid = left+(right-left)/2;
			if(arrs[mid]<arrs[mid+1]){
				left= mid+1;
			}else{
				right=mid;
			}
		}
		return left;
	}
	
}
