<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>MVC Demo</title>
</head>
<body>

	<c:forEach var="tempStudent" items="${student_list}">
		${tempStudent} <br/>
	</c:forEach>
	
</body>
</html>