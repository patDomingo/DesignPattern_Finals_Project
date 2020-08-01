<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="CssGames.css">
        <link href="https://fonts.googleapis.com/css2?family=MuseoModerno&display=swap" rel="stylesheet">
<title>Domeng E-Shop</title>
</head>
	<nav>
            <div class="logo"><p>Domeng E-Shop </p></div>
            <div class="nav-links"><a href="#"></a></div> <!-- Purposely empty -->
            <div class="nav-links"><a href="#"></a></div> <!-- Purposely empty -->
            <div class="nav-links"><a href="index.jsp">Home</a></div> <!-- Links to: index.jsp -->
    		<div class="nav-links"><a href="allProducts.jsp">Games</a></div> <!-- Links to: allProducts.jsp -->
    		<div class="nav-links"><a href="cart.jsp">Cart</a></div> <!-- Links to: cart.jsp -->
    </nav>
<body>
	 <section class="sectionPaddingless">
            <div class="backgroundColor">
                <h2>View Product</h2>
            </div>
            <div class="viewProductDetailsContainer">
                <h4>${game.gameName}</h4>
                <p>${game.gamePrice }</p>
                <form action="addToCart.action" method="post">
                	<button type="submit" name="gameCode" value="${game.gameCode}">Add to cart</button>
                </form>
                <!-- Function must add to cart -->
            </div>
       </section>
</body>
</html>