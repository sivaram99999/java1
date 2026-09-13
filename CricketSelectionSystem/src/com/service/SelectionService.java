	package com.service;
	
	import java.util.ArrayList; 
    import java.util.List;
	import java.util.Scanner;
	
	import com.dao.PlayerDAO;
	import com.model.Player;
	
	public class SelectionService {
		Scanner sc = new Scanner(System.in);
		PlayerService ps= new PlayerService();
		PlayerDAO pd = new PlayerDAO();
//	SelectionService ss = new SelectionService();
		
		
		
		public void getEligiblePlayers() {
			List<Player> players = pd.getAllPlayers();
	
		    for (Player p : players) {
	
	            if (p.getFitness_status() >= 70 &&
	                p.getMatches() >= 10) {
	
	                System.out.println(p);
	            }
		    }	
		    
		}
		
		///111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		
		public List<Player> selectBatsmen() {

		    List<Player> players = pd.getAllPlayers();
		    List<Player> selectedBatsmen = new ArrayList<>();

		    List<Player> batsmen = new ArrayList<>();
		    List<Double> scores = new ArrayList<>();

		    for (Player p : players) {

		        if (p.getProle().equalsIgnoreCase("Batsman")
		                && p.getFitness_status() >= 70
		                && p.getMatches() >= 10) {

		            double score =
		                    (p.getMatches() / 100.0) * 20
		                  + (p.getRuns() / 5000.0) * 40
		                  + (p.getFitness_status() / 100.0) * 10
		                  + (p.getStrike_rate() / 200.0) * 30;

		            batsmen.add(p);
		            scores.add(score);

		        }
		    }

		    int top = Math.min(4, batsmen.size());

		    System.out.println("\n----- TOP BATSMEN -----");

		    for (int i = 0; i < top; i++) {

		        int maxIndex = 0;

		        for (int j = 1; j < scores.size(); j++) {

		            if (scores.get(j) > scores.get(maxIndex)) {
		                maxIndex = j;
		            }
		        }

		        Player p = batsmen.get(maxIndex);
		        double maxScore = scores.get(maxIndex);

		        System.out.println(
		                (i + 1) + " | "
		                + p.getPlayer_id() + " | "
		                + p.getPname()
		                + " | Score : " + maxScore
		        );
		        selectedBatsmen.add(p);

		        batsmen.remove(maxIndex);
		        scores.remove(maxIndex);
		    }
		    return selectedBatsmen;
		}
		
		///111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111

		public List<Player> selectBowlers() {
			List<Player> selectedBowler = new ArrayList<>();
			List<Player> players = pd.getAllPlayers();
			
			List<Player> bowlers = new ArrayList<>();
		    List<Double> scores = new ArrayList<>();
		    
		    for (Player p : players) {

		        if (p.getProle().equalsIgnoreCase("Bowler")
		                && p.getFitness_status() >= 70
		                && p.getMatches() >= 10) {
		        	
		        double	score =
					        (p.getMatches() / 100.0) * 20
					      + (p.getWickets() / 200.0) * 40
					      + ((10.0 - p.getEconomy_rate()) / 7.0) * 30
					      + (p.getFitness_status() / 100.0) * 10;
		        	
		        
		        	
		        	bowlers.add(p);
		        	scores.add(score);

		        	
		        }
		        
		        }
		    
		    int top = Math.min(3, bowlers.size());

		    System.out.println("********* TOP BOWLERS **********");

		    for (int i = 0; i < top; i++) {

		        int maxIndex = 0;

		        for (int j = 1; j < scores.size(); j++) {

		            if (scores.get(j) > scores.get(maxIndex)) {
		                maxIndex = j;
		            }
		        }

		        Player p = bowlers.get(maxIndex);
		        double maxScore = scores.get(maxIndex);

		        System.out.println(
		                (i + 1) + " | "
		                + p.getPlayer_id() + " | "
		                + p.getPname()
		                + " | Score : " + maxScore
		        );
		        selectedBowler.add(p);

		        bowlers.remove(maxIndex);
		        scores.remove(maxIndex);
		    } 
		    return selectedBowler;
		}
		
		///111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		
		
	public List<Player> selectAllRounders() {
		
		List<Player> selectedAllRounder =new ArrayList<>(); 
		List<Player> players =pd.getAllPlayers();
		List<Player> allrounder = new ArrayList<>();
	    List<Double> scores = new ArrayList<>();
	    
	    for(Player p  : players) {
	    	
	    	  if (p.getProle().equalsIgnoreCase("all rounder")
		                && p.getFitness_status() >= 70
		                && p.getMatches() >= 10) {
	    		  
	    		double score = (p.getWickets() / 200.0) * 30
					      + ((10.0 - p.getEconomy_rate()) / 7.0) * 15
					      + (p.getFitness_status() / 100.0) * 10
					      + (p.getStrike_rate() / 200.0) * 15
					      + (p.getRuns() / 5000.0) * 30;
	    		  

	        	allrounder.add(p);
	        	scores.add(score);
	        		    		  
	    	  }
	    }
	    
	    
	    int top = Math.min(3, allrounder.size());

	    System.out.println(">>>>>>>>> TOP ALL_ROUNDERS <<<<<<<<<<<");

	    for (int i = 0; i < top; i++) {

	        int maxIndex = 0;

	        for (int j = 1; j < scores.size(); j++) {

	            if (scores.get(j) > scores.get(maxIndex)) {
	                maxIndex = j;
	            }
	        }

	        Player p = allrounder.get(maxIndex);
	        double maxScore = scores.get(maxIndex);

	        System.out.println(
	                (i + 1) + " | "
	                + p.getPlayer_id() + " | "
	                + p.getPname()
	                + " | Score : " + maxScore
	        );
	        selectedAllRounder.add(p);

	        allrounder.remove(maxIndex);
	        scores.remove(maxIndex);
	    } 		
	    return selectedAllRounder;
	}
	
	///111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111

	
	public List<Player> selectWicketKeeper() {
		
		List<Player> selectedWicketKeeper = new ArrayList<>();
		List <Player>players = pd.getAllPlayers() ;
		List<Player>wicketkeeper = new ArrayList<>();
		 List<Double> scores = new ArrayList<>();
		 
		 for(Player p : players ) {
				  if (p.getProle().equalsIgnoreCase("wicket keeper")
			                && p.getFitness_status() >= 70
			                && p.getMatches() >= 10) {
		    		  
		    		double 	score = 
							
							+(p.getMatches()/100.0)*25
							+(p.getFitness_status()/100.0)*10
							+(p.getStrike_rate()/200.0)*25
							+(p.getRuns()/5000.0)*40;
		    		  

		        	wicketkeeper.add(p);
		        	scores.add(score);
			            
		    		  
		    	  }
		    }
		    
		    
		    int top = Math.min(1, wicketkeeper.size());

		    System.out.println("########### TOP WICKET_KEEPER ###############");

		    for (int i = 0; i < top; i++) {

		        int maxIndex = 0;

		        for (int j = 1; j < scores.size(); j++) {

		            if (scores.get(j) > scores.get(maxIndex)) {
		                maxIndex = j;
		            }
		        }

		        Player p = wicketkeeper.get(maxIndex);
		        double maxScore = scores.get(maxIndex);

		        System.out.println(
		                (i + 1) + " | "
		                + p.getPlayer_id() + " | "
		                + p.getPname()
		                + " | Score : " + maxScore
		        );
		        selectedWicketKeeper.add(p);

		        wicketkeeper.remove(maxIndex);
		        scores.remove(maxIndex);
		    } 	
		    return selectedWicketKeeper;
		 }
	
	///111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		 
	public void createPlayingXI() {
		
		 List<Player> playing11 = new ArrayList<>();
		 List<Player> batsmen = selectBatsmen();
		    List<Player> allRounders = selectAllRounders();
		    List<Player> bowlers = selectBowlers();
		    List<Player> wicketKeeper = selectWicketKeeper();
		    
		    playing11.addAll(batsmen);
		    playing11.addAll(allRounders);
		    playing11.addAll(bowlers);
		    playing11.addAll(wicketKeeper);
		    System.out.println("\n========== PLAYING XI ==========");
		
		    int count = 1;
		    for (Player p : playing11) {

		        System.out.println(
		                count + " | "
		                + p.getPlayer_id() + " | "
		                + p.getPname() + " | "
		                + p.getProle()
		        );

		        count++;
		    }
		    Player captain = selectCaptain(playing11);

		    Player viceCaptain = selectViceCaptain(playing11, captain);
		    

		    System.out.println("===============================");
		    System.out.println(
		    	    "Captain      : "
		    	    + captain.getPname()
		    	    + " | ID : "
		    	    + captain.getPlayer_id()
		    	);

		    	System.out.println(
		    	    "Vice-Captain : "
		    	    + viceCaptain.getPname()
		    	    + " | ID : "
		    	    + viceCaptain.getPlayer_id()
		    	);
		    System.out.println("Total Players : " + playing11.size());
		}
		    
	
		
	public Player selectCaptain(List<Player> playing11) {

	    Player captain = null;
	    double highestScore = -1;

	    for (Player p : playing11) {

	        double score =
	                (p.getMatches() / 100.0) * 20
	              + (p.getRuns() / 5000.0) * 40
	              + (p.getFitness_status() / 100.0) * 10
	              + (p.getStrike_rate() / 200.0) * 30;

	        if (score > highestScore) {
	            highestScore = score;
	            captain = p;
	        }
	    }

	    return captain;
	}
	
	
	public Player selectViceCaptain(List<Player> playing11, Player captain) {

	    Player viceCaptain = null;
	    double highestScore = -1;

	    for (Player p : playing11) {

	        if (p.getPlayer_id() == captain.getPlayer_id()) {
	            continue;
	        }

	        double score =
	                (p.getMatches() / 100.0) * 20
	              + (p.getRuns() / 5000.0) * 40
	              + (p.getFitness_status() / 100.0) * 10
	              + (p.getStrike_rate() / 200.0) * 30;

	        if (score > highestScore) {
	            highestScore = score;
	            viceCaptain = p;
	        }
	    }

	    return viceCaptain;
	}
	}
	