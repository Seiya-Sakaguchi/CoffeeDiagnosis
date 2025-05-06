<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コーヒー診断アプリ</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/style.css">
</head>
<body>
	<h1>診断結果</h1>
	<header>
		<p>あなたにおすすめのコーヒーは・・・</p>
		<h3><%= request.getAttribute("coffeeName") %></h3>
		<p>です！</p>
	</header>
	
	<form action="<%= request.getContextPath() %>/CoffeeDiagnosisServlet" method="post">
		<input type="hidden" name="step" value="1">
		<button tyep="submit">もう一度診断する</button>
	</form>
</body>
</html>