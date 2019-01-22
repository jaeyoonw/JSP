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
String title = request.getParameter("title");
String content = request.getParameter("content");
String user = request.getParameter("user");
BbsDTO dto = new BbsDTO();
BbsDAO dao = new BbsDAO();

dto.setId(id);
dto.setTitle(title);
dto.setContent(content);
dto.setUser(user);

dao.insert(dto);


%>
게시물 등록이 완료되었습니다

</body>
</html>