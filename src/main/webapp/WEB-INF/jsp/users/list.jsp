<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users list</title>
    </head>
    <body>
        <h1>Users</h1>
        <p><a href="/DraganMitic/users/add">Add new user</a></p>
        <c:if test="${!empty users}">
            <table>
                <tr>
                    <th width="100">Firstname</th>
                    <th width="100">Lastname</th>
                    <th width="100">Email</th>
                    <th width="100">Options</th>
                </tr>
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td>${user.firstname}</td>
                        <td>${user.lastname}</td>
                        <td>${user.email}</td>
                        <td>
                            <a href="/DraganMitic/users/edit/${user.id}">Edit</a>
                            <a href="/DraganMitic/users/delete/${user.id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
