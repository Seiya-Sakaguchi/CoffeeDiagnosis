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
        String flavor = (String) session.getAttribute("flavor");
    %>
    <p>前回の選択：</p>
    <ul>
        <li>シチュエーション = <strong><%= scene %></strong></li>
        <li>風味の好み = <strong><%= flavor %></strong></li>
    </ul>
	
	<form action="<%= request.getContextPath() %>/CoffeeDiagnosisServlet" method="post">
		<input type="radio" name="temperature" value="ホット" required>ホット<br>
		<input type="radio" name="temperature" value="アイス">アイス<br>
		
		<input type="hidden" name="step" value="4">
		<button type="submit">診断結果</button>
	
	</form>
</body>
</html>