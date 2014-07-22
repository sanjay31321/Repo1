<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<tiles:insertDefinition name="adminTemplate">
	<tiles:putAttribute name="body">
	<div class="col-sm-9">
	
		<div class="panel panel-default">
 		<div class="panel-heading">Create Feedback</div>
 			<div class="panel-body">
 				<div class="row">
 					<div class="col-sm-8">
						<div class="row">
 							<div class="col-sm-4">
								<label for="email">Name</label>
							</div>
							<div class="col-sm-7">
								<input Class="form-control" name="email" />
							</div>
						</div>
						<br/>
						<div class="row">
 							<div class="col-sm-4">
								<label for="first_name">Number of Questions</label>
							</div>
							<div class="col-sm-7">
								<select>
									<option value="volvo">Volvo</option>
									<option value="saab">Saab</option>
									<option value="mercedes">Mercedes</option>
									<option value="audi">Audi</option>
								</select>
							</div>
						</div>
						<br>
						<div class="row">
 							<div class="col-sm-4">
								<label for="email">Date From</label>
							</div>
							<div class="col-sm-7">
								<input Class="form-control" name="email" />
							</div>
						</div>
						<br/>
						<div class="row">
 							<div class="col-sm-4">
								<label for="email">Date To</label>
							</div>
							<div class="col-sm-7">
								<input Class="form-control" name="email" />
							</div>
						</div>
						<br/>
						<div class="row">
 							<div class="col-sm-4">
								<label for="email">Subject</label>
							</div>
							<div class="col-sm-7">
								<select>
									<option value="volvo">Volvo</option>
									<option value="saab">Saab</option>
									<option value="mercedes">Mercedes</option>
									<option value="audi">Audi</option>
								</select>
							</div>
						</div>
						<br/><br/>
						<div class="row">
							
 							<div class="col-sm-4">
 								<button  type="submit" class="btn btn-sm btn-success form-control">Save</button>
 							</div>
 							
 						</div>
 					</div>
 					
 				</div>
 				
 			</div>	
 				
        </div>
     </div>
	</tiles:putAttribute>
</tiles:insertDefinition>
