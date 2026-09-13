package Cricket_Selection;

public class Player {
	 	private String name;
	    private String city;
	    private String role;
	    private int runs;
	    private boolean openingBatter;
	    private boolean leftHanded;	
	    
	    
	    Player(){
	    	System.out.println("NO ARG CONSTRACTOR");
	    }
	    
	    Player(String name, String city , String role){
	    	this.name = name;
	    	this.city = city;
	    	this.role = role;
	  
	    }
	    
	
	    public String getName() {
	        return name;
	    }

	    public String getCity() {
	        return city;
	    }

	    public String getRole() {
	        return role;
	    }

	    public int getRuns() {
	        return runs;
	    }

	    public boolean isOpeningBatter() {
	        return openingBatter;
	    }
  
	    public boolean isLeftHanded() {
	        return leftHanded;
	    }
	    void display() {
	    	System.out.println("NAME :" +name);
	    	System.out.println("CITY :"+ city);
	    	System.out.println("ROLE :" +role);
	    	System.out.println("RUNS :"+ runs);
	    	System.out.println("ARE YOU OPENING BATTER :" + openingBatter);
	    	System.out.println("ARE YOU LEFTHANDED :"+ leftHanded);
	    	
	    }
}
