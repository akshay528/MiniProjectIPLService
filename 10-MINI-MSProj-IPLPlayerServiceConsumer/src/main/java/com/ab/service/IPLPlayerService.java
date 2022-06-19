package com.ab.service;

import java.util.List;

import com.ab.model.IPLPlayerInfo;

public interface IPLPlayerService {

	public  String  registerPlayer(IPLPlayerInfo player);
	public   List<IPLPlayerInfo>   findAllPlayerInfo();
	
}
