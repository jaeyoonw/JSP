<%@page import="shop.BbsDAO"%>
<%@page import="shop.BbsDTO"%>
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

BbsDTO dto = new BbsDTO();
BbsDAO dao = new BbsDAO();

dto.setId(id);
dao.delete(dto);
%>
게시물 삭제 완료
</body>
</html>