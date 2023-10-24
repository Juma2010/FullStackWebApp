package com.thymleaf.praxtice1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thymleaf.praxtice1.model.Player;
import com.thymleaf.praxtice1.model.PlayerFiles;
@Repository
public interface PlayerFilesRepository extends JpaRepository<PlayerFiles, Long>{
	
	//List<Player> players findAll();

}
