<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<tiles:insertDefinition name="adminTemplate">
	<tiles:putAttribute name="body">
	<div class="col-sm-9">
	
	<div class="panel panel-default">
 		<div class="panel-heading">Student Manager</div>
 			<div class="panel-body">				
				<div class="table-responsive">
		            <table class="table table-striped">
		              <thead>
		                <tr>
		                  <th>#</th>
		                  <th>Student</th>
		                  <th>Course</th>
		                  <th>Action</th>
		                </tr>
		              </thead>
		              <tbody>
		                <tr>
		                  <td>1</td>
		                  <td>Sanjay Kumar</td>
		                  <td>MS IT Management</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
		                  	<a href="#"> CHANGE COURSE</a>
		                  </td>
		                </tr>
		                <tr>
		                  <td>2</td>
		                  <td>Sahil Sharma</td>
		                  <td>MS Medical Software</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
		                  	<a href="#"> CHANGE COURSE</a>
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
