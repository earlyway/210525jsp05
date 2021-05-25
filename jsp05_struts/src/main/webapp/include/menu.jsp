<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<a href="${path}/test/hello.action">hello</a> |
<a href="${path}/test/gugu.jsp">구구단</a> |
<a href="${path}/test/age.jsp">나이계산</a> |
<a href="${path}/test/point.jsp">점수계산</a> |
<a href="${path}/member/member_list.action">회원관리</a> |
<a href="${path}/memo/memo_list.action">한줄메모장</a> |

<div style="text-align : right;">
<c:choose>
	<c:when test="${session.Scope.userid == null }">
		<a href="${path}/member/login.action">로그인</a> |
	</c:when>
	<c:otherwise>
		${sessionScope.name}님이 로그인중입니다.
		<a href="${path}/member/logout.action">로그아웃</a>
	</c:otherwise>
</c:choose>

</div>
<hr>