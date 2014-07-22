<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="col-sm-8">	
			<div class="panel panel-primary">
			<div class="panel-heading">
			<h3 class="panel-title">Register Your Account</h3>
			</div>
			<div class="panel-body">								
				<table border="1">
					<th>Email</th>
					<th>First name</th>
					<th>Last name</th>
					<th>Password</th>
					<c:forEach items="${userList}" var="user">
					<tr>
						<td>${user.email}</td>
						<td>${user.firstname}</td>
						<td>${user.lastname}</td>
						<td>${user.password}</td>
					</tr>
				</c:forEach>
			</table>					
		
			</div>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
