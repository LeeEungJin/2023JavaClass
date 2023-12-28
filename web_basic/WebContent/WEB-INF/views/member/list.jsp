<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.dto.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
    <.% out.println(request.getAttribute("memberList")); %> 
    <hr>
    <.%=request.getAttribute("memberList") %>
    <hr>
	${requestScope.memberList }
	<hr> 
	${memberList }-->
	
	<table border = "1">
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
			<th>이름</th>
			<th>이메일</th>
			<th>전화번주</th>
		</tr>
		<%
			List<MemberVO> memberList = (ArrayList<MemberVO>)request.getAttribute("memberList");
			if(memberList != null) for(MemberVO member : memberList){
		%>
		<tr>
			<td>${member.id}</td>
			<td>${member.pwd}</td>
			<td>${member.name}</td>
			<td>${member.email}</td>
			<td>${member.phone}</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>