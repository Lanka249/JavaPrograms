package com.practice;

import java.util.Scanner;

public class SubStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user string:");
		String str = scanner.nextLine();
		int l = str.length();
		System.out.println("SubStrings of given string are:");
		for (int i = 0; i < l; i++) {
			String res = "";
			for (int j = i; j < l; j++) {
				res = res + str.charAt(j);
				System.out.println(res);
			}
		}
	}
}
