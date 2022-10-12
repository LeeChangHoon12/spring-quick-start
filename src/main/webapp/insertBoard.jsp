

  
<%@page import="java.util.List" %>
<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>


<%
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새글 등록 </title>
</head>
<body>
	<h1>글 등록 하기 </h1>
	<a href="logout_proc.jsp">Log-out</a>
	<hr>
	<form action="insertBoard.do" method="post">
	<table border="1">
		<tr>
			<td bgcolor="orange" width="70">제목</td>
			<td><input type="text" name="title"/></td>
		</tr>
		<tr>
			<td bgcolor="orange" width="70">작성자</td>
			<td><input type="text" name="writer"  size="10"/></td>
		</tr>
				<tr>
			<td bgcolor="orange" width="70">내용</td>
			<td><textarea name="content" cols="40" rows="40"></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value=" 새 글 등록 "/>	
			</td>
		
		</tr>
		
	</table>
	</form>
	<a href="getBoardList.jsp">글 목록 가기 </a>
</body>
</html>