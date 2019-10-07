package com.nit.eseva.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nit.eseva.bo.EsevaBO;

@Repository
public class EsevaDaoImpl implements EsevaDao {
	public static final String INSERT_USER_DATA="INSERT INTO ESEVA VALUES(?,?,?,eseva_seq.nextVal)";
	
	@Autowired
	JdbcTemplate jt;
	
	@Override
	public int insertData(EsevaBO bo) {
		int count = 0;
		
		count = jt.update(INSERT_USER_DATA, bo.getUserId(),bo.getName(),bo.getAddrs());
	
		return count;
	}

}
