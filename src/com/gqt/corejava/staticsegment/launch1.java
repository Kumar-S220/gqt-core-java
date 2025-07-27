package com.gqt.corejava.staticsegment;
class Program1
{
    int a, b, c; // Non- static variable
    static int p,q,r; // static variable

    //Non-static variable
    {
        a = 100;
        b = 200;
        c = 300;
    }
    static {
        p = 111;
        q = 222;
        r = 333;
    }
    // Non-static method
    void display1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    //Static method
    static void display2(){
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
    
}


public class launch1 {

	public static void main(String[] args) {
		Program1.display2();
        Program1.p = 7000;
        Program1.display2();
        Program1 p1 = new Program1();
        p1.display1();
        p1.display2();

	}

}
