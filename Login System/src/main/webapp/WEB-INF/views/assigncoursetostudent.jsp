<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<tiles:insertDefinition name="adminTemplate">
	<tiles:putAttribute name="body">
	<div class="col-sm-9">
		<h4 class="sub-header">Assign Course to Student</h4>
		<div class="panel panel-default">
	 		<div class="panel-heading">Subjects</div>
			<div class="panel-body">
				<div class="input-group"><input type="radio" name="course" />MS Medical Software</div>
				<div class="input-group"><input type="radio" name="course" />MS IT Management</div>
				<br>
				<button type="button" class="btn btn-success">SAVE</button>
	        </div>
	    </div>
    </div>
	</tiles:putAttribute>
</tiles:insertDefinition>
