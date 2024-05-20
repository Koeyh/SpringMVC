<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2024-05-20
  Time: 오후 2:20
  To change this template use File | Settings | File Templates.
--%>
<%--JSP를 이용해 Servlet으로 만든 것과 동일한 회원 등록 폼 만들기 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/jsp/members/save.jsp" method="post">
    username: <input type="text" name="username" />
    age: <input type="text" name="age" />
    <button type="submit">전송</button>
</form>
</body>
</html>
