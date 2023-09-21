package co.kr.hexagon.tux.web.common.service;

import java.util.HashMap;
import java.util.List;

public interface SqlService {
	
	public List select(String statement, HashMap<String, Object>parameter);

	public int insert(String statement, HashMap<String, Object>parameter);

	public int update(String statement, HashMap<String, Object>parameter);

	public int delete(String statement, HashMap<String, Object>parameter);

	public String selectOne(String statement, HashMap<String, Object>parameter);

}
