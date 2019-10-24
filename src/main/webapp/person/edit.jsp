<%@ page import ="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>


<body>
 <center>
    <h1>
        Person Edit
    </h1>

    <form method="post" action="<%=request.getContextPath()%>/person/edit">
        Name:
        <c:out value="${person.name}" />
        <input type="hidden" name="name" value="${person.name}" >
        <br><br>
        Address:
        <input type="number" name="age" value="${person.address}" >
        <br><br>
        Msisdn:
        <input type="text" name="city" value="${person.msisdn}" >
        <br><br>
        <input type="hidden" name="typeAction" value="edit" >
        <input type="submit" value="Save" />
    </form>

    <br><br>

    <form method="post" action="<%=request.getContextPath()%>/person/edit">
      <input type="hidden" name="name" value="${person.name}" >
      <input type="hidden" name="typeAction" value="delete" >
      <input type="submit" value="Delete" />
    </form>

</center>
</body>
</html>