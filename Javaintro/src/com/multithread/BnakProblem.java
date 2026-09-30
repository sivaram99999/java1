	package com.multithread;
	
	
	 class BankAccount {
		 
		 int total_amount = 10000;
	
		synchronized void Withdrow ( String name, int amount) {
			 
			 if (amount <= total_amount){
				 try {
					 Thread.sleep(1000);
				//	 wait();

				 }catch(Exception e) {
					 System.out.println(e);
				 }
				 
				 total_amount  = total_amount - amount;
				 
				 System.out.println("welcome to  vcube bank");
				 System.out.println("withdrow completed  mr/ms :"+ name);
				 System.out.println("withdrow amount "+ amount);
				 System.out.println("balance amount " + total_amount);
			//	 notify();
				 
				 
				 
			 }else {
				 System.out.println("withdrow failed " + name);
				 System.out.println("balance amount " + total_amount);
			 }
			 
		 }
		
	}
	 
	 class customer  extends Thread {
		 BankAccount ba;
		 String name;
		 int amount;
		 
		 
		 public customer(BankAccount ba, String name, int amount) {
			super();
			this.ba = ba;
			this.name = name;
			this.amount = amount;
		 }
		 
		 @Override
		 public void run() {
			 ba.Withdrow(name, amount);
			 
		 }
		 
		 
		 
	 }
	
	
	public class BnakProblem {
	
		public static void main(String[] args) {
			BankAccount ba = new BankAccount();
			
			customer siva = new customer(ba, "siva", 2000);
			siva.start();
		//	notify();
			
			customer ram = new customer(ba, "ram", 6000);
			
			ram.start();
	
		}
	
	}
