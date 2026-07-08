package datavariables;
import java.util.Scanner;

public class Methods2 {
	
	int a;
	int b;
	int c;
	
	void add() {
		//int a = 44;
		//int b = 88;
		System.out.println("add of a,b :"  + (a + b));
		
	}
	
	void add1(int a ,int b) {
		System.out.println("add1 of a,b :"  + (a + b));
		
	}
	
	void add2(int a ,int b , int c) {
		System.out.println("add2 of a,b,c :"  + (a + b + c));
	}
	
	void subtract() {
		//int a=10;
		//int b=44;
		System.out.println("sub of a,b :"  + (a - b));
	}
	
	void subtract2( int a, int b) {
		System.out.println("sub of a,b :"  + (a - b));
		
	}
	void subtract3( int a, int b, int c) {
		System.out.println("sub of a,b,c :"  + (a - b - c));
		
	}
	
	void multiply() {
	   // int a =9;
		//int b =2;
		System.out.println("multi of a,b :"+ a*b);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		Methods2 t1 = new Methods2();
		System.out.print("enter  a: ");
		int a=t1.a = input.nextInt();
		System.out.print("enter b: ");
	    int b= t1. b = input.nextInt();
	    System.out.print("enter c :");
	    int c = t1. c = input.nextInt();
		t1.add();
		t1.add1(a,b);
		t1.add2(a, b, c);
		t1.multiply();
		t1.subtract();
		t1.subtract2(a, b);
		t1.subtract3(a, b, c);
	}
	

}
