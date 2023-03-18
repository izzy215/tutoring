package com.tutoring.firstweek.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tutoring.firstweek.domain.Vaiv;
import com.tutoring.firstweek.mybatis.mapper.VaivMapper;

@Service
public class VaivServiceImpl {

	private VaivMapper dao;
	public VaivServiceImpl(VaivMapper dao) {
		this.dao=dao;
	}
public List<Press> getBoardList(int page, int limit) {
		
		HashMap<String,Integer>map = new HashMap<String,Integer>();
		int startrow = (page-1)*limit+1;
		int endrow = startrow+limit-1;
		map.put("start",startrow);
		map.put("end", endrow);
		
		return dao.getList(map);
	}

	
}
