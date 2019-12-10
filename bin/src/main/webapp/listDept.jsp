<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<caption>部门信息表</caption>
		<tr>
			<th>部门编号</th>
			<th>部门名字</th>
			<th>操作</th>
		</tr>
		
		<c:forEach items="${list}" var="dept">
			<tr>
				<td>${dept.deptno}</td>
				<td>${dept.deptname}</td>
				<td><a href="deptDelete.action?dept.deptno=${dept.deptno}">删除</a>
				<a href="deptFindOne.action?dept.deptno=${dept.deptno}">修改</a></td>
			</tr>
		</c:forEach>
	</table>
	<button type="button" onclick="location.href='saveDept.jsp'" >添加部门</button>
</body>
</html>