package constructors;

public class Bikes {
	int bikeId;
	String brand;
	String model;
	String colour;
	double price;
	int engineCC;
	double mileage;
	String fuelType;
	boolean isElectric;

	Bikes() {
		this.bikeId = 1;
		this.brand = "RE";
		this.model = "classic 350";
		this.colour = "black";
		this.price = 150000.00;
		this.engineCC = 350;
		this.fuelType = "petrol";
		this.isElectric = false;

	}

	Bikes(int bikeId, String brand, String colour) {
		this.bikeId = bikeId;
		this.brand = brand;
		this.colour = colour;

	}

	Bikes(int bikeId, String brand, String model, String colour) {
		this.bikeId = bikeId;
		this.brand = brand;
		this.model = model;
		this.colour = colour;

	}
Bikes(double price ,int engineCC ){
	
	
}


	void display() {
		System.out.println("bike id :" + bikeId);
		System.out.println("bike brand :" + brand);
		System.out.println("bike model :" + model);
		System.out.println("bike colour :" + colour);
		System.out.println("bike price :" + price);
		System.out.println("bike engineCC :" + engineCC);
		System.out.println("bike mileage :" + mileage);
		System.out.println("bike fuelType :" + fuelType);

		System.out.println("bike isElectric :" + isElectric);
		System.out.println("--------------------------");
	}

	public static void main(String[] args) {
		Bikes b = new Bikes();
		Bikes b2 = new Bikes(1, "HERO", "X-PLES", "red");
		RoyalEnfield r = new RoyalEnfield();

		b.display();

		b2.display();
		
		r.display();

	}

}

class RoyalEnfield {
	int bikeId;
	String brand;
	String model;
	String colour;
	double price;
	int engineCC;
	double mileage;
	String fuelType;
	boolean isElectric;

	RoyalEnfield() {
		bikeId = 1;
		brand = "honda";
		model = "shine";
		colour = "black";
		price = 150000.00;
		engineCC = 150;
		fuelType = "petrol";
		isElectric = false;

	}

	void display() {
		System.out.println("bike id :" + bikeId);
		System.out.println("bike brand :" + brand);
		System.out.println("bike model :" + model);
		System.out.println("bike colour :" + colour);
		System.out.println("bike price :" + price);
		System.out.println("bike engineCC :" + engineCC);
		System.out.println("bike mileage :" + mileage);
		System.out.println("bike fuelType :" + fuelType);

		System.out.println("bike isElectric :" + isElectric);
		System.out.println("------------");
	}
}
