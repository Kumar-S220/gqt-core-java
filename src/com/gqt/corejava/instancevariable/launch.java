package com.gqt.corejava.instancevariable;
class Dog {
	String name;
	String color;
	String breed;
	int cost;
	
void allocateData() {
	name = "Rocky";
	color = "Black";
	breed = "GS";
	cost = 7000;
}

void displayData() {
	System.out.println(name);
	System.out.println(color);
	System.out.println(breed);
	System.out.println(cost);
	
	}

}


public class launch {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "Sammy";
		d1.allocateData();
		d1.displayData();

	}

}
