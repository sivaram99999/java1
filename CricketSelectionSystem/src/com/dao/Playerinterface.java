package com.dao;

import java.util.List;

import com.model.Player;

public interface Playerinterface {
	public void addplayer(Player p1);
	public List<Player> getAllPlayers();
	public void getPlayerById(Player p);
	public void updatePlayer(int player_id , Player p2);
	public void deletePlayer(int player_id);
//	void updateBatterinfo();
	

}
