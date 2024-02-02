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

}
