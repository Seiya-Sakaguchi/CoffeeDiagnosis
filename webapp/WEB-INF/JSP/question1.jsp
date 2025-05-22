<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コーヒー診断アプリ</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/style.css">

</head>
<body>
	<main>
 		<h2>コーヒーを飲むシュチュエーションを教えてください</h2>
  			<form action="CoffeeDiagnosisServlet" method="post">
   				<div class="radio-group">
     					<input type="radio" id="morning" name="scene" value="m" required>
     					<label for="morning">朝</label>
     					<input type="radio" id="work" name="scene" value="w">
     					<label for="work">仕事中</label>
     					<input type="radio" id="relax" name="scene" value="r">
     					<label for="relax">リラックスタイム</label>
   				</div>
    			<input type="hidden" name="step" value="2">
    			<button type="submit">次へ</button>
  			</form>
	</main>	
</body>
</html>