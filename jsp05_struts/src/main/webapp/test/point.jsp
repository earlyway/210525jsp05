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
<h2>성적계산</h2>
<form action="${path}/test/point.action">
이름 <input type="text" name="dto.name" value="김철수"><br>
국어 <input type="text" name="dto.kor" value="80"><br>
영어 <input type="text" name="dto.eng" value="90"><br>
수학 <input type="text" name="dto.mat" value="100"><br>
<input type="submit" value="확인">
</form>

</body>
</html>