package com.spotify.SpotifyApp.models;

//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Playlist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idPlaylist;
	String name;
	String SpotifyPlString;
	/*
	List<Song> songs = new ArrayList<>();
	
	
	public List<Song> getSongs() {
		return null;
	}
	public void setSongs(List<Song> songs) {
		
	}
	*/
	public int getIdPlaylist() {
		return idPlaylist;
	}
	public void setIdPlaylist(int idPlaylist) {
		this.idPlaylist = idPlaylist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpotifyPlString() {
		return SpotifyPlString;
	}
	public void setSpotifyPlString(String spotifyPlString) {
		SpotifyPlString = spotifyPlString;
	}
	
	
	
}
