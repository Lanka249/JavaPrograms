package com.practice;

import java.util.Scanner;

public class SubArrays {
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
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(a[k] + " ");
				}
				System.out.println();
			}
		}
	}
}
