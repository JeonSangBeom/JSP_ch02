<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form method="get" action="RadioServlet"> <!-- 확장자로 .do(일반적/아무거나 상관 없다)를 붙여서 쓰는 경우도 있다 -->
		<label><input type="radio" name="gender" value="male"><span>남자</span></label>
		<!-- 값을 넘길때는 name으로 -->
		<label><input type="radio" name="gender" value="female"><span>여자</span></label>
		<div><button>전송</button></div>
	</form>
</body>
</html>