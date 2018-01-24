<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Lumino - Login</title>
	<link href="../bootstrap/dist/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
	<link href="../css/styles.css" rel="stylesheet"
	type="text/css">
	<!--[if lt IE 9]>
	<script src="js/html5shiv.js"></script>
	<script src="js/respond.min.js"></script>
	<![endif]-->
</head>
<body>
	<div class="row">
		<div class="col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<div class="panel-heading">Log in</div>
				<div class="panel-body">
					<form role="form" action="/admin/login" method="POST">
						<fieldset>
							<div class="form-group">
								<input class="form-control" placeholder="Username" name="username" type="text" autofocus="">
							</div>
							<div class="form-group">
								<input class="form-control" placeholder="Password" name="password" type="text">
							</div>
							<div class="checkbox">
								<label>
									<input name="remember" type="checkbox" value="Remember Me">Remember Me
								</label>
							</div>
							<input type="submit" class="btn btn-primary" value="Login">
							<c:if test="${param.error ne null}">
								<div class="alert-danger">Invalid username and password.</div>
							</c:if>
							<c:if test="${param.logout ne null}">
								<div class="alert-normal">You have been logged out.</div>
							</c:if>
						</fieldset>
						
						
						<input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
					</form>
				</div>
			</div>
		</div><!-- /.col-->
	</div><!-- /.row -->	


<script src="../plugins/bower_components/jquery/dist/jquery.min.js"></script>
<script src="../bootstrap/dist/js/bootstrap.min.js"></script>
</body>
</html>
