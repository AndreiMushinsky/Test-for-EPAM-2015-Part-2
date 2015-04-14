<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<s:head />
	<title>Удаление</title>
	<link rel="stylesheet" href="../css/style.css" />
</head>
<body>
	<div class="container">
		<p><strong>Данные о сотруднике.</strong></p>
		<s:form action="deleteEmployee" namespace="/company">
			<s:textfield readonly="true" name="employee.lname" label="Фамилия" />
			<s:textfield readonly="true" name="employee.fname" label="Имя" />
			<s:textfield readonly="true" name="employee.pname" label="Отчество" />
			<s:textfield readonly="true" name="employee.salary" label="Заработная плата" />
			<s:hidden name="empId" />
			<s:submit value="Удалить"/>
		</s:form>
	</div>
</body>
</html>