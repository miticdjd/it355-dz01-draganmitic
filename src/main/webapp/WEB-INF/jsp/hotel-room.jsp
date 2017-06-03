<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ include file="header.jsp" %>
<h1><spring:message code="addNewHotelRoom" /></h1>
<form:form method="POST" action="/DraganMitic/hotel/room/add">
   <table>
    <tr>
        <td><form:label path="beds"><spring:message code="beds" /></form:label></td>
        <td><form:input path="beds" /></td>
    </tr>
    <tr>
        <td><form:label path="space"><spring:message code="space" /></form:label></td>
        <td><form:input path="space" /></td>
    </tr>
    <tr>
        <td><form:label path="bathroom"><spring:message code="bathroom" /></form:label></td>
        <td><form:checkbox path="bathroom" /></td>
    </tr>
    <tr>
        <td><form:label path="tv"><spring:message code="tv" /></form:label></td>
        <td><form:checkbox path="tv" /></td>
    </tr>
    <tr>
        <td><form:label path="airConditioning"><spring:message code="airConditioning" /></form:label></td>
        <td><form:checkbox path="airConditioning" /></td>
    </tr>
    <tr>
        <td><form:label path="pricePerDay"><spring:message code="pricePerDay" /></form:label></td>
        <td><form:input path="pricePerDay" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="add" />"/>
        </td>
    </tr>
</table>  
</form:form>
<%@ include file="footer.jsp" %>
