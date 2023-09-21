package co.kr.hexagon.tux.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import co.kr.hexagon.tux.web.service.BaseService;
import co.kr.hexagon.tux.web.vo.TransactionVO;

@Controller
public class TransactionController {

	protected BaseService service;
	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		TransactionVO tVo = new TransactionVO();

		tVo.initialize(request, response);
		this.handle(tVo);
	}

	public void handle(TransactionVO tVo) {
		this.service.transaction(tVo);
	}
}
