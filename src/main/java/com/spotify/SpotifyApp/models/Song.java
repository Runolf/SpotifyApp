package com.spotify.SpotifyApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Song {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idSong;
	String name;
	String SpotifySongString;
	
	
	public int getIdSong() {
		return idSong;
	}
	public void setIdSong(int idSong) {
		this.idSong = idSong;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpotifySongString() {
		return SpotifySongString;
	}
	public void setSpotifySongString(String spotifySongString) {
		SpotifySongString = spotifySongString;
	}
	
	
	
}
