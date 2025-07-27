package com.gqt.corejava.scsnnerclass;

import java.util.Scanner;

public class WrapperExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the byte data:");
		Byte b = new Byte(scanner.nextByte());
		System.out.println("Byte data = "+b);
		System.out.println("--------------");
		System.out.println("Enter the short data:");
		Short s = new Short(scanner.nextShort());
		System.out.println("Short data = "+s);
		System.out.println("--------------");
		System.out.println("Enter the int data:");
		Integer i = new Integer(scanner.nextInt());
		System.out.println("Int data = "+i);
		System.out.println("--------------");
		System.out.println("Enter the long data:");
		Long l = new Long(scanner.nextLong());
		System.out.println("Long data = "+l);
		System.out.println("--------------");
		System.out.println("Enter the float data:");
		Float f = new Float(scanner.nextFloat());
		System.out.println("Float data = "+f);
		System.out.println("--------------");
		System.out.println("Enter the Double data:");
		Double d = new Double(scanner.nextDouble());
		System.out.println("Double data = "+d);
		System.out.println("--------------");
		System.out.println("Enter the string data:");
		String str = new String(scanner.nextLine());
		scanner.nextLine();
		System.out.println("String data = "+str);
		System.out.println("--------------");
		
		
		
		
	}

}
