package com.service;

import java.util.List;
import java.util.Scanner;

import com.dao.PlayerDAO;
import com.model.Player;

public class PlayerService {
	static Scanner sc  = new Scanner(System.in);
	PlayerDAO pd = new PlayerDAO();

	
	public void addPlayer() {

	    System.out.println("Enter Player id");
	    int id = sc.nextInt();
	    sc.nextLine();

	    System.out.println("Enter Player name");
	    String pname = sc.nextLine();

	    System.out.println("Enter Player age");
	    int age = sc.nextInt();
	    sc.nextLine();

	    System.out.println("Enter Player city");
	    String city = sc.nextLine();

	    System.out.println("Enter Player prole");
	    String prole = sc.nextLine();

	    System.out.println("Enter Player batting style");
	    String batting_style = sc.nextLine();

	    System.out.println("Enter bowling style");
	    String bowling_style = sc.nextLine();

	    System.out.println("Enter no of matches");
	    int matches = sc.nextInt();

	    System.out.println("Enter Player runs");
	    int runs = sc.nextInt();

	    System.out.println("Enter Player wickets");
	    int wickets = sc.nextInt();

	    System.out.println("Enter Player Strike rate");
	    double strike_rate = sc.nextDouble();

	    System.out.println("Enter Player economy rate");
	    double economy_rate = sc.nextDouble();

	    System.out.println("Enter Player fitness status");
	    int fitness_status = sc.nextInt();
	    if (id > 0 &&
	    	    pname.length() >= 4 &&
	    	    age >= 18 &&
	    	    city.length() >= 3 &&
	    	    fitness_status >= 0 &&
	    	    fitness_status <= 100) {

	        Player p1 = new Player(
	            id, pname, age, city, prole,
	            batting_style, bowling_style,
	            matches, runs, wickets,
	            strike_rate, economy_rate,
	            fitness_status
	        );

	        pd.addplayer(p1);
	    }else {
	    	System.out.println("Invalid player details");
	    }
	}

	public void displayAll() {

	    List<Player> players = pd.getAllPlayers();

	    for (Player p : players) {
	        System.out.println(p);
	    }
	}
	
	public void getplayerbyid() {
		System.out.println("Enter Player id  to get Player info");
		int  id  =  sc.nextInt();
		Player p = new Player(id);
		pd.getPlayerById(p);	
	}
	
	
	public void updateplyer() {
		System.out.println("Enter player id do you want to Update");
		int id = sc.nextInt();
		  System.out.println("Enter updated no of matches");
		    int matches = sc.nextInt();

		    System.out.println("Enter Player updated runs");
		    int runs = sc.nextInt();

		    System.out.println("Enter Player updated wickets");
		    int wickets = sc.nextInt();

		    System.out.println("Enter Player updated Strike rate");
		    double strike_rate = sc.nextDouble();

		    System.out.println("Enter Player updated economy rate");
		    double economy_rate = sc.nextDouble();

		    System.out.println("Enter Player updated fitness status");
		    int fitness_status = sc.nextInt();
		    
		    Player p = new Player(matches, runs, wickets, strike_rate, economy_rate, fitness_status);
		    
		    pd.updatePlayer(id, p);
		    
	}
	
	 public void deleteplayer() {
		 System.out.println("Enter player id to delete data");
		 int id =  sc.nextInt();
		 pd.deletePlayer(id);
		
	}
}
