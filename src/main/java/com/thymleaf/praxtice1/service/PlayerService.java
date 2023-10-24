package com.thymleaf.praxtice1.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.thymleaf.praxtice1.model.Player;

public interface PlayerService {
	List<Player> getAllPlayers();
	String saveFile();
	//String Pic(Player pic);
	

}
