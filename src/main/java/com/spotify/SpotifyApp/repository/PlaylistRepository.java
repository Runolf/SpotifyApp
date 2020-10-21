package com.spotify.SpotifyApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.spotify.SpotifyApp.models.Playlist;

public interface PlaylistRepository extends CrudRepository<Playlist, Integer>{

}
