<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${Deptone==null?'deptSave':'deptUpdate'}.action" method="post">
	deptno:<input type="text" name="dept.deptno" value="${Deptone.deptno }"/><br>
	deptname:<input type="text" name="dept.deptname" value="${Deptone.deptname}"><br>
	<input type="submit" value="${Deptone==null?'增加':'修改' }">
</form>
</body>
</html>