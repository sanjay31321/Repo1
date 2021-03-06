<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="true"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		
		<div class="col-sm-2"></div>
		<div class="col-sm-4">
			
			<div class="panel panel-primary">
			<div class="panel-heading">
			<h3 class="panel-title"><spring:message code="app.panel.title.resetpassword" /></h3>
			</div>
			<div class="panel-body">			
				<form:form commandName="user">
						<form:errors path="*" cssClass="errorblock" element="div" />
						<div class="form-group">
							<label for="inputEmail"><spring:message code="app.form.email" /></label>
							<form:input path="email" cssClass="form-control" disabled="true" value="${email}" />
							<form:errors path="email" cssClass="error" />
						</div>
						<div>
							<div class="form-group">
								<label for="password"><spring:message code="app.form.newpassword" /></label>
								<form:password path="password" cssClass="form-control"  />
							</div>
							<div class="form-group">
								<label for="confirm_password"><spring:message code="app.form.confirmpassword" /></label>
								<form:password path="confirm_password" cssClass="form-control"/>
							</div>
						</div>
						<button type="submit" class="btn btn-primary"> <spring:message code="app.form.submit" /> </button>
				</form:form>
				
			</div>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>
