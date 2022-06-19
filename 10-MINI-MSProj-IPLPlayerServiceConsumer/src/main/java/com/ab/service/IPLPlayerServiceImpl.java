package com.ab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.client.IPLTeamServiceConsumer;
import com.ab.model.IPLPlayerInfo;
import com.ab.model.IPLTeamInfo;
import com.ab.repository.IPLPlayerInfoRepo;

@Service
public class IPLPlayerServiceImpl implements IPLPlayerService {

	//inject consumer
	@Autowired
	private IPLTeamServiceConsumer consumer;
	
	//inject repo
	@Autowired
	private IPLPlayerInfoRepo repo;
	
	@Override
	public String registerPlayer(IPLPlayerInfo player) {
		//Consuming the Product Ms serivice through fiegn client
		IPLTeamInfo info = consumer.findIPLTeamById(player.getTeam().getTeamId()).getBody();
		
		//assign team object to player
		player.setTeam(info);
		int id = repo.save(player).getPid();
			return  "Player and his team details saved having the player id::"+id; 
	}

	@Override
	public List<IPLPlayerInfo> findAllPlayerInfo() {
		return repo.findAll();
	}

}
