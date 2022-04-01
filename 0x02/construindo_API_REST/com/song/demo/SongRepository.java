package com.example.demo;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class SongRepository {
   private List<Song> list = new ArrayList<Song>();

   public List<Song> getAllSongs() {
    return list;
   }

   public Song getSongById(Integer id) {
	   	for(Song lista : list ) {
	   		if(lista.getId().equals(id)) {
	   			return lista;
	   		}
	   	}	   	
	   	return null;
   }

   public void addSong(Song s) {
     list.add(s);
   }

   public void updateSong(Song s) {
	   for (Song song : list) {
          	if(song.getId() == s.getId()) {
          		int i = list.indexOf(song);
          		list.set(i, s);
          	}
  		}
   }

   public void removeSong(Song s) {
	   	list.remove(s);
   }
   
}