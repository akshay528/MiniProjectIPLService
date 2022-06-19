package com.ab.service;

import java.util.List;

import com.ab.model.IPLTeamInfo;

public interface IPLTeamInfoService {

	public String registerTeam(IPLTeamInfo info);
	public IPLTeamInfo findTeamById(int id);
	public List<IPLTeamInfo> findAllTeamInfo();
	
	
	
}
