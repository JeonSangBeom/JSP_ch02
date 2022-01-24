package com.jjang051.ch01;

//init / destroy 의 용도 단순 테스트
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 // 변수 생성	
	int initCount = 0;
	int doGetCount = 0;
	int destroyCount = 0;
    public LifeCycle() {
        super();
    }
	public void init(ServletConfig config) throws ServletException {
		initCount++; // 실행될때만 작동
		System.out.println("initCount==="+initCount);
	}
	public void destroy() {
		destroyCount++;// 실행될때만 작동
		System.out.println("destroyCount==="+destroyCount);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGetCount++;
		System.out.println("doGetCount==="+doGetCount);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
	}
}