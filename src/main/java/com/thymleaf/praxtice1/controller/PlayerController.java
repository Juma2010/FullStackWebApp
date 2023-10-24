package com.thymleaf.praxtice1.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.thymleaf.praxtice1.model.Player;
import com.thymleaf.praxtice1.model.PlayerFiles;
import com.thymleaf.praxtice1.service.PlayerService;
import com.thymleaf.praxtice1.service.UpLoadService;

@Controller
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	@Autowired
	private UpLoadService uploadService;
	
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listPLayers",playerService.getAllPlayers());
		return "index";
		
	}
	
	@RequestMapping("/golf")
	public String view() {
		//model.addAttribute("listPLayers",playerService.getAllPlayers());
		return "golf";
	}
	
	@RequestMapping("/sport")
	public ModelAndView sport(){
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("sport");
	    return mv;
	}
	
//	@RequestMapping(value = "image/{imageName}")
//	@ResponseBody
//	public byte[] getImage(@PathVariable(value = "imageName") String imageName) throws IOException {
//
//	    File serverFile = new File("/home/user/uploads/" + imageName + ".jpg");
//
//	    return Files.readAllBytes(serverFile.toPath());
	
	
	@RequestMapping("/form")
	public String showForm(Model model) {
		PlayerFiles player= new PlayerFiles();
		model.addAttribute("player", player);
		
		return "form";
		
	}
	
	@PatchMapping("/form")
	
	public String submit(@ModelAttribute("player")PlayerFiles player) {
		System.out.println(player);
		return "register_done";
		
	}
	
	
	
	@GetMapping("/index")
	public String index() {
		return "redirect:/";
	}

}

