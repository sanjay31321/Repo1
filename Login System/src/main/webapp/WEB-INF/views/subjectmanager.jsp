<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<tiles:insertDefinition name="adminTemplate">
	<tiles:putAttribute name="body">
	<div class="col-sm-9">
	
	<div class="panel panel-default">
 		<div class="panel-heading">Course Manager</div>
 			<div class="panel-body">
				<div class="row">
					<div class="col-sm-8">
						<div class="input-group">
     						<input type="text" class="form-control">
     						<span class="input-group-btn">
        						<button class="btn btn-default" type="button"> Add Subject </button>
      						</span>
     					</div>
     				</div>
    			</div>
    			<hr/>
				<div class="table-responsive">
		            <table class="table table-striped">
		              <thead>
		                <tr>
		                  <th>#</th>
		                  <th>Subject</th>
		                  <th>Action</th>
		              
		                </tr>
		              </thead>
		              <tbody>
		                <tr>
		                  <td>1</td>
		                  <td>Programming with Java</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
		                  </td>
		                </tr>
		                <tr>
		                  <td>2</td>
		                  <td>C Programming</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
		                  </td>
		                </tr>
		                <tr>
		                  <td>3</td>
		                  <td>Algorithms and Data Structures</td>
		                  <td>
		                  	<a href="#"> EDIT</a>
		                  	<a href="#"> DELETE</a>
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
