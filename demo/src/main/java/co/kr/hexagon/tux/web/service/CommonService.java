package co.kr.hexagon.tux.web.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import co.kr.hexagon.tux.web.vo.TransactionVO;

@Service
public interface CommonService {
	public void transaction(TransactionVO tVo);
	
	public ArrayList<HashMap<String, Object>> servcieRead(HashMap<String, Object> map);
	
	public String serviceReadOne(HashMap<String, Object> map);

	public String serviceInsert(HashMap<String, Object> map);

	public String serviceDelete(HashMap<String, Object> map);

	public String serviceUpdate(HashMap<String, Object> map);
}
