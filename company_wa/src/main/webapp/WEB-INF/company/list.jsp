<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<s:head />
	<title>Отделы</title>
	<link rel="stylesheet" href="../css/style.css" />
</head>
<body>
<div class="container">
	<div id="deps">
	<s:form action="departmentChoosen" namespace="/company">
		<s:select label="Выберите нужный отдел" 
			headerKey="-1" headerValue="-------Отдел не выбран-------"
			list="departments" 
			listKey="id"
			listValue="name"
			name="depId"/>
		<s:submit  value="Выбрать" name="submit"/>
	</s:form>
	</div>
	<div id="buttons">
		<s:url var="add" namespace="/company" action="showAddForm"/>
		<s:a href="%{add}"><img src="../img/add.jpeg" alt="Добавить сотрудника"/></s:a>
	</div>
	<div style="clear: both;">
	<s:if test="depId > 0">
		<p>Средняя зарплата по отделу: <s:property value="averageSalary" /> долл. США.</p>
	</s:if>

	<s:if test="depId > 0">
		<table id="empTable">
			<tr>
				<th>#</th>
				<th>Фамилия</th>
				<th>Имя</th>
				<th>Отчество</th>
				<th>Заработная плата</th>
				<th></th>
				<th></th>
			</tr>
			<s:iterator value="employees" status="stat">
				<tr>
					<td><s:property value="#stat.count"/></td>
					<td><s:property value="lname"/></td>
					<td><s:property value="fname"/></td>
					<td><s:property value="pname"/></td>
					<td class="curColumn"><s:property value="salary"/></td>
					<td>
						<s:url var="edit" namespace="/company" action="showEditForm">
							<s:param name="empId" value="id"/>
						</s:url>
						<s:a href="%{edit}"><img src="../img/edit.png" alt="Редактировать"/></s:a>
					</td>
					<td>
						<s:url var="del" namespace="/company" action="showDelForm">
							<s:param name="empId" value="id"/>
						</s:url>
						<s:a href="%{del}"><img src="../img/del.jpeg" alt="Удалить сотрудника"/></s:a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</s:if>
	</div>
</div>
</body>
</html>