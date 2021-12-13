<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
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

<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
<div class="card" style="width:70%;margin:auto"><a href="products">All Products</a></div>
<div class="card" style="width:70%;margin:auto"><a href="categories">All Categories</a></div>
</div>

</body>
</html>