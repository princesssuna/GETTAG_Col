package com.gettag.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MypageController implements Controller {
	public String handleRequest(HttpServletRequest request
			  , HttpServletResponse response
			  ) throws Exception {
return "/WEB-INF/views/mypage/mypageView.jsp";
}

	}
// 마이페이지 연결 컨트롤러
	

	// 찜목록 컨트롤러 설정 

