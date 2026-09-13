package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Player;
import com.utility.Conections;



public class PlayerDAO implements Playerinterface {
	Connection con = null;
	
	public void addplayer(Player p1) {
		try {
		con =Conections.getConnection();
		PreparedStatement ps= con.prepareStatement("insert into players  (player_id,pname,age,city,prole,batting_style, bowling_style, matches, runs, wickets, strike_rate, economy_rate, fitness_status) values (?,?,?,?,?,?,?,?,?,?,?,?,?) ");
		ps.setInt(1, p1.getPlayer_id());
		ps.setString(2, p1.getPname());
		ps.setInt(3, p1.getAge());
		ps.setString(4, p1.getCity());
		ps.setString(5, p1.getProle());
		ps.setString(6, p1.getBatting_style());
		ps.setString(7, p1.getBowling_style());
		ps.setInt(8, p1.getMatches());
		ps.setInt(9, p1.getRuns());
		ps.setInt(10, p1.getWickets());
		ps.setDouble(11, p1.getStrike_rate());
		ps.setDouble(12, p1.getEconomy_rate());
		ps.setInt(13, p1.getFitness_status());
		
		int result = ps.executeUpdate();
		
		if (result > 0) {
            System.out.println("Player inserted successfully");
        }
		else {
			System.out.println("something is went worng!!!!!");
		}
		
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public List<Player> getAllPlayers() {

	    List<Player> players = new ArrayList<>();

	    try {

	        con = Conections.getConnection();

	        PreparedStatement ps =
	                con.prepareStatement("SELECT * FROM players");

	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {

	            Player p = new Player(
	                rs.getInt("player_id"),
	                rs.getString("pname"),
	                rs.getInt("age"),
	                rs.getString("city"),
	                rs.getString("prole"),
	                rs.getString("batting_style"),
	                rs.getString("bowling_style"),
	                rs.getInt("matches"),
	                rs.getInt("runs"),
	                rs.getInt("wickets"),
	                rs.getDouble("strike_rate"),
	                rs.getDouble("economy_rate"),
	                rs.getInt("fitness_status")
	            );

	            players.add(p);
	        }

	    } catch (Exception e) {
	        System.out.println(e);
	    }

	    return players;
	}
		
	

	@Override
	public void getPlayerById(Player p) {
		try {
			con = Conections.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Players where player_id = ?");
			ps.setInt(1, p.getPlayer_id());
			
			ResultSet rs  = ps.executeQuery();
			
			while(rs.next()) {

			    System.out.println(rs.getInt(1) + " : " +rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getString(4) + " : " + rs.getString(5) + " : " + rs.getString(6) + " : " +
			    rs.getString(7) + " : " + rs.getInt(8) + " : " + rs.getInt(9) + " : " + rs.getInt(10) + " : " + rs.getDouble(11) + " : " + rs.getDouble(12) + " : " + rs.getDouble(13));
			        }
			
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		
	}

	@Override
	public void updatePlayer(int player_id ,Player p2) {
		
		try{ 
		con = Conections.getConnection();
		
		PreparedStatement ps1= con.prepareStatement("select player_id from players where player_id=?");
		ps1.setInt(1, player_id);
		ResultSet rs  = ps1.executeQuery();
		int count = 0;
		if(rs.next()) {
			count++;
		}
		
		if(count>0) {
			
			PreparedStatement ps = con.prepareStatement("update players set matches = ? , runs = ?, wickets=? ,strike_rate = ?, economy_rate=?, fitness_status=? where player_id=?");
			ps.setInt(1, p2.getMatches());
			ps.setInt(2, p2.getRuns());
			ps.setInt(3, p2.getWickets());
			ps.setDouble(4, p2.getStrike_rate());
			ps.setDouble(5, p2.getEconomy_rate());
			ps.setInt(6, p2.getFitness_status());
			ps.setInt(7, player_id);
			
			int n = ps.executeUpdate();
			
			if(n>0) {
				System.out.println(n + "updates are done");
			}else {
				System.out.println("something is went worng");
			}
			
		}else {
			System.out.println("");
		}
		
		
		
		//PreparedStatement ps = con.prepareStatement("update players set matches = ? , runs = ?, wickets=? ,strick_rate = ?, economy_rate=?, fitness_status=? ");
		//matches, runs, wickets, strike_rate, economy_rate, fitness_status
		
		
	//	ResultSet rs  = ps.executeQuery();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	@Override
	public void deletePlayer(int player_id) {
		try {
			con = Conections.getConnection();
			PreparedStatement ps1= con.prepareStatement("select player_id from players where player_id=?");
			ps1.setInt(1, player_id);
			ResultSet rs  = ps1.executeQuery();
			int count = 0;
			if(rs.next()) {
				count++;
			}
			if(count > 0) {
				PreparedStatement ps2= con.prepareStatement("DELETE FROM players WHERE player_id = ?");
				ps2.setInt(1, player_id);
				int n = ps2.executeUpdate();
				
				if(n>0) {
					System.err.println(n+"Delete was done ");
				}
				else {
					System.out.println("Some thing is went wrong");
				}
			}else {
				System.out.println("Your are looking id was not in the data base");
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

	
	
	
	
	

}

