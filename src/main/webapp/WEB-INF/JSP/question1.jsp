<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コーヒー診断アプリ</title>
</head>
<body>
	<h1></h1>
	<h2></h2>
	<p></p>
	<form action="<%= request.getContextPath() %>/CoffeeDiagnosisServlet" method="post">
		<input type="radio" name="scene" value="朝" required>朝<br>
		<input type="radio" name="scene" value="仕事中">仕事中<br>
		<input type="radio" name="scene" value="リラックスタイム">リラックスタイム<br><br>
		
		<input type="hidden" name="step" value="2">
		<button type="submit">次へ</button>
	
	</form>
</body>
</html>