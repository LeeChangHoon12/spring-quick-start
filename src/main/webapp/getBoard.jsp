    
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
		<td bgcolor="orange">����  </td>
		
		<td align="left"><input name="title" type="text" value="<%= board.getTitle() %>"></td>
	</tr>
	
	<tr>
		<td bgcolor="orange">�ۼ��� </td>
		<td align="left"><%= board.getWriter() %></td>
	</tr>
	
	<tr>
		<td bgcolor="orange">����  </td>
		<td align="left"><input name="content" type="text" value="<%= board.getContent() %>"></td>
	</tr>
	
	<tr>
		<td bgcolor="orange">�����  </td>
		<td align="left"><%= board.getRegDate() %></td>
	</tr>
	<tr>
		<td bgcolor="orange">��ȸ </td>
		<td align="left"><%= board.getCnt() %></td>
	</tr>
	<tr>
		<td align="center">
			<input type="submit" value="�� ���� "/>
		</td>
	</tr>
</table>

</form>

<a href="insertBoard.jsp">�� ��� </a>&nbsp;&nbsp;
<a href="deleteBoard.do?seq=<%= board.getSeq()%>">�� ���� </a>&nbsp;&nbsp;
<a href="getBoardList.jsp">�۸��  </a>&nbsp;&nbsp;
</body>
</html>