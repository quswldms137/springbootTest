package com.green.evalBbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.green.evalBbs.dto.EvalBbsDto;

@Mapper
public interface IEvalBbsDao {
	public List<EvalBbsDto> getList();

	public EvalBbsDto detail(@Param("bno") String bno);
	
	public void write(@Param("dto") EvalBbsDto dto);

	public void delete(@Param("bno") String bno);

}
