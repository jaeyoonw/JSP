<%@page import="bean.DBConnect"%>
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
//1.입력한 id를 서버에서 받아서,
String id = request.getParameter("id");

//2.db에 입력값으로 넣어라.
DBConnect db = new DBConnect();
db.delete(id);

%>

</body>
</html>