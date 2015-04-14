<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<s:head />
	<title>Успех</title>
	<link rel="stylesheet" href="../css/style.css" />
</head>
<body>
	<div class="container">
		<p>Редактирование прошло успешно!</p>
		<s:url var="back" namespace="/company" action="departmentChoosen"/>
		<s:a href="%{back}">
			Вернуться назад
		</s:a>
	</div>
</body>
</html>