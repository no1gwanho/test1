<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h1>세션에 데이터 기록하기</h1>
<%
	// session 내장객체를 이용하여 값 저장하기
	out.println("세션ID>> "+session.getId());

	session.setAttribute("username", "이순신");
	session.setAttribute("tel", "010-1234-5678");
	session.setAttribute("userid", "seen1223");
%>
<button onclick="location.href='sessionView.jsp';">세션값 확인하기</button>
</body>
</html>