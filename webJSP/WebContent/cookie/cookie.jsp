<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 쿠키만들기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(function(){
		$('#btn').click(function(){
			// 쿠키 기록하기
			var now = new Date();
			document.cookie = "food=pizz;path=/;expires="+now.setDate(now.getDate()+7);
			now = new Date();
			document.cookie = "language=java;path=/;expires"+now.setDate(now.getDate()+1);
		});
	});
</script>
<%
	// JSP에서 쿠키 기록하기
	Cookie cook = new Cookie("username", "최은빈");
	cook.setMaxAge(5*60);	// 쿠키의 생명주기(소멸시점 - 초단위)
	
	response.addCookie(cook);
%>
</head>
<body>
<input id="btn"type="button" value="버튼을 클릭하시면 쿠키가 생성됩니다.(JavaScript)"/>
</body>
</html>