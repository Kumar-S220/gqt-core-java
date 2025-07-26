package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = scanner.nextInt();
		int k =1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
