<%@ page import ="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<body>
<center>
    <h1>
        Person Create
    </h1>

    <form method="post" action="<%=request.getContextPath()%>/person/create">
        Name:

        <input type="text" name="name"  >
        <br><br>
        Age:
        <input type="text" name="address" >
        <br><br>
        City:
        <input type="text" name="msisdn"  >
        <br><br>

        <input type="submit" value="Save" />
    </form>

</center>
</body>
</html>