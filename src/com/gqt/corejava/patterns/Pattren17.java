package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattren17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enyer the size: ");
		int n = sc.nextInt();
		int count = 1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=i;j++) {
				System.out.println(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}
