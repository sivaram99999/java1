package Fooddeliverysystem;

public class Foodorder { 
	
	int Orderid;
	String Coustomername;
	String Restaurantname;
	String Itemname;
	double Quantity;
	double price;
	
	Foodorder(int Orderid, String Coustomername,String Itemname ){
		this.Orderid=Orderid;
		this.Coustomername= Coustomername;
		this.Itemname=Itemname;
		display();
		System.out.println("------------------------------------------");
		
	}
	Foodorder(int Orderid, String Coustomername,String Restaurantname,String Itemname ){
		this.Orderid=Orderid;
		this.Coustomername= Coustomername;
		this.Restaurantname=Restaurantname;
		this.Itemname=Itemname;
		display();
		System.out.println("------------------------------------------");
	}
	
	Foodorder(int Orderid, String Coustomername,String Restaurantname,String Itemname,double price ){
		this.Orderid=Orderid;
		this.Coustomername= Coustomername;
		this.Restaurantname=Restaurantname;
		this.Itemname=Itemname;
		this.price= price;
		display();
		System.out.println("------------------------------------------");
		
	}

	void display() {
		System.out.println("Oreder id :" + Orderid);
		System.out.println("Coustomername :" + Coustomername);
		System.out.println("Restaurantname :" + Restaurantname);
		System.out.println("Itemname:" + Itemname);
		System.out.println("Quantity :" + Quantity);
		System.out.println("price :" + price);
		
	}

	public static void main(String[] args) {
		
		Foodorder f1=new Foodorder(101,"siva","puri");
		Foodorder f2=new Foodorder(102,"ram","Paradise","puri");
		Foodorder f3=new Foodorder(103,"krishna","Mehfil","Biryani",289.2);
		
		
		
		
		

	}

}
