package com.thymleaf.praxtice1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.thymleaf.praxtice1.model.Player;
import com.thymleaf.praxtice1.repository.PlayerRepository;
@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	private PlayerRepository playerrepository;

	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerrepository.findAll();
	}

	@Override
	public String saveFile() {
		// TODO Auto-generated method stub
		return null;
	}

		
	
}
