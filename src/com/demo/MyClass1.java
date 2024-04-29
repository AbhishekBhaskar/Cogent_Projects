package com.demo;
import java.util.*;

public class MyClass1 {

	public static void main(String args[]) {
//		int arr[] = {5, 3, 9, 4, 1, 7};
//		int max = 0;
//		for (int i=0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("Max is " + max);
		
//		sorting
//		for (int i=0; i < arr.length-1; i++) {
//			int temp = 0;
//			for (int j=i+1; j < arr.length; j++) {
//				if (arr[j]<arr[i]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//		
//		System.out.println("Sorted array is");
//		for (int i=0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
//		smallest missing number
		int arr[] = {5, 3, -9, 4, 1, 7};
		int count = 1;
		while(true) {
			boolean flag = true;
			int c = 0;
			for (int i=0; i < arr.length; i++) {
				if (arr[i] == count) {
					c=1;
				} 
			}
			if (c==0) {
				System.out.println("Missing number is " + count);
				break;
			}
			count++;
		}
	}
}
