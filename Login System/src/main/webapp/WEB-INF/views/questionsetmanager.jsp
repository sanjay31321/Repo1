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
		                  <th>Name</th>
		                  <th>Created</th>
		                  <th>Action</th>
		                </tr>
		              </thead>
		              <tbody>
		                <tr>
		                  <td>1</td>
		                  <td>Question set 1</td>
		                  <td>23/07/2013</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
		                  	<a href="#"> ADD QUESTIONS</a>
		                  </td>
		                </tr>
		                <tr>
		                  <td>2</td>
		                  <td>Question set 2</td>
		                  <td>30/07/2013</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
		                  	<a href="#"> ADD QUESTIONS</a>
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
