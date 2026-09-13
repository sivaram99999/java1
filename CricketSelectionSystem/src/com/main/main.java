package com.main;



import com.service.PlayerService;
import com.service.SelectionService;

public class main {

	public static void main(String[] args) {
		PlayerService ps= new PlayerService();
		SelectionService ss= new SelectionService();
		
	//	ss.getEligiblePlayers();
	
		
//		ps.addPlayer();
	//ps.displayAll();
	//	ps.getplayerbyid();
	//	ps.updateplyer();
	//	ps.deleteplayer();
	//ss.selectBatsmen();
		ss.createPlayingXI();
		
	}
	

}