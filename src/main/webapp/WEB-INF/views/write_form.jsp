<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>
	<h2>게시판 글쓰기</h2>
	<hr>
	<form action="writeOk">
		글쓴이 : <input type="text" name="bname"><br><br>
		글제목 : <input type="text" name="btitle"><br><br>
		글내용 : <textarea rows="10" cols="40" name="bcontent"></textarea>
		<br><br>
		<input type="submit" value="글쓰기">
	</form>
</body>
</html>