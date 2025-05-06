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
                <!-- 質問１回答確認用 -->
	 <% String scene = (String) session.getAttribute("scene"); %>
    <p>前回の選択：シチュエーション = <strong><%= scene %></strong></p>
    
	<main>
    	<h2>どのような風味がお好みですか？</h2>
			<form action="<%= request.getContextPath() %>/CoffeeDiagnosisServlet" method="post">
				<div class="radio-group">
					<input type="radio" id="fruit" name="flavor" value="フルーティ" required>
					<label for="fruit">フルーティ</label>
					<input type="radio" id="sweet" name="flavor" value="スイート">
					<label for="sweet">スイート</label>
					<input type="radio" id="bitter" name="flavor" value="ビター">
					<label for="bitter">ビター</label>
					<input type="radio" id="nut" name="flavor" value="ナッティ">
					<label for="nut">ナッティ</label>
				</div>
				<input type="hidden" name="step" value="3">
				<button type="submit">次へ</button>
			</form>
	</main>
</body>

</html>