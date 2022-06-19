package com.ab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.model.IPLTeamInfo;
import com.ab.service.IPLTeamInfoService;

@RestController
@RequestMapping("/team")
public class IPLTeamOperationsController {

	//inject service
	@Autowired
	private IPLTeamInfoService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveTeam(@RequestBody IPLTeamInfo info){
		String msg=service.registerTeam(info);
		return ResponseEntity.ok(msg);
	}
	
	@GetMapping("find/{id}")
	public ResponseEntity<IPLTeamInfo> fetchTeamByid(@PathVariable Integer id){
		IPLTeamInfo info = service.findTeamById(id);
		return ResponseEntity.ok(info);
	}
	
	@GetMapping("/all")
	public  ResponseEntity<List<IPLTeamInfo>>  fetchAllTeamsInfo(){
	         List<IPLTeamInfo>  teamsList=service.findAllTeamInfo();
//	         log.info("Fetching All IPL Teams  details ");
	         return  ResponseEntity.ok(teamsList);
	}
	
}
