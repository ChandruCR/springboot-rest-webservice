package com.got.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.got.dao.GOTDao;
import com.got.entity.GOTCharacter;

@Service
public class GOTService {
	
	@Autowired //Object Initialization
	public GOTDao gotDao;
	
	
	public List<String> getAllGOTCharacters(){
		return gotDao.getAllGOTCharacters();
	}
	
	public GOTCharacter getGOTCharacter(String name) {
		return gotDao.getGOTCharacter(name);
	}
	
	public String addGOTCharacter(GOTCharacter gotCharacter){
		return gotDao.addGOTCharacter(gotCharacter);
	}
	
	public String deleteGOTCharacter(GOTCharacter gotCharacter) {
		if(gotDao.getGOTCharacter(gotCharacter.getFullName()) != null) {
			return gotDao.deleteGOTCharacter(gotCharacter.getFullName());
		}
		else
			return "Game of Thrones Character not found in Database";
	}
	public String updateGOTCharacter(GOTCharacter gotCharacter) {
		if(gotDao.getGOTCharacter(gotCharacter.getFullName()) != null) {
			return gotDao.updateGOTCharacter(gotCharacter);
		}
		else 
			return "Game of Thrones Character not found in Database";
	}
}
