<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h2>Enter User Information</h2>
<form:form method="POST" modelAttribute="accountType">
    <form:hidden path="id" />
    <table>
        <tr>
            <td><form:label path="name">Account type:</form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">Edit</button>
            </td>
        </tr>
    </table>
    <p><a href="/DraganMitic/account/types/">Back to list</a></p>
</form:form>