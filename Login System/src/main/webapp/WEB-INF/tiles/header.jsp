<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="masthead">
	<div class="row">
		<!-- Static navbar -->
		<div class="col-sm-7 blog-header">
			<h3 class="blog-title text-muted"><spring:message code="app.title" /></h3>
			<p class="lead blog-description"><spring:message code="app.tagline" /></p>
		</div>
		<div class="col-sm-3"></div>
		
		<div class="col-sm-2" id="locale">
			<a class="btn btn-default" href="?language=en"><spring:message code="locale.en" /></a>
			<a class="btn btn-default" href="?language=es"><spring:message code="locale.es" /></a>
		</div>
	</div>
</div>