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
             <!-- 質問２回答確認用 -->
	<%
        String scene = (String) session.getAttribute("scene");
        String flavor = (String) session.getAttribute("flavor");
    %>
    <p>前回の選択：</p>
    <ul>
        <li>シチュエーション = <strong><%= scene %></strong></li>
        <li>風味の好み = <strong><%= flavor %></strong></li>
    </ul>
    
	<main>
    	<h2>ホットかアイスのどちらがお好みですか？</h2>
	    	<form action="<%= request.getContextPath() %>/DiagnosisLogicServlet" method="post">
	     		<div class="radio-group">
	        		<input type="radio" id="hot" name="temperature" value="ホット" required>
	        		<label for="hot">ホット</label>
	        		<input type="radio" id="ice" name="temperature" value="アイス">
	        		<label for="ice">アイス</label>
	      		</div>
	      		<button type="submit">診断する</button>
	    	</form>
	</main>
</body>

</html>