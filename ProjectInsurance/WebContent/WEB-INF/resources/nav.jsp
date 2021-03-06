<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-toggleable-md navbar-inverse bg-inverse">
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <a class="navbar-brand" href="https://v4-alpha.getbootstrap.com/examples/starter-template/#">Navbar</a>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="https://v4-alpha.getbootstrap.com/examples/starter-template/#">Home <span class="sr-only">(current)</span></a>

          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle"  id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Customer</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="<c:url value="/customer"/>">Adicionar</a>
              <a class="dropdown-item" href="<c:url value="/remove"/>">Remover</a>
              <a class="dropdown-item" href="<c:url value="/update"/>">Atualizar</a>
              <a class="dropdown-item" href="">Listar</a>
            </div>
          </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="text" placeholder="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>
    <br>