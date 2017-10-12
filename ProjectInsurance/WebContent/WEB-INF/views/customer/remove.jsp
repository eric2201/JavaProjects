<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<jsp:include page="/WEB-INF/resources/header.jsp" />

</head>
<body>
	<jsp:include page="/WEB-INF/resources/nav.jsp" />
	<div class="container">
		<h2>Remover Customer</h2>
		<br>
		<%
			if (request.getAttribute("msg") != null && request.getAttribute("msg").equals("Removido com sucesso!")) {
		%>
		<div id="msg" class="alert alert-success"><%=request.getAttribute("msg")%></div>
		<%
			} else if(request.getAttribute("msg") != null && request.getAttribute("msg").equals("Erro ao remover") ){
		%>
		<div id="msg" class="alert alert-danger"><%=request.getAttribute("msg")%></div>
		<%
			}
		%>
		<br>
		<form action="removeCustomer" method="get">
			<div class="form-group">
				<div class="col-sm-6">
					<label class="col-sm-4 control-label">Digite o id:</label> <input
						type="text" name="id" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<div class="">
					<button type="submit" class="btn btn-danger">Remover</button>
				</div>
			</div>

		</form>
	</div>
</body>
</html>