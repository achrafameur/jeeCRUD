<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
<link  href = "../bootstrap.min.css"  rel = " stylesheet " >
<link  href = "style.css"  rel = " stylesheet " >
</head>
<body>
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


<div class=card  style="width:70%;margin:auto">
<div class="card-body">
<h5 class="card-title">Product Details</h5>

<form method="post" action="addproduit">

<div>
<label class="form-label">Name</label>
<input type=text name=nom required class="form-control car">
</div>

<div>
<label class="form-label">Price</label>
<input type=number name=prix required class="form-control car">
</div>

<div>
<label class="form-label">Quantity</label>
<input name=quantite type=number required="required" class="form-control car"><br>
</div>

<div>
<label class="form-label">Category</label>
<select name="cc">
<c:forEach items="${categories}" var="x">
  <option value=${x.id}>${x.nom}</option>
  </c:forEach>  
</select>
<br>
</div>
</form>
</div>
</div>


</body>
</html>
