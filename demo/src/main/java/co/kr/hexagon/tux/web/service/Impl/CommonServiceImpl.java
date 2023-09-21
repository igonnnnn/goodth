package co.kr.hexagon.tux.web.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import co.kr.hexagon.tux.web.service.CommonService;
import co.kr.hexagon.tux.web.vo.TransactionVO;

@Service
public class CommonServiceImpl implements CommonService {
	@Override
	public void transaction(TransactionVO tVo) {

	}
	@Override
	public ArrayList<HashMap<String, Object>> servcieRead(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'servcieRead'");
	}
	@Override
	public String serviceReadOne(HashMap<String, Object> map) {
		return "";

	}
	@Override
	public String serviceInsert(HashMap<String, Object> map) {
		return "";
	}
	@Override
	public String serviceDelete(HashMap<String, Object> map) {
		return "";
	}
	@Override
	public String serviceUpdate(HashMap<String, Object> map) {
		return "";
	}
}
