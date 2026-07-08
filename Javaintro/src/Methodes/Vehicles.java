package Methodes;

public class Vehicles {
	String name;
	String brand;
	int price;
	
	Vehicles(){
		System.out.println("NO-ARG of vehicles");
	}
	
	Vehicles(String name){
		System.out.println("NO-ARG of vehicles");
	}
	
	Vehicles(String name,String brand){
		this("bmw2");
		
		System.out.println("NO-ARG of vehicles");
	}
	
	Vehicles(String name,String brand,int price){
		this("audi","b6");
		this.name=name;
		this.brand=brand;
		this.price=price;
		
		System.out.println("NO-ARG of vehicles");
	}
	
	
	
	public static class car extends Vehicles{
		
		car(){
			System.out.print("NO- arg of car");
		}
		
		car(String name,String brand,int price){
			super(name,brand,price);
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			car c1 = new car();
			c1.display();
			
			

		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vehicles v1 = new  Vehicles ();
		// v1.display();
		

	}
	
	void display() {
		System.out.println("Name of Vehicle :" + name);
		System.out.println("Brand of Vehicle :" + brand);
		System.out.println("Price of Vehicle :" + price);
		
	} 

}
