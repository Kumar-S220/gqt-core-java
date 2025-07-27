//collect Aadhar data from farmers 
package com.gqt.corejava.staticsegment;
import java.util.Scanner;
class Farmer2{
	static String nationality;
	String name;
	int dob;
	String gender;
	String location;
	int Aadhar;
static {
	nationality = "India";
}
	
void collectData() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name : ");
	name = sc.next();
	System.out.println("Enter your DOB : ");
	dob = sc.nextInt();
	System.out.println("Enter your Gender :  ");
	gender = sc.next();
	System.out.println("Enter your Location : ");
	location = sc.next();
	System.out.println("Enter your Aadhar number : ");
	Aadhar = sc.nextInt();
}
void displayData() {
	System.out.println(nationality);
	System.out.println(name);
	System.out.println(dob);
	System.out.println(gender);
	System.out.println(location);
	System.out.println(Aadhar);
	
	
}
	
	
	
	
	
}

public class MainApp {

	public static void main(String[] args) {
		Farmer2 f1 = new Farmer2();
		Farmer2 f2 = new Farmer2();
		System.out.println("Farmer - 1");
		f1.collectData();
		f1.displayData();
		System.out.println("---------------");
		System.out.println("Farmer - 2");
		f2.collectData();
		f2.displayData();
	}

}
