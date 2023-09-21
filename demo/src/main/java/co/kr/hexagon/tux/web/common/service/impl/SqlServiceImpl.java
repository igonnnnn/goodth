package co.kr.hexagon.tux.web.common.service.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.kr.hexagon.tux.web.common.service.SqlService;

public class SqlServiceImpl implements SqlService {
	private SqlSession session;
	
	@Override
	public List select(String statement, HashMap<String, Object>parameter) {
		return session.selectList(getSqlString(), session, null);
	}

	@Override
	public int insert(String statement, HashMap<String, Object>parameter) {
		return session.insert(getSqlString(), session);
	}

	@Override
	public int update(String statement, HashMap<String, Object>parameter) {
		return session.update(getSqlString(), session);
	}

	@Override
	public int delete(String statement, HashMap<String, Object>parameter) {
		return session.delete(getSqlString(), session);
	}

	@Override
	public String selectOne(String statement, HashMap<String, Object>parameter) {
		return session.selectOne(getSqlString(), session);
	}

	public String getSqlString() {
		return "";
	}

	public void printSqlString() {

	}
	
}
