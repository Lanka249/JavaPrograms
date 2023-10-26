package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArrays2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element to be added:");
			int ele = scan.nextInt();
			a[i] = ele;
		}
		System.out.println("SubArrays of given array are:");
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					List<Integer> list = new ArrayList<>();
					for (int k = i; k <= j; k++) {
						list.add(a[k]);
					}
					System.out.println(list);
				}
			}
		} else {
			System.out.println("No sub-arrays found for array length zero");
		}
	}
}
