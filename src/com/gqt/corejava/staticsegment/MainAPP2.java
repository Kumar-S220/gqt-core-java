// same as previous program but using static variable for rate variable to same memory
package com.gqt.corejava.staticsegment;
import java.util.Scanner;
class Farmer1{
	double principle;
	static double rate;
	double time;
	double si;
	
static {
		rate = 2.789;
	}
	
void collectData() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Principle : ");
	principle = sc.nextDouble();
	System.out.println("Enter the time : ");
	time = sc.nextDouble();
	}
void calculate() {
	si = (principle*rate*time)/100;
}
void display() {
	System.out.println("SI = "+ si);
}
}
public class MainAPP2 {

	public static void main(String[] args) {
		Farmer1 f1 = new Farmer1();
		Farmer1 f2 = new Farmer1();
		Farmer1 f3 = new Farmer1();
		System.out.println("Farmer - 1");
		f1.collectData();
		f1.calculate();
		f1.display();
		System.out.println("---------------------------");
		System.out.println("Farmer - 2");
		f2.collectData();
		f2.calculate();
		f2.display();
		System.out.println("----------------------------");
		System.out.println("Farmer - 3");
		f3.collectData();
		f3.calculate();
		f3.display();
		

	}

}
