package com.springbook.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;

//DAO
@Repository("boardDAO")
public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private final String BAORD_INSERT = "insert into board(seq,title,writer,content) values((select nvl(max(seq),0)+1 from board),?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?,content=?,where seq=?";
	private final String BOARD_DELETE = "delete * from board where seq=?;";
	private final String BAORD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * from board order by seq desc";
	
	
	
	//CRUD 기능 구현 
	//글 등록 
	public void insertBoard(BoardVO vo) {
		System.out.println("---> JDBC insertBoard() 기능처리 ");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BAORD_INSERT);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs,stmt, conn);
		}
	}
	
	//글 수정
	public void updatBoard(BoardVO vo) {
		System.out.println("--->JDBC updateBoard() 기능처리 ");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_UPDATE);
			stmt.setString(1,vo.getTitle());
			stmt.setString(2, vo.getContent());
			stmt.setInt(3, vo.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs,stmt, conn);
		}
	}
	
	
	//글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("--->JDBC updateBoard() 기능처리");
		try {
			conn = JDBCUtil.getConnection();
	
			stmt = conn.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, vo.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs,stmt, conn);
		}
	}
	//글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.print("---->JDBC getBoard() 기능처리 " );
		BoardVO board = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BAORD_GET);
			stmt.setInt(1, vo.getSeq());
			rs = stmt.executeQuery();
			if(rs.next()) {
				board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		
		return board;
	}
	
	//글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("--->JDBC getBoardList 기능처리 ");
		List<BoardVO> boardList = null;
	
		
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_LIST);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				boardList.add(board);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs,stmt, conn);
		}
		
		return boardList;
	}
	
	
}
