package com.thymleaf.praxtice1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="players" )

public class Player implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="sport")
	private String sport;
	@Column(name="city")
	private String city;
	@Column(name="club")
	private String club;
	@Column(name="fee")
	private String fee;
	@Lob
	private byte[] photo;
	@Transient
	private List<MultipartFile> file = new ArrayList<MultipartFile>();
	@Transient
	private List<String> removeImages= new ArrayList<String>();

	

	
	
	public Player() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public List<MultipartFile> getFile() {
		return file;
	}
	public void setFile(List<MultipartFile> file) {
		this.file = file;
	}
	public List<String> getRemoveImages() {
		return removeImages;
	}
	public void setRemoveImages(List<String> removeImages) {
		this.removeImages = removeImages;
	}

	
	
	
	
	
	

}
