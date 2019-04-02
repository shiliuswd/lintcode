package com.lintcode.day01;

public class Sqrt {

	
	public static void main(String[] args) {
		System.out.println(sqrt(6));
	}
	
	
	
	public static int sqrt(int x) {
		  if (x <= 1) {
	            return x;
	        }	 
	        int l = 1, h = x;
	        while (l <= h) {
	            int mid = l + (h - l) / 2;
	            int sqrt = x / mid;
	            if (sqrt == mid) {
	                return mid;
	            } else if (sqrt < mid) {
	                h = mid - 1;
	            } else {
	                l = mid + 1;
	            }
	        }
	        return h;
	}
}
