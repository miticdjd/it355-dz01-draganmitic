<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account types list</title>
    </head>
    <body>
        <h1>Account types</h1>
        <p><a href="/DraganMitic/account/types/add">Add new account type</a></p>
        <c:if test="${!empty accountTypes}">
            <table>
                <tr>
                    <th width="100">Name</th>
                    <th width="100">Options</th>
                </tr>
                <c:forEach items="${accountTypes}" var="accountType">
                    <tr>
                        <td>${accountType.name}</td>
                        <td>
                            <a href="/DraganMitic/account/types/edit/${accountType.id}">Edit</a>
                            <a href="/DraganMitic/account/types/delete/${accountType.id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
