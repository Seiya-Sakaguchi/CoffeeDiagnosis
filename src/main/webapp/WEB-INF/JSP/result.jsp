<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コーヒー診断アプリ</title>
</head>
<body>
	<h1>診断結果</h1>
	<p>あなたにおすすめのコーヒーは・・・</p>
	<h3><%= request.getAttribute("coffeeName") %></h3>
	<p>です！</p>
	
	<form action="<%= request.getContextPath() %>/CoffeeDiagnosisServlet" method="post">
		<input type="hidden" name="step" value="1">
		<button tyep="submit">もう一度診断する</button>
</body>
</html>