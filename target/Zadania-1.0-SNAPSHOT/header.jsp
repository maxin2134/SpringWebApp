<%--
  Created by IntelliJ IDEA.
  User: Hitman
  Date: 2021-10-13
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<link href="<c:url value="/resources/css/header.css"/>" rel="stylesheet">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<div class="header">
    <h3><spring:message code="label.title"/> </h3>
    <span style="...">
        <a style="..." href="?lang=pl">pl</a> | <a style="..." href="?lang=en">en</a> | <a style="..." href="?lang=de">de</a>
    </span>
    <br>
    <form id="langForm" action="" method="get">
        <span style="...">
            <select size="1" name="lang" onchange="form.sumbit()">
                <option value="pl">PL</option>
                <option value="en">EN</option>
                <option value="de">DE</option>
            </select>
        </span>
    </form>
</div>
