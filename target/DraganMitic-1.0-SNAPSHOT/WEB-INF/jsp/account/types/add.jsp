<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h2>Enter Account Type Information</h2>
<form:form method="POST" modelAttribute="accountType">
    <table>
        <tr>
            <td><form:label path="name">Name:</form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">Add</button>
            </td>
        </tr>
    </table>
    <p><a href="/DraganMitic/account/types/">Back to list</a></p>
</form:form>