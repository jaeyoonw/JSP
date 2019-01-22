<%@page import="bean.DBConnect2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("id");
String title = request.getParameter("title");
String user = request.getParameter("user");
//db의 입력값을 넣어라
	DBConnect2 db2 = new DBConnect2();
	db2.update(id, title, user);

%>

</body>
</html>