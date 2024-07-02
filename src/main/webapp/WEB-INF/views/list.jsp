<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판</title>
</head>
<body>
	글번호 / 글쓴이 / 글제목 / 글내용 / 등록일<br>
	<c:forEach items="${bDtos }" var="bDto">
		${bDto.bnum } / ${bDto.bname } / ${bDto.btitle } / ${bDto.bdate }<br>
	</c:forEach>
</body>
</html>