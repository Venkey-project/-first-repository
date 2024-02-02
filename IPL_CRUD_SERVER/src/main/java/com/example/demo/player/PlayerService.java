package com.example.demo.player;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	@Autowired
	private PlayerRepository playerRepository;
	
	private List<Player> list=new ArrayList<>();


	// get player list
	public List<Player> getAllThePlayers(){
		List<Player> playerList=new ArrayList<>();
		playerRepository.findAll().forEach(playerList::add);
		return playerList;
	}
	// get single player
	public Player getPlayer(int id) {
		Optional<Player> optionalPlayer=playerRepository.findById(id);
		
		if(optionalPlayer.isPresent()) {
			return optionalPlayer.get();
		}
		return null;
		}
		//save player
		public void savePlayer(Player player){

		 playerRepository.save(player);
		}

		//update player
		public void updatePlayer(Player player){

		   playerRepository.save(player);
		}
		//remove player
		public void deletePlayer(int id){
		  playerRepository.deleteById(id);
		}
	
	}


