<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>企業一覧</title>
</head>
<body>
	
	<c:forEach items="${companies}" var="c">
        <p>
            <c:out value="${c.companyName}" /> | <c:out value="${c.businessTypeName}" />
        </p>
    </c:forEach>
    
    
    
    
	<form action="companyInput">
		<input value="追加" type="submit"/>
	</form>
</body>
</html>