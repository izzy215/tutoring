package com.tutoring.firstweek.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.tutoring.firstweek.domain.Vaiv;

@Mapper
public interface VaivMapper {

	List<Vaiv> getList(Map<String, Object> map);

}
