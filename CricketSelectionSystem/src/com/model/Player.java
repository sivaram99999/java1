package com.model;

public class Player {
	private int player_id;
	private String pname;
	private int  age;
	private String city;
	private String prole;
	private String batting_style;
	private String bowling_style;
	private int matches;
	private int runs;
	private int wickets;
	private double strike_rate;
	private double economy_rate;
	private int fitness_status;
	
	
	public Player(){
	
	}
	
	public Player(int player_id) {
		this.player_id = player_id;
		
	}
	
	


	public Player(int matches, int runs, int wickets, double strike_rate, double economy_rate, int fitness_status) {
		super();
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
		this.strike_rate = strike_rate;
		this.economy_rate = economy_rate;
		this.fitness_status = fitness_status;
	}

	public Player(int player_id,String pname, int age, String city, String prole, String batting_style, String bowling_style,
			int matches, int runs, int wickets, double strike_rate, double economy_rate, int fitness_status) {
		super();
		this.player_id = player_id;
		this.pname=pname;
		this.age = age;
		this.city = city;
		this.prole = prole;
		this.batting_style = batting_style;
		this.bowling_style= bowling_style;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
		this.strike_rate = strike_rate;
		this.economy_rate = economy_rate;
		this.fitness_status = fitness_status;
	}
	
	
	
	
	

	public int getPlayer_id() {
		return player_id;
	}


	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getProle() {
		return prole;
	}


	public void setProle(String prole) {
		this.prole = prole;
	}


	public String getBatting_style() {
		return batting_style;
	}


	public void setBatting_style(String batting_style) {
		this.batting_style = batting_style;
	}


	public String getBowling_style() {
		return bowling_style;
	}


	public void setBowling_style(String bowling_style) {
		this.bowling_style = bowling_style;
	}


	public int getMatches() {
		return matches;
	}


	public void setMatches(int matches) {
		this.matches = matches;
	}


	public int getRuns() {
		return runs;
	}


	public void setRuns(int runs) {
		this.runs = runs;
	}


	public int getWickets() {
		return wickets;
	}


	public void setWickets(int wickets) {
		this.wickets = wickets;
	}


	public double getStrike_rate() {
		return strike_rate;
	}


	public void setStrike_rate(double strike_rate) {
		this.strike_rate = strike_rate;
	}


	public double getEconomy_rate() {
		return economy_rate;
	}


	public void setEconomy_rate(double economy_rate) {
		this.economy_rate = economy_rate;
	}


	public int getFitness_status() {
		return fitness_status;
	}


	public void setFitness_status(int fitness_status) {
		this.fitness_status = fitness_status;
	}


	@Override
	public String toString() {
		return "Player [player_id=" + player_id
	            + ", pname=" + pname
	            + ", age=" + age
	            + ", city=" + city
	            + ", prole=" + prole
	            + ", batting_style=" + batting_style
	            + ", bowling_style=" + bowling_style
	            + ", matches=" + matches
	            + ", runs=" + runs
	            + ", wickets=" + wickets
	            + ", strike_rate=" + strike_rate
	            + ", economy_rate=" + economy_rate
	            + ", fitness_status=" + fitness_status
	            + "]";
	}
	
	
	
	
	
	
}
