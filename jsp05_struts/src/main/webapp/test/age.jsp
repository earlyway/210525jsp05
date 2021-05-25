<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>나이 계산</h2>
<form action="${path}/test/age.action" method="post">
	이름<input type="text" name="name" value="kim"><br>
	출생연도<input type="text" name="year" value="1990">
	<input type="submit" value="확인">
</form>

</body>
</html>