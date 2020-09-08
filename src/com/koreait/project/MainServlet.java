package com.koreait.project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proc(request,response,RequestMethod.GET);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proc(request,response,RequestMethod.POST);
	}
	protected void proc(HttpServletRequest request, HttpServletResponse response,int method) throws ServletException, IOException {
		System.out.println("url:"+request.getRequestURI()+",method="+method);	//분기 한마디로 몰아주는 역할
		//몰아줬을땐 작업은 빡쌔도 관리가 편하다.
	}
	
}
