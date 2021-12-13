<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products Page</title>
<link  href = "../bootstrap.min.css"  rel = " stylesheet " >
<link  href = "style.css"  rel = " stylesheet " >
</head>
<body >
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="home">Product Management App</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent"  style="margin-left:800px">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" aria-current="page" href="product">Add Product</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="categorie">Add Category</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<div style="width:70%;margin:auto">
<form method=post action="recherche.php" style="margin-left:150px">
  <div class="row" >
   <label class="col-md-2">Search by Name :</label>
   <input type=text name=mc class="form-control car col-md-4"> 
  <input type="submit" name="action" value="rechercher" class="btn btn-primary">
  </div>
</form>
<br><br>
	<table class="table table-striped" style="width:1000px">
		<tr>
		  <th>id</th>
		  <th>Name</th>
		  <th>Price</th>
		  <th>Quantity</th>
		  <th>Category</th>
		  <th>Actions</th>
		</tr>
		<c:forEach items="${liste}" var="x">
			  <tr>
					<td>${x.id}</td>
					<td>${x.nom}</td>
					<td>${x.prix}</td>
					<td>${x.quantite}</td>
					<td>${x.categorie.nom}</td>
					<td>
						<a href="/delete/${x.id}" class="btn btn-danger">Delete</a>
						<a class="btn btn-info">Details</a>
					</td>
			  </tr>	
		</c:forEach>  
	</table>
</div>
</body>
</html>