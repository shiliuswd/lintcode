package com.lintcode.day01;

public class ClassicBinarySearch {

	public static void main(String[] args) {
		int nums[]= {1,2,2,4,5,5};	
		int index = findPosition(nums, 2);
		System.out.println(index);
	}
	
	public static int findPosition(int[] nums,int target) {
		int head=0;
		int tail= nums.length;
		int mid=0;
		int getMid=0;
		if(nums.length==0) {
			return -1;
		}
		while(head<tail) {
			mid=(head+tail)/2;
			getMid=nums[mid];
			if(getMid>target) {
				tail=mid-1;
			}else if (getMid<target) {
				head= mid+1;
			}else {
				return mid;
			} 
		}
		return -1;
	}
}
