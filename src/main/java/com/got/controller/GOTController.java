package com.got.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.got.entity.GOTCharacter;
import com.got.service.GOTService;


@RestController
@RequestMapping(value = "/got")
public class GOTController {
	
	@Autowired //Object Initialization
	public GOTService gotService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List getAllGOTCharacters() {
		return gotService.getAllGOTCharacters();
	}
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public GOTCharacter getGOTCharacter(@PathVariable("name") String name) {
		return gotService.getGOTCharacter(name);
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes="application/json")
	public String addGOTCharacter(@RequestBody GOTCharacter gotCharacter) {
		return gotService.addGOTCharacter(gotCharacter);
	}

	@RequestMapping(method=RequestMethod.PUT, consumes="application/json")
	public String updateGOTCharacter(@RequestBody GOTCharacter gotCharacter) {
		return gotService.updateGOTCharacter(gotCharacter);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, consumes="application/json")
	public String deleteGOTCharacter(@RequestBody GOTCharacter gotCharacter) {
		return gotService.deleteGOTCharacter(gotCharacter);
	}
	

}
