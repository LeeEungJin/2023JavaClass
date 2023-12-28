<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <!-- 꺽세퍼센트는 다 자바로 바뀜 -->
    <!-- Response type을 알려주기 위해 -->
    <!-- Encoding 타입은 UTF-8을 알려주기 위해 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Echo message</title>
</head>
<body>
	<h1>JSP forwarding</h1>
	<h1>method : ${requestScope.method}</h1>
<!--	<h1>To : <.%=request.getParameter("who") %></h1>-->
	<h1>To : ${param.who}</h1> 
<!--	<h1>message : <.%=request.getParameter("message") %></h1>-->
	<h1>message : ${param.message}</h1> 
</body>
</html>