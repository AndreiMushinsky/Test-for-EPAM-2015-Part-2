<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<s:head />
	<title>Добавить</title>
	<link rel="stylesheet" href="../css/style.css" />
</head>
<body>
	<div class="container">
	<p><strong>Внесите данные о новом сотруднике.</strong></p>
	<s:form action="addEmployee" namespace="/company">
		<s:textfield name="employee.lname" label="Фамилия" />
		<s:textfield name="employee.fname" label="Имя" />
		<s:textfield name="employee.pname" label="Отчество" />
		<s:textfield name="employee.salary" label="Заработная плата" />
		<s:select label="Отдел" headerKey="-1" 
		headerValue="-------Отдел не выбран-------"
		list="deps" listKey="id"
		listValue="name" name="depId"/>
		<s:submit value="Добавить"/>
	</s:form>
	</div>
</body>
</html>