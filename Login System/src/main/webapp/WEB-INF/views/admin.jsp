<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<tiles:insertDefinition name="adminTemplate">
	<tiles:putAttribute name="body">
		<div class="col-sm-8">	
			<div class="panel panel-primary">
			<div class="panel-heading">
			<h3 class="panel-title">Admin</h3>
			</div>
			<div class="panel-body">
			<c:set var="role" value="${loggedInUserROLE}"/>
				<c:if test="${role=='ROLE_ADMIN'}">
					<h1>Success</h1>
				</c:if>
				<c:if test="${role!='ROLE_ADMIN'}">
					<script type="text/javascript">	window.location.href="login.html"; </script>
				</c:if>	
			</div>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
