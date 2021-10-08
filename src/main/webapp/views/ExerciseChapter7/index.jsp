<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Album</title>
</head>
<body>

<h1>List of albums</h1>
<p>User Email: ${cookie.userEmail.value}</p>

<p>
    <a href="<c:url value="/exercise-download?action=checkUser&amp;productCode=8601"/>">
        86 (the band) - True Life Songs and Pictures
    </a><br>

    <a href="/exercise-download?action=checkUser&amp;productCode=pf01">
        Paddlefoot - The First CD
    </a><br>

    <a href="/exercise-download?action=checkUser&amp;productCode=pf02">
        Paddlefoot - The Second CD
    </a><br>

    <a href="/exercise-download?action=checkUser&amp;productCode=jr01">
        Joe Rut - Genuine Wood Grained Finish
    </a>
</p>

</body>
</html>