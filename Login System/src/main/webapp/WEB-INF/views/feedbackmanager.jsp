<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<tiles:insertDefinition name="adminTemplate">
	<tiles:putAttribute name="body">
	<div class="col-sm-9">
	
	<div class="panel panel-default">
 		<div class="panel-heading">Feedback Manager</div>
 				
 			<div class="panel-body">				
				<div class="table-responsive">
		            <table class="table table-striped">
		              <thead>
		                <tr>
		                  <th>#</th>
		                  <th>Feedback</th>
		                  <th>Created By</th>
		                  <th>Subject</th>
		                  <th>Date</th>
		                  <th>Score</th>
		                  <th>Action</th>
		                </tr>
		              </thead>
		              <tbody>
		                <tr>
		                  <td>1</td>
		                  <td>Java_Feedback</td>
		                  <td>Sanjay Kumar</td>
		                  <td>Java</td>
		                  <td>23/07/2014</td>
		                  <td>90%</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
		                  	<a href="#"> ACTIVATE/DEACTIVATE</a>
		                  </td>
		                </tr>
		                <tr>
		                  <td>2</td>
		                  <td>Java_Feedback</td>
		                  <td>Sanjay Kumar</td>
		                  <td>Java</td>
		                  <td>23/07/2014</td>
		                  <td>90%</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
		                  	<a href="#"> ACTIVATE/DEACTIVATE</a>
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
