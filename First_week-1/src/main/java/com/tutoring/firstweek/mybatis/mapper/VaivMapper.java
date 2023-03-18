package com.tutoring.firstweek.mybatis.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tutoring.firstweek.domain.Vaiv;

@Mapper
public interface VaivMapper {

	List<Vaiv> getList(HashMap<String, Integer> map);

}
