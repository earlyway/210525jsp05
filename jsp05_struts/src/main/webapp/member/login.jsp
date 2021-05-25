<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="../include/header.jsp" %>
<script type="text/javascript">
function check(){
	var form1 = document.getElementById("form1");
	var userid = $("#userid").val();
	var passwd = $("#passwd").val();
	if(userid == ""){
		alert("아이디를 입력하세요");
		$("#userid").focus();
		return;
	}
	if(passwd ==""){
		alert("비밀번호를 입력하세요");
		$("#passwd").focus();
		return;
	}
	form1.action = "${path}/member/login.action";
	form1.submit();
}
</script>
</head>
<body>
<%@include file="../include/menu.jsp" %>
<h2>로그인하세요</h2>
<form name="form1" id="form1" method="post">
<table border="1" style="width:400px">
	<tr>
		<td>아이디</td>
		<td><input type="text" name="dto.userid" id="userid"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="dto.passwd" id="passwd"></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="button" value="로그인" onclick="check()">
		<input type="button" value="회원가입" onclick="location.href=
			'${path}/member/join.action'"></td>
	</tr>
</table>
<span style="color:red"><b>${message}</b></span>
</form>

</body>
</html>