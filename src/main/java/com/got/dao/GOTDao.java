package com.got.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.got.entity.GOTCharacter;

@Repository
public class GOTDao {

	// Dummy database created using static variable and static block
	public static Map<String, GOTCharacter> allCharacters = new HashMap<>();
	static {
		allCharacters.put("Jon Snow", new GOTCharacter("Jon", "Snow", "Stark", Arrays.asList("Knower of Nothing", "Bastard of Winterfell", "King in the North", "Lord Commander of Nights Watch")));
        allCharacters.put("Tyrion Lannister", new GOTCharacter("Tyrion", "Lannister", "Lannister", Arrays.asList("Imp", "Half-Man", "Hand of the Queen")));
		allCharacters.put("Arya Stark", new GOTCharacter("Arya", "Stark", "Stark", Arrays.asList("Noone", "Faceless Man")));
		allCharacters.put("Daenerys Targaryen",  new GOTCharacter("Daenerys", "Targaryen", "Targaryen", Arrays.asList("Mother of Dragons", "Breaker of Chains", "Khaleesi")));
	}
	
	// Getting all GOTCharacters from database
	public List<GOTCharacter> getAllGOTCharacters(){
		return new ArrayList<GOTCharacter>(allCharacters.values());
	}
	
	// Getting a GOTCharacter 
	public GOTCharacter getGOTCharacter(String name){
		return (allCharacters.get(name));
	}
	
	// Adding a GOTCharacter 
	public String addGOTCharacter(GOTCharacter gotCharacter){
		try{
			allCharacters.put(gotCharacter.getFullName(), gotCharacter);
			return "Success";
		}catch(Exception e) {
			return "Failed";
		}
	}
	
	// Deleting a GOTCharacter
	public String deleteGOTCharacter(String name) {
		try{
			allCharacters.remove(name);
			return "Success";
		}
		catch(Exception e) {
			return "Failed";
		}
	}
	
	// Updating a GOTCharacter
	public String updateGOTCharacter(GOTCharacter gotCharacter) {
		try{
			allCharacters.put(gotCharacter.getFullName(), gotCharacter);
			return "Success";
		}
		catch(Exception e) {
			return "Failed";
		}
	}
}
