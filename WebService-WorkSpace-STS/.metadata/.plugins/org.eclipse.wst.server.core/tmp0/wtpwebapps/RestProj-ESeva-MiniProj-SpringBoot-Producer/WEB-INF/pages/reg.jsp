<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

    <form:form modelAttribute="EsevaVo" method="post">
    	User Id :: <form:input path="userId"/><br>
    	User Name :: <form:input path="name"/><br>
    	User Addrs :: <form:input path="addrs"/><br>
    	<input type="text"  value="submit">
    </form:form>