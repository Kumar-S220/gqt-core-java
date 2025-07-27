package com.gqt.corejava.instancevariable;
class Calculator{
	void add() {
		int a = 10;
		int b = 20;
		int res = a+b;
		System.out.println(res);
	}
void sub(int b, int c) {
	int res = b - c;
	System.out.println(res);
	
}
}
public class local1 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.add();
		c1.sub(30, 10);
	}

}
