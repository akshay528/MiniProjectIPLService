package com.ab.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ab.model.IPLTeamInfo;

@FeignClient("Team-Service")
public interface IPLTeamServiceConsumer {

	@GetMapping("team/find/{id}")
	public ResponseEntity<IPLTeamInfo> findIPLTeamById(@PathVariable Integer id);
	
}
