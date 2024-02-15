package com.example.demo.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;

	//Get => to get the all the players
	@RequestMapping(value="/players", method=RequestMethod.GET )
	public List<Player> getPlayers() {

		return playerService.getAllThePlayers();
	}
	//Get => to get single player
	@RequestMapping(value="/players/{id}", method = RequestMethod.GET)
	public Player getPlayerById(@PathVariable int id){
		return playerService.getPlayer(id);
	}
	//Post => to save the player
	@RequestMapping(value="/players/save", method = RequestMethod.POST)
	public void savePlayer( @RequestBody PlayerModel body){
		playerService.savePlayer(body);
	}
	//put => to update the player
	@RequestMapping(value="/players/update", method = RequestMethod.PUT)
	public void updatePlayer( @RequestBody PlayerModel body){
		playerService.updatePlayer(body);
	}
	//delete => to delete the data
	@RequestMapping(value="/players/{id}", method = RequestMethod.DELETE)
	public void deletePlayer( @PathVariable int id){
		playerService.deletePlayer(id);
	}

}
