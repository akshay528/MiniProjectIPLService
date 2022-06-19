package com.ab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class IPLTeamInfo {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "t_seq", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1" , strategy = GenerationType.SEQUENCE)
	private Integer teamId;
	private String teamName;
	private String location;
	private String owner;
	private String captain;
	
	
	
	
}
