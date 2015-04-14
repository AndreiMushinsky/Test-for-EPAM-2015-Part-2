<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<s:head />
	<title>Редактировать</title>
	<link rel="stylesheet" href="../css/style.css" />
</head>
<body>
	<div class="container">
		<p><strong>Внесите изменения и нажмите кнопку "Подтвердить".</strong></p>
		<s:form action="editEmployee" namespace="/company">
			<s:textfield name="employee.lname" label="Фамилия" />
			<s:textfield name="employee.fname" label="Имя" />
			<s:textfield name="employee.pname" label="Отчество" />
			<s:textfield name="employee.salary" label="Заработная плата" />
			<s:hidden name="employee.id" />
			<s:submit value="Подтвердить"/>
		</s:form>
	</div>
</body>
</html>