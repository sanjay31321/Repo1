<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<tiles:insertDefinition name="adminTemplate">
	<tiles:putAttribute name="body">
	<div class="col-sm-9">
	
	<div class="panel panel-default">
 		<div class="panel-heading"><spring:message code="app.panel.title.coursemanager" /></div>
 			<div class="panel-body">
				<div class="row">
					<div class="col-sm-8">
							<form:form commandName="course">
								<form:errors path="*" cssClass="errorblock" element="div" />
								<div class="input-group">
									<form:input path="name" class="form-control" /> 
										<span class="input-group-btn">
											<button type="submit" class="btn btn-default" type="button">
											<spring:message code="app.panel.addcourse" />
										</button>
									</span>
								</div>
							</form:form>
						</div>
    			</div>
    			<hr/>
				<div class="table-responsive">
						<table class="table table-striped">
							<thead>
								<tr>
									<th>#</th>
									<th><spring:message code="app.panel.course" /></th>
									<th><spring:message code="app.panel.action" /></th>

								</tr>
							</thead>
							<tbody>
								<c:forEach items="${courseList}" var="course">
									<tr>
										<td>${course.id}</td>
										<td>${course.name}</td>
										<td>
											<a href="editcourse.html?id=${course.id}" class="btn btn-sm btn-primary">EDIT</a>
											<a href="coursemanager.html?action=delete&id=${course.id}" class="btn btn-sm btn-danger">DELETE</a>
											<a href="assignsubjectstocourse.html?id=${course.id}" class="btn btn-sm btn-success">ASSIGN SUBJECTS</a>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
          		</div>
          	</div>
          </div>
	</tiles:putAttribute>
</tiles:insertDefinition>
