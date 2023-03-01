<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Result</title>
</head>
<body>
    <%= request.getSession().getAttribute("result")%>
</body>
</html>
