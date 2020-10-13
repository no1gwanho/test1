<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>
	#content{
		height:600px;
	}
</style>
</head>
<body>
	<!-- header.jsp include -->
	<jsp:include page="header.jsp"/>
	<div id="content">
		<!-- .jsp로 include된 경우 데이터 호환x -->
		name :<%--- <%=name%><br/>--%><br/>
		num : <%--<%=num%><br/> --%><br/><br/>
		<img src="../img/1.jpg"/>
	</div>
	<!-- footer.jsp include -->
	<div>
		<jsp:include page="footer.jsp"/>
	</div>
</body>
</html>