
    
<%@page import="java.util.List" %>
<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>

    
   
 <% 
	List<BoardVO> boardList =  (List) session.getAttribute("boardList");
 %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
						"http://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Board List</title>
</head>
<body>
	<h1>Board List</h1>
	<h3>Welcome Test...<a href="logout.do">Log-out</a></h3>
	
	<form action="getBoardList.jsp" method="post">
		<table border="1" width="700">
		<tr>
		<td align="center">
			<select name="serachCondition">
				<option value="TITLE"> 제목 
				<option value="CONTENT">내용 
			</select>
			<input name="searchKeyword" type="text"/>
			<input name="submit" value="검색"/>
		</td>
		</tr>
		</table>
	</form>
	
	
	<table border="1" width="700">
	<tr>
		<th bgcolor="orange" width="100">번호</th>
		<th bgcolor="orange" width="200">제목</th>
		<th bgcolor="orange" width="150">작성자</th>
		<th bgcolor="orange" width="115">등록일</th>
		<th bgcolor="orange" width="100">조회수</th>
	</tr>
	
	<% for(BoardVO board : boardList) { %>
		<tr>
			<td><%= board.getSeq() %></td>
			<td align="left"><a href="getBoard.do?seq=<%= board.getSeq() %>"><%= board.getTitle() %></a></td>
			<td><%= board.getWriter() %></td>
			<td><%= board.getRegDate() %></td>
			<td><%= board.getCnt() %></td>
		</tr>
	
	<% } %>
	</table>
	<br>
	<a href="insertBoard.do">새글 등록 </a>
</body>
</html>