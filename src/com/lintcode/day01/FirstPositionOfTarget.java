package com.lintcode.day01;

public class FirstPositionOfTarget {

	public static void main(String[] args) {
		int arrs[]= {1,2,2,2,2,3,5,6,7,9};
		System.out.println(firstIndex(arrs, 2));
	}
	
	public static int firstIndex(int nums[],int target) {
		int left = 0; int right = nums.length-1;
		
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(nums[mid]<target) {
				left=mid+1;
			}else if(nums[mid]>=target) {
				right=mid-1;
			}
		}
		if(left<=nums.length&&nums[left]==target) {
			return left;
		}
		return -1;
	}
	

}
