<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<tiles:insertDefinition name="adminTemplate">
	<tiles:putAttribute name="body">
	<div class="col-sm-9">
	
	<div class="panel panel-default">
 		<div class="panel-heading">Teacher Manager</div>
 			<div class="panel-body">				
				<div class="table-responsive">
		            <table class="table table-striped">
		              <thead>
		                <tr>
		                  <th>#</th>
		                  <th>Teacher Name</th>
		                  <th>Action</th>
		                </tr>
		              </thead>
		              <tbody>
		                <tr>
		                  <td>1</td>
		                  <td>Prof. Sanjay Kumar</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
		                  	<a href="#"> ASSIGN SUBJECTS</a>
		                  </td>
		                </tr>
		                <tr>
		                  <td>2</td>
		                  <td>Dr. Sahil Sharma</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
		                  	<a href="#"> ASSIGN SUBJECTS</a>
		                  </td>
		                </tr>
		              </tbody>
		            </table>
	          	</div>
          		</div>
          	</div>
          </div>
	</tiles:putAttribute>
</tiles:insertDefinition>
