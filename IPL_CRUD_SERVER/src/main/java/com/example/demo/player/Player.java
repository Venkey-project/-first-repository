package com.example.demo.player;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="PLAYER")
@Getter
@Setter
@NoArgsConstructor
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="PLAYER_ID")
	private int id;
	
	@Column(name="PLAYER_NAME")
	private String name;

	@Column(name="matches")
	private Double matches;

	@Column(name="runs")
	private Double runs;

	@Column(name="average")
	private Double average;


	 //getters and setters
	
	public Player(int i, Object object) {
		// TODO Auto-generated constructor stub
	}
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/

	public Player Player(PlayerModel model) {
		Player player = new Player();
		System.out.println("Name : "+player.name);
		player.setName(model.getName());
		player.setRuns(model.getRuns());
		player.setMatches(model.getMatches());
		player.setAverage(model.getRuns()/model.getMatches());
		return player;
	}

}
