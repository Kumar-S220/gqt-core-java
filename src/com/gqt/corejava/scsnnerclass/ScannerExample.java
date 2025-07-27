package com.gqt.corejava.scsnnerclass;

import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte data :");
		byte b = sc.nextByte();
		System.out.println("Byte data ="+b);
		System.out.println("--------------------");
		System.out.println("Enter the short data :");
		short s = sc.nextShort();
		System.out.println("Short data = "+ s);
		System.out.println("---------------------");
		System.out.println("Enter int data :");
		int i = sc.nextInt();
		System.out.println("Int data ="+i);
		System.out.println("----------------------");
		System.out.println("Enter the long data :");
		long l = sc.nextLong();
		System.out.println("Long data ="+l);
		System.out.println("--------------------");
		System.out.println("Enter the float data :");
		float f = sc.nextFloat();
		System.out.println("Float data ="+f);
		System.out.println("--------------------");
		System.out.println("Enter the double data :");
		double d = sc.nextDouble();
		System.out.println("Double data ="+d);
		System.out.println("--------------------");
		System.out.println("Enter the String :");
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println("String data ="+str);
		sc.close();
	}

}
