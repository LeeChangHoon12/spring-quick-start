    
<%@page import="java.util.List" %>
<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>



<%
	BoardVO board = (BoardVO) session.getAttribute("board");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="updateBoard.do" method="post">
<input name="seq" type="hidden" value="<%=  board.getSeq()%>"/>
<table border="1">

	<tr>
		<td bgcolor="orange">제목  </td>
		
		<td align="left"><input name="title" type="text" value="<%= board.getTitle() %>"></td>
	</tr>
	
	<tr>
		<td bgcolor="orange">작성자 </td>
		<td align="left"><%= board.getWriter() %></td>
	</tr>
	
	<tr>
		<td bgcolor="orange">내용  </td>
		<td align="left"><input name="content" type="text" value="<%= board.getContent() %>"></td>
	</tr>
	
	<tr>
		<td bgcolor="orange">등록일  </td>
		<td align="left"><%= board.getRegDate() %></td>
	</tr>
	<tr>
		<td bgcolor="orange">조회 </td>
		<td align="left"><%= board.getCnt() %></td>
	</tr>
	<tr>
		<td align="center">
			<input type="submit" value="글 수정 "/>
		</td>
	</tr>
</table>

</form>

<a href="insertBoard.jsp">글 등록 </a>&nbsp;&nbsp;
<a href="deleteBoard.do?seq=<%= board.getSeq()%>">글 삭제 </a>&nbsp;&nbsp;
<a href="getBoardList.jsp">글목록  </a>&nbsp;&nbsp;
</body>
</html>