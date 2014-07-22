<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<tiles:insertDefinition name="adminTemplate">
	<tiles:putAttribute name="body">
	<div class="col-sm-9">
	
		<div class="panel panel-default">
 		<div class="panel-heading">Profile  - Sanjay Kumar</div>
 			<div class="panel-body">
 				<div class="row">
 					<div class="col-sm-8">
 						<div class="row">
 							<div class="col-sm-4">
								<label for="role">Role</label>
							</div>
							<div class="col-sm-4">
								<label for="role"><strong>Admin</strong></label>
							</div>
						</div>
						<br/>	
 						<div class="row">
 							<div class="col-sm-4">
								<label for="username">Username</label>
							</div>
							<div class="col-sm-7">
								<input Class="form-control" name="username" disabled="true" value="sanjaykumar"/>
							</div>
						</div>
						<br/>
						<div class="row">
 							<div class="col-sm-4">
								<label for="email">Email</label>
							</div>
							<div class="col-sm-7">
								<input Class="form-control" name="email"  value="sanjaykumar@gmail.com"/>
							</div>
						</div>
						<br/>
						<div class="row">
 							<div class="col-sm-4">
								<label for="first_name">First Name</label>
							</div>
							<div class="col-sm-7">
								<input Class="form-control" name="first_name" value="Sanjay"/>
							</div>
						</div>
						<br/>
						<div class="row">
 							<div class="col-sm-4">
								<label for="last_name">Last Name</label>
							</div>
							<div class="col-sm-7">
								<input Class="form-control" name="last_name"  value="Kumar"/>
							</div>
						</div>
 					</div>
 					<div class="col-sm-4">
 						<img data-src="holder.js/150x150/auto/vine" class="img-responsive" height="200px" width="200px" alt="200x200" 
	              			src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIyMDAiIGhlaWdodD0iMjAwIj48cmVjdCB3aWR0aD0iMjAwIiBoZWlnaHQ9IjIwMCIgZmlsbD0iIzM5REJBQyIvPjx0ZXh0IHRleHQtYW5jaG9yPSJtaWRkbGUiIHg9IjEwMCIgeT0iMTAwIiBzdHlsZT0iZmlsbDojMUUyOTJDO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjEzcHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+MjAweDIwMDwvdGV4dD48L3N2Zz4=">
    				    <br/>
    				    <p><input type="file" name="pic" class="btn btn-sm btn-default"></input></p>
 					</div>
 				</div>
 				
 				
 				<hr />
 				
 				<div class="row">
 					<div class="col-sm-8">
 						<div class="row">
 							<div class="col-sm-4">
 								<label for="role">Security Question</label>
 							</div>
 							<div class="col-sm-7">
								<input Class="form-control" name="current_password"/>
							</div>
 						</div>
 						<br>
 						<div class="row">
 							<div class="col-sm-4">
 								<label for="role">Security Answer</label>
 							</div>
 							<div class="col-sm-7">
								<input Class="form-control" name="current_password"/>
							</div>
 						</div>
 					</div>
 				</div>
 				
 				
 				<hr />
 				
 				<div class="row">
 					<div class="col-sm-8">
 						<div class="row">
 							<div class="col-sm-4">
 								<label for="role">Current Password</label>
 							</div>
 							<div class="col-sm-7">
								<input Class="form-control" name="current_password"/>
							</div>
 						</div>
 						<br>
 						<div class="row">
 							<div class="col-sm-4">
 								<label for="role">New Password</label>
 							</div>
 							<div class="col-sm-7">
								<input Class="form-control" name="current_password"/>
							</div>
 						</div>
 						<br>
 						<div class="row">
 							<div class="col-sm-4">
 								<label for="role">Confirm Password</label>
 							</div>
 							<div class="col-sm-7">
								<input Class="form-control" name="current_password"/>
							</div>
 						</div>
 					</div>
 					<div class="col-sm-2">
 						<button  type="submit" class="btn btn-sm btn-success form-control">Save</button>
 						<br/><br/>
 						<button  class="btn btn-sm btn-default form-control">Cancel </button>
 					</div>
 				</div>
			</div>
        </div>
     </div>
	</tiles:putAttribute>
</tiles:insertDefinition>
