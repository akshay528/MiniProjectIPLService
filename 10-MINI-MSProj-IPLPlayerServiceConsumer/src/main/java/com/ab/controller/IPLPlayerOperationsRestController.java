package com.ab.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.model.IPLPlayerInfo;
import com.ab.service.IPLPlayerService;

@RestController
@RequestMapping("/player")
public class IPLPlayerOperationsRestController {

	//inject the service
	@Autowired
	private IPLPlayerService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> savePlayer(@RequestBody IPLPlayerInfo info){
		//use service
		String msg = service.registerPlayer(info);
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("/all")
	public   ResponseEntity<List<IPLPlayerInfo>>  fetchAllPlayerInfo(){
		//use service
		List<IPLPlayerInfo> list=service.findAllPlayerInfo();
		//log.info("Retrieving  All Players Info");
		return  ResponseEntity.ok(list);
	}

	
}
