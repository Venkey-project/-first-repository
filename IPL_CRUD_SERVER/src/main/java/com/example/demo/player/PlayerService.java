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
		public void savePlayer(PlayerModel model){
		//Convert model to entity

		 playerRepository.save(new Player().Player(model));
		}

		//update player
		public void updatePlayer(PlayerModel model){
//Convert model to entity
		   playerRepository.save(new Player().Player(model));
		}
		//remove player
		public void deletePlayer(int id){
		  playerRepository.deleteById(id);
		}
	
	}


