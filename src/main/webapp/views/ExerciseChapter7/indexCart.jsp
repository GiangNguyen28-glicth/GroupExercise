<%--
  Created by IntelliJ IDEA.
  User: diepn
  Date: 10/8/2021
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Shop</title>
</head>
<body>

<h1>CD list</h1>
<table>
    <tr>
        <th>Description</th>
        <th class="right">Price</th>
        <th>&nbsp;</th>
    </tr>
    <tr>
        <td>86 (the band) - True Life Songs and Pictures</td>
        <td class="right">$14.95</td>
        <td><form action="exercise-cart?action=cart" method="post">
            <input type="hidden" name="productCode" value="8601">
            <input type="submit" value="Add To Cart">
        </form><!--<a href="cart?productCode=8601">Add To Cart</a>--></td>
    </tr>
    <tr>
        <td>Paddlefoot - The first CD</td>
        <td class="right">$12.95</td>
        <td><form action="exercise-cart?action=cart" method="post">
            <input type="hidden" name="productCode" value="pf01">
            <input type="submit" value="Add To Cart">
        </form></td>
    </tr>
    <tr>
        <td>Paddlefoot - The second CD</td>
        <td class="right">$14.95</td>
        <td><form action="exercise-cart?action=cart" method="post">
            <input type="hidden" name="productCode" value="pf02">
            <input type="submit" value="Add To Cart">
        </form></td>
    </tr>
    <tr>
        <td>Joe Rut - Genuine Wood Grained Finish</td>
        <td class="right">$14.95</td>
        <td><form action="exercise-cart?action=cart" method="post">
            <input type="hidden" name="productCode" value="jr01">
            <input type="submit" value="Add To Cart">
        </form></td>
    </tr>
</table>

</body>
</html>
