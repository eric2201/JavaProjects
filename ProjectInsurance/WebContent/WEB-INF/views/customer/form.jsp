<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<jsp:include page="/WEB-INF/resources/header.jsp" />

</head>
<body>
	<jsp:include page="/WEB-INF/resources/nav.jsp" />

	<div class="container">


<h2>Adicionar Customer</h2>
		<br>
		<%
			if (request.getAttribute("msg") != null && request.getAttribute("msg").equals("Adicionado com sucesso!")) {
		%>
		<div id="msg" class="alert alert-success"><%=request.getAttribute("msg")%></div>
		<%
			} else if(request.getAttribute("msg") != null && request.getAttribute("msg").equals("Erro ao adicionar") ){
		%>
		<div id="msg" class="alert alert-danger"><%=request.getAttribute("msg")%></div>
		<%
			}
		%>
		<br>


		<br>
		<form method="post" action="addCustomer" class="form-horizontal">


			<div class="form-group">
				<label class="col-sm-2 control-label">Name:</label>
				<div class="col-sm-6">
					<input type="text" name="name" class="form-control" required>
				</div>


				<label class="col-sm-2 control-label">Last Name:</label>
				<div class="col-sm-6">
					<input type="text" name="last_name" class="form-control" required>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Nationality:</label>
				<div class="col-sm-6">
					<input type="text" name="nationality" class="form-control" required>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Address:</label>
				<div class="col-sm-6">
					<input type="text" name="address" class="form-control" required>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">City:</label>
				<div class="col-sm-6">
					<input type="text" name="city" class="form-control" required>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">State:</label>
				<div class="col-sm-6">
					<input type="text" name="state" class="form-control" required>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Country:</label>
				<div class="col-sm-6">
					<input type="text" name="country" class="form-control" required>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Zip Code:</label>
				<div class="col-sm-6">
					<input type="text" name="zip_code" class="form-control" required>
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-10">
					<button type="submit" class="btn btn-primary">Adicionar</button>
				</div>
			</div>
		</form>


		
		<br>
		<h2>Atualizar</h2>
		<form action="" method="post">
			<div class="form-group">
				<div class="col-sm-6">
					<label class="col-sm-4 control-label">Digite o id:</label> <input
						type="text" name="update_id" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-6">
					<label class="col-sm-4 control-label">Nome:</label> <input
						type="text" name="update_name" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<div class="">
					<button type="submit" class="btn btn-warning">Update</button>
				</div>
			</div>

		</form>

	</div>
	<script type="text/javascript">
		// Iniciará quando todo o corpo do documento HTML estiver pronto.
		$().ready(function() {
			setTimeout(function() {
				$('#msg').hide(); // "msg" é o id do elemento que seja manipular.
			}, 2500); // O valor é representado em milisegundos.
		});
	</script>
</body>
</html>