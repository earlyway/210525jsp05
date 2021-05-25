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
<h2>성적계산 결과</h2>
이름 : ${dto.name}<br>
국어 : ${dto.kor}<br>
영어 : ${dto.eng}<br>
수학 : ${dto.mat}<br>
총점 : ${dto.tot}<br>
평균 : ${dto.avg}<br>
</body>
</html>