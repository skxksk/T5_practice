<!DOCTYPE html>
<html>
<head>
<title>Echo Application</title>
</head>
<body>
  <%-- (1) --%>
  <form:form modelAttribute="echoForm" action="${pageContext.request.contextPath}/echo/hello">
    <form:label path="name">Input Your Name:</form:label>
    <form:input path="name" />
    <form:errors path="name" cssStyle="color:red" /><%-- (1) --%>
    <input type="submit" />
  </form:form>
</body>
</html>