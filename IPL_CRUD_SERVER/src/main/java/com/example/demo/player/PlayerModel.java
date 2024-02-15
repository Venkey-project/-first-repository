package com.example.demo.player;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerModel {


    private String name;

    private double matches;

    private double runs;

	@JsonCreator
	public PlayerModel(@JsonProperty("name") String name, @JsonProperty("matches") double matches, @JsonProperty("runs") double runs) {
		this.name = name;
		this.matches = matches;
		this.runs = runs;
	}
}
