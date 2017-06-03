<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ include file="header.jsp" %>
<h1><spring:message code="hotelRoomDetails" /></h1>
<table>
    <tr>
        <td><spring:message code="beds" />:</td>
        <td>${beds}</td>
    </tr>
    <tr>
        <td><spring:message code="space" />:</td>
        <td>${space} <spring:message code="m2" /></td>
    </tr>
    <tr>
        <td><spring:message code="bathroom" />:</td>
        <td>${bathroom ? "Yes" : "No"}</td>
    </tr>
    <tr>
        <td><spring:message code="tv" />:</td>
        <td>${tv ? "Yes" : "No"}</td>
    </tr>
    <tr>
        <td><spring:message code="airConditioning" />:</td>
        <td>${airConditioning ? "Yes" : "No"}</td>
    </tr>
    <tr>
        <td><spring:message code="pricePerDay" />:</td>
        <td>${pricePerDay} <spring:message code="eur" /></td>
    </tr>
</table>
<%@ include file="footer.jsp" %>
