package com.service;

import com.model.Player;

public interface serviceinterface {
	public void addPlayer(Player p);
	public void getAllPlayers();
	public void getPlayerById(int playerId);
	public void updatePlayer(int playerId, Player p);
	public void deletePlayer(int playerId);

}
