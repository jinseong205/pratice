<%@page import="org.springframework.ui.ModelMap"%>
<%@page import="org.springframework.ui.Model"%>
<%@page import="com.sun.glass.ui.Application"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SHA256</title>

<script type="text/javascript" src="/pratice/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="/pratice/js/bootstrap.js"></script>
<script type="text/javascript" src="/pratice/js/test/hashing.js"></script>
</head>
<body>
	<center>
		<p>test SHA-256</p>
		
		<input type = "text" id = "inputText" name = "inputText"/>
		<input type = "button" value = "submit" onclick="send();"/>
		
		<br>
		<br>
	
		<div id = "resultDiv">
		</div>
	</center>
</body>
</html>