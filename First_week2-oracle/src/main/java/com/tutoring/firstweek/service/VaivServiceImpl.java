package com.tutoring.firstweek.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tutoring.firstweek.domain.Vaiv;
import com.tutoring.firstweek.mybatis.mapper.VaivMapper;

@Service
public class VaivServiceImpl {

	private VaivMapper dao;
	public VaivServiceImpl(VaivMapper dao) {
		this.dao=dao;
	}

public List<Vaiv> getList(Map<String, Object> map) {
	return dao.getList(map);	
}

	
}
