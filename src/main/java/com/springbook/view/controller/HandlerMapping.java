package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.springbook.biz.board.DeletBoardController;
import com.springbook.biz.board.GetBoardController;
import com.springbook.biz.board.GetBoardListController;
import com.springbook.biz.board.InsertBoardController;
import com.springbook.view.user.LoginController;
import com.springbook.view.user.LogoutController;

public class HandlerMapping {
	
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do",new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("'InsertBoard.do", new InsertBoardController());
		mappings.put("/deleteBoard.do", new DeletBoardController());
		mappings.put("/logout.do", new LogoutController());
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}


