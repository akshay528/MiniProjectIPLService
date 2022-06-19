package com.ab.service;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.model.IPLTeamInfo;
import com.ab.repository.IPLTeamInfoRepository;

@Service
public class IPLTeamInfoServiceImpl implements IPLTeamInfoService {

	private Logger logger = LoggerFactory.getLogger(IPLTeamInfoServiceImpl.class);
	
	//inject the repo
	@Autowired
	private IPLTeamInfoRepository repo;
	
	
	@Override
	public String registerTeam(IPLTeamInfo info) {
		int id = repo.save(info).getTeamId();
		logger.info("Team registered succesfully::"+id);
		return "Team registered succesfully with id ::"+id;
	}

	@Override
	public IPLTeamInfo findTeamById(int id) {
		logger.info("Getting  IPLTeam info by id {}"+id);
		return repo.findById(id).get();
	}

	@Override
	public List<IPLTeamInfo> findAllTeamInfo() {
		logger.info("Getting  all IPL Team details ");
		return repo.findAll();
		
	}

}
