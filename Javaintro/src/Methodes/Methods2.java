package Methodes;
import java.util.Scanner;
public class Methods2 {
	//import java.util.Scanner;
	static Scanner sc = new Scanner(System.in);
	
	 
	double areaofsqare(double side) {
		return side*side;
	}
	
	
	double areaofrectangle (double l, double b) {
		return l*b;
	}
	
	double areaofcircle(double r) {
		return Math.PI * r * r;
	}
	
	double araeoftriangle(double le, double be) {
		return 0.5*le*be;
		
		
	}
	
	
	

	public static void main(String[] args) {
		Methods2 t = new Methods2();
		
			System.out.println("enter side of sqare : ");
			double side = sc.nextDouble();
			System.out.println("Area of sqare :" + t.areaofsqare(side) );
			
			
			System.out.println("enter leangth  of rectangle : ");
			double l = sc.nextDouble();
			System.out.println("enter breath  of rectangle : ");
			double b = sc.nextDouble();
			double areaofrectangle = t.areaofrectangle(l,b);
			  	System.out.println("Area of triangle :" + areaofrectangle );
			  	
			 System.out.println("enter radious of circle :");
			 double r = sc.nextDouble();
			double areaofcircle = t.areaofcircle(r);
				System.out.println("Area of circle :" + areaofcircle );
				
			System.out.println("enter leangth of triangle :");
			double le = sc.nextDouble();
			System.out.println("enter leangth of triangle :");
			double be = sc.nextDouble();
			double araeoftriangle = t.araeoftriangle(le, be) ;
			System.out.println("Area of circle :" + araeoftriangle );
			
			
			
				
				
		
		

	}

}
