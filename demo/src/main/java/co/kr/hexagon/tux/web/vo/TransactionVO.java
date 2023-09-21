package co.kr.hexagon.tux.web.vo;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TransactionVO {
	
	private HttpServletRequest requset;
	private HttpServletResponse response;
	
	private HashMap<String, Object> reqDatasets = null;
	private HashMap<String, Object> resDatasets = null;

	public void setRequest(HttpServletRequest request) {
		this.requset = request;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void initialize(HttpServletRequest request, HttpServletResponse response) {
		this.setRequest(request);
		this.setResponse(response);
	}
}
