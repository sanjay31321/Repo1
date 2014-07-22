<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<tiles:insertDefinition name="adminTemplate">
	<tiles:putAttribute name="body">
	<div class="col-sm-9">
	
	<div class="panel panel-default">
 		<div class="panel-heading">User Manager</div>
 			<div class="panel-body">				
				<div class="table-responsive">
		            <table class="table table-striped">
		              <thead>
		                <tr>
		                  <th>#</th>
		                  <th>Username</th>
		                  <th>Type</th>
		                  <th>Name</th>
		                  <th>Email</th>
		                  <th>Action</th>
		                </tr>
		              </thead>
		              <tbody>
		                <tr>
		                  <td>1</td>
		                  <td>sanjaykumar</td>
		                  <td>Teacher</td>
		                  <td>Sanjay Kumar</td>
		                  <td>sanjay31321@gmail.com</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
		                  	<a href="#"> Activate/Deactivate</a>
		                  </td>
		                </tr>
		                <tr>
		                  <td>2</td>
		                  <td>sahilsharma</td>
		                  <td>Student</td>
		                  <td>Sahil Sharma</td>
		                  <td>sahil@gmail.com</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
		                  	<a href="#"> Activate/Deactivate</a>
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
