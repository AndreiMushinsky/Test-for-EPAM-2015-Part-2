<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<head>
	<s:head />
	<title>Успех</title>
	<link rel="stylesheet" href="../css/style.css" />
</head>
	<div class="container">
		<p>Сотрудник(-ца) <s:property value="employee.lname" /> 
						<s:property value="employee.fname" />
						<s:property value="employee.pname" />
						успешно добавлен(-а)!</p>
		<s:url var="back" namespace="/company" action="departmentChoosen"/>
		<s:a href="%{back}">
			Вернуться назад
		</s:a>
	</div>
</body>
</html>