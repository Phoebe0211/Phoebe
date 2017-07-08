<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/28 0028
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>主界面</title>
  </head>
  <body>
    <form action="user_findByAny.action">
      <input type="text" name="value" placeholder="请输入">
      <input type="submit" value="Find">
      <input type="button" value="Add" onclick="window.location.href='add.jsp'">
    </form>
    <table border="1px" cellspacing="0">
      <tr>
        <td>Userid</td>
        <td>UserName</td>
        <td>PassWord</td>
        <td>Operate</td>
      </tr>

      <c:forEach items="${users}" var="u">
        <tr>
          <td>${u.userid}</td>
          <td>${u.username}</td>
          <td>${u.password}</td>
          <td>
            <a href="user_findByUserId.action?user.userid=${u.userid}">Update</a>
            <a href="user_delete.action?user.userid=${u.userid}">Delete</a>
          </td>
        </tr>
      </c:forEach>
    </table>

  </body>
</html>
