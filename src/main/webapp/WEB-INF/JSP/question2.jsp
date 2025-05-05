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
	 <%
        String scene = (String) session.getAttribute("scene");
    %>
    <p>前回の選択：シチュエーション = <strong><%= scene %></strong></p>
	
	<form action="<%= request.getContextPath() %>/CoffeeDiagnosisServlet" method="post">
		<input type="radio" name="flavor" value="フルーティ" required>フルーティ<br>
		<input type="radio" name="flavor" value="スイート">スイート<br>
		<input type="radio" name="flavor" value="ビター">ビター<br>
		<input type="radio" name="flavor" value="ナッティ">ナッティ<br>
		
		<input type="hidden" name="step" value="3">
		<button type="submit">次へ</button>
	
	</form>
</body>
</html>