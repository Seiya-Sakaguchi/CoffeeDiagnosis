<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コーヒー診断アプリ</title>
</head>
<body>
	<h1>コーヒー診断アプリ</h1>
	<p>簡単な質問に答えるだけでおすすめのコーヒーを診断します！</p>
	<p>コーヒーの種類で迷った時はぜひ活用してみてください！</p>
	
	<form action="<%= request.getContextPath() %>/CoffeeDiagnosisServlet" method="post">
		<input type="hidden" name="step" value="1">
		<button tyep="submit">診断を始める</button>
	</form>
</body>
</html>