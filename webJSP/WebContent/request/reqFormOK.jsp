<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Arrays, java.util.Enumeration" %>
<%
	// post 전송일때는 한글 인코딩 후 request 해야 한다.
	request.setCharacterEncoding("UTF-8");
	
	String username = request.getParameter("username");
	String userid = request.getParameter("userid");
	String pwd = request.getParameter("pwd");
	String gender = request.getParameter("gender");
	
	// checkbox는 1개 이상 선택되므로 배열로 가져옴	
	String inter[] = request.getParameterValues("inter");
	String local = request.getParameter("local");
	
	System.out.println("이름>> "+username);
	System.out.println("아이디>> "+userid);
	System.out.println("비밀번호>> "+pwd);
	System.out.println("성별>> "+gender);
	System.out.println("관심분야>> "+Arrays.toString(inter));
	System.out.println("지역>> "+local);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	//alert("확인을 누르시면 홈페이지로 이동합니다.");
	//location.href="../index.jsp";
</script>
<body>
<h2>Form의 전송 데이터</h2>
<ul>
	<li>이름: <%=username+"입니다."%></li>
	<li>아이디: <%=userid%></li>
	<li>비밀번호: <%=pwd%></li>
	<li>성별: <%=gender%></li>
	<li>관심분야: <%=Arrays.toString(inter) %></li>
	<li>지역: <%=local %></li>
</ul>
<h2> 이전 페이지 폼의 엘리먼트 알아내기</h2>
<%
	Enumeration<String> element = request.getParameterNames();
%>
<ul>
	<%
		while(element.hasMoreElements()){ 
	%>
	<li>
	<%=element.nextElement() %>
	</li>
	<%} %>
</ul>
<ul>
	<li>접속자의 ip>> <%=request.getRemoteAddr()%></li>
	<li>인코딩 코드값>> <%=request.getCharacterEncoding()%></li>
	<li>contentType>> <%=request.getContentType()%></li>
	<li>전송방식>> <%=request.getMethod()%></li>
	<li>프로토콜>> <%=request.getProtocol()%></li>
	<li>URI>> <%=request.getRequestURI()%></li>
	<li>ContextPath>> <%=request.getContextPath()%></li>
	<li>서버이름>> <%=request.getServerName()%></li>
	<li>포트>> <%=request.getServerPort() %>
	<li>절대주소>> <%=request.getServletContext().getRealPath("/")%></li>
</ul>
</body>
</html>

