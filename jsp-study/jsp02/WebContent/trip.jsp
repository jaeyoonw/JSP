<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
String country = request.getParameter("country");
String number = request.getParameter("number");
int num = Integer.parseInt(number);

for(int i=0; i<num; i++){
	out.print(country + "으로 가요<br>" );
}
if(num >= 3){
	out.print("여행을 많이 다니실 계획이시군요!<br>");
}else{
	out.print("여행을 더 가셔도 될 것 같습니다.!<br>");
}

String color = request.getParameter("color");
%>
<body bgcolor="<%=color %>">

</body>
</html>
