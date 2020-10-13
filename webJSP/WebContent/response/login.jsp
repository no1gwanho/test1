<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection, java.sql.DriverManager, java.sql.SQLException" %>
<%@page import="java.sql.ResultSet, java.sql.PreparedStatement"%>
<%!
	//드라이브 로딩, 디비 연결
	public Connection getConnection(){
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
		}catch(Exception e){
			System.out.println("DB연결에러>>> "+e.getMessage());
		}
		return conn;
	}
%>
<%
	//1. 클라이언트 폼에 있는 데이터를 서버로 가져온다. : request
	String userid = request.getParameter("userid");
	String userpwd = request.getParameter("userpwd");
	
	//1. 드라이브 로딩		
	//2. 디비연결
	Connection conn = getConnection();
	//3. statement(sql) 생성
	String sql = "select count(userid) from register where userid=? and userpwd=?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	pstmt.setString(1, userid);
	pstmt.setString(2, userpwd);
	
	//4. resultset
	ResultSet rs = pstmt.executeQuery();
	rs.next();
	
/* 	if(rs.getInt(1)==0){//로그인실패(/webJSP/response/login.html)
		response.sendRedirect(request.getContextPath()+"/response/login.html");
	}else if(rs.getInt(1)==1){//로그인성공
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	} */	  
	if(rs.getInt(1)==0){
%>	
	<script>
		alert("로그인 실패했습니다.. 다시 시도하세요.");
		<%-- location.href="<%=request.getContextPath()%>/response/login.html"; --%>
		history.back();
	</script>
<%	
	}else{
		// 로그인 성공여부를 세션에 기록
		session.setAttribute("logStatus", "Y");
%>
		<script>
			alert("로그인 성공했습니다..\n 홈페이지로 이동합니다.");
			location.href="<%=request.getContextPath()%>/index.jsp";
		</script>	
<%	
	}
%>