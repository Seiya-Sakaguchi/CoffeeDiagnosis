<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.CoffeeProfile" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

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
		<h3><c:out value="${coffeeProfile.name}" /></h3>
		<p>です！</p>
	</header>

	<%-- <section class="form-section">
		<p><strong>産地:</strong> ${coffeeProfile.origin}</p>
		<p><strong>標高:</strong> ${coffeeProfile.elevation}</p>
		<p><strong>プロセス:</strong> ${coffeeProfile.process}</p>
		<p><strong>品種:</strong> ${coffeeProfile.varieties}</p>
		<p><strong>特徴:</strong> ${coffeeProfile.flavor_notes}</p>
	</section> --%>

	<form action="${pageContext.request.contextPath}/CoffeeDiagnosisServlet" method="post">
		<input type="hidden" name="step" value="1">
		<button type="submit">もう一度診断する</button>
	</form>
</body>
</html>
