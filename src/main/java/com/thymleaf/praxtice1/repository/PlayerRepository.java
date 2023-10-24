package com.thymleaf.praxtice1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thymleaf.praxtice1.model.Player;
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{
	
	//List<Player> players findAll();

}
