<%--
  Created by IntelliJ IDEA.
  User: Hitman
  Date: 2021-10-12
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>App user page</title>
  </head>
  <body>
  <h1>App user page</h1>
  <form:form method="post" action="addAppUser.html" modelAttribute="appUser">

    <table>
      <tr>
        <td><form:label path="firstName">First Name</form:label></td>
        <td><form:input path="firstName"/></td>
      </tr>
      <tr>
        <td><form:label path="lastName">Last Name</form:label></td>
        <td><form:input path="lastName"/></td>
      </tr>
      <tr>
        <td><form:label path="email">Email</form:label></td>
        <td><form:input path="email"/></td>
      </tr>
      <tr>
        <td><form:label path="telephone">Telephone</form:label></td>
        <td><form:input path="telephone"/></td>
      </tr>
      <tr>
        <td colspan="2">
          <input type="submit" value="Add AppUser">
        </td>
      </tr>
    </table>

  </form:form>
  </body>
</html>
