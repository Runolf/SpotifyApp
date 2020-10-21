package com.spotify.SpotifyApp;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spotify.SpotifyApp.models.Playlist;
import com.spotify.SpotifyApp.models.Song;
import com.spotify.SpotifyApp.repository.PlaylistRepository;
import com.spotify.SpotifyApp.repository.SongRepository;

@SpringBootTest
class SpotifyAppApplicationTests {
	
	@Autowired
	SongRepository SR;
	
	@Autowired
	PlaylistRepository PR;
	
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void test1() {
		Playlist pl = new Playlist();
		//Song song1 = new Song();
		//Song song2 = new Song();
		
		pl.setName("Spot Play");
		pl.setSpotifyPlString("777");
		//pl.setSongs(new ArrayList<Song>());
		
		//song1.setName("Fehu");
		//song1.setSpotifySongString("145");
		
		//song2.setName("Jerk");
		//song2.setSpotifySongString("74123");
		
		//pl.getSongs().add(song1);
		//pl.getSongs().add(song2);
		
		//SR.save(song1); // save in db
		//SR.save(song2);
		
		PR.save(pl);
	}
}
