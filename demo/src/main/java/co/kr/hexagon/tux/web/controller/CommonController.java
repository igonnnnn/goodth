package co.kr.hexagon.tux.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

	@RequestMapping(value="/")
	public void service(HttpServletRequest request, HttpServletResponse response) {
		
	}
}
