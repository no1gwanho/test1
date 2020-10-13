<!-- 지시부 → import -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.util.Calendar, java.util.Scanner" %>
<%@ page import = "java.io.InputStream" %>	
<%@ page trimDirectiveWhitespaces="true" %>
<%!	// 선언부 : 메소드나 변수를 선언하는 곳
	public String guguDan(int dan){
		String guguDan = "<ul>";
		for(int i=2; i<=9; i++) {
			guguDan += "<li>" + dan + "*" + i + "=" + (dan * i) + "</li>";
		}
		guguDan += "</ul>";
		return guguDan;
	}

	public int multiple(int a, int b) {
		return a+b;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	img {
		width:300px;
		height:200px;
	}
</style>
<script>
	document.write("<h2>JAVA SCRIPT 코드</h2>");
</script>
</head>
<body>
<h1>JSP HOMe : <%=session.getId()%></h1>
<% 
	String logStatus = (String)session.getAttribute("logStatus");
if(logStatus == null || logStatus.equals("")){ %>
	<a href="<%=request.getContextPath() %>/response/login.html">로그인</a>
<%} else if(logStatus != null & logStatus.equals("Y")) { %>
	<a href="<%=request.getContextPath()%>/response/logout.jsp">로그아웃</a>
<%} %>
<hr/>
<!-- 스크립트릿 -->
<%
	int a = 200;
%>
<img src="<%=request.getContextPath() %>/img/3.jpg"/>
<%
	int result = a * 1000;
	// jsp에서 out객체는 클라이언트에게 response한다.
	out.println("<div style='background-color:pink'>result>> " + result + "</div>");
	
	// 오늘 날짜
	Calendar now = Calendar.getInstance();
	int month = now.get(Calendar.MONTH)+1;
	int day = now.get(Calendar.DAY_OF_MONTH);
	out.println("<h1>오늘은 " + month + "월 " + day + "입니다.</h1>");
%>
<hr/>
<%
	// 선언부의 메소드 호출
	out.println(guguDan(9));
	out.println("곱>> " + multiple(1234, 5678));
	System.out.println("gob>> " + multiple(500, 400));
%>
</body>
</html>