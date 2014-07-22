<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page session="false"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
	<div class="col-sm-8">	
		<h1> <spring:message code="hello.msg" /></h1>
		<P>	<spring:message code="msg.body" /> ${serverTime}.</P>
	</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
