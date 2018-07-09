package com.ph.FootBallApp.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SportsController {
	
	@RequestMapping(value = "/v1/rest/footbal", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public String welcomeHome() {
		return "Helllo";
		
	}
	
	
	@RequestMapping(value = "/v1/rest/footbal", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public String AddPlayers(@Valid @RequestParam(value = "userName") final String userName) {
		System.out.println("The user name is "+ userName );
		return "67990-0000-99009";
	}

}
