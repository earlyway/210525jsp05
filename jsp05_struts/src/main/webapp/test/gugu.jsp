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
<%@include file="../include/menu.jsp" %>
<h2>구구단 계산</h2>
<form id="form1" method="post" action="${path}/test/gugu.action">
단을 입력하세요
<input type="text" name="dan" value="3" size="10">
<input type="submit" value="계산">
</form>

</body>
</html>