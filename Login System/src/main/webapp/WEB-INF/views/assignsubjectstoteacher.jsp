<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>

<tiles:insertDefinition name="adminTemplate">
	<tiles:putAttribute name="body">
	<div class="col-sm-9">
		<h4 class="sub-header">Assign Subjects to Teacher</h4>
		<div class="row">
			<div class="col-sm-5">
				<div class="panel panel-default">
	 				<div class="panel-heading">Subjects</div>
					<div class="panel-body">				
						<div class="table-responsive">
	            			<select size="10">
								<option value="volvo">Volvo</option>
								<option value="saab">Saab</option>
								<option value="mercedes">Mercedes</option>
								<option value="audi">Audi</option>
							</select>
	        			</div>
	        		</div>
	        	</div>
	        </div>
	        <div class="col-sm-1 text-center v-center">
	        	<br>
	        	<button type="button" class="btn btn-default">ADD<i class="glyphicon glyphicon-chevron-right"></i></button>
	        	<br><br><br>
	        	<button type="button" class="btn btn-default">DEL<i class="glyphicon glyphicon-chevron-left"></i> </button>
	        	<br><br><br>
	        	<button type="button" class="btn btn-success">SAVE</button>
	        </div>
	        <div class="col-sm-5">
				<div class="panel panel-default">
	 				<div class="panel-heading">Assigned Subjects</div>
					<div class="panel-body">				
						<div class="table-responsive">
	            			<select size="10">
								<option value="volvo">Volvo</option>
								<option value="saab">Saab</option>
								<option value="mercedes">Mercedes</option>
								<option value="audi">Audi</option>
							</select>
	        			</div>
	        		</div>
	        	</div>
	        </div>
	    </div>
    </div>
	</tiles:putAttribute>
</tiles:insertDefinition>
