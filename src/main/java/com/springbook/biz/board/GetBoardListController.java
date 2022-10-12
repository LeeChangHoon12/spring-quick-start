package com.springbook.biz.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.view.controller.Controller;


public class GetBoardListController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("글 목록 검색 처리 ");
		
		//1. 사용자 입력 정보 추출(검색 기능은 나중에 구현) 
		
		//2. DB 연동 처리 
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
//		(세션은 클라이언트 브라우저 하나당 하나씩 서버 메모리에 생성됨 
		//세션에 많은 정보가 저장되어있으면 서버에 부담 ?
//		//3. 검색 결과를 세선에 저장, 목록 화면 리턴 
		HttpSession session = request.getSession();
		session.setAttribute("boardList", boardList);
		return "getBoardList";
		
		
		
		//3. 검색 결과와 화면 정보를 ModelAndView에 저장하여 리턴한다.
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("boardList",boardList);
//		mav.setViewName("getBoardList.jsp");
//		return mav;
//		
		
		
		
		
		
	}
	
}
