<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/7/2021
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Get Discount</title>
  </head>
  <body>
  <form action="/display-discount" method="post">
    <input type="text" name="desc" placeholder="Product Description">
    <input type="text" name="listPrice" placeholder="Price">
    <input type="text" name="discountPercent" placeholder="%">
    <input type="submit" id="submit" value="Get Discount Now">
  </form>
  </body>
</html>
