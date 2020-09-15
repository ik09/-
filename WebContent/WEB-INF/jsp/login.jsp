<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<center><title>ActionLogger</title></center>
</head>
<body bgcolor="#87cefa">
<header>
<center><h1>ActionLogger</h1></center>
<hr>
<center><p>ログインフォーム</p></center>
</header>
<main>
<div>
<form method="post" action="./login">
<center><p><input type="name" name="name" placeholder="名前" required autofocus></p></center>
<center><p><input type="Sa" name="Sa" placeholder="住所" required autofocus></p></center>
<center><p><input type="email" name="email" placeholder="E-MAIL" required autofocus></p></center>
<center><p><input type="Tel" name="Tel" placeholder="電話番号" required autofocus></p></center>
<center><p><input type="password" name="password" placeholder="PASSWORD" required></p></center>
<center><p><input type="submit" value="ログイン"></p></center>
</form>
</div>
</main>
<footer>
</footer>
</body>
</html>