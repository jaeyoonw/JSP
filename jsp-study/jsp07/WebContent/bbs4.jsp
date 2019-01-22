<%@page import="shop.BbsDTO"%>
<%@page import="shop.BbsDAO"%>
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
String content = request.getParameter("content");
BbsDTO dto = new BbsDTO();
BbsDAO dao = new BbsDAO();

dto.setId(id);
dto.setContent(content);
dao.update(dto);

%>
게시물 수정 완료
</body>
</html>