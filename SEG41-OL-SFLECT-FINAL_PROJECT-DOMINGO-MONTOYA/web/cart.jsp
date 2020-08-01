<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="games.model.GameShopCart"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="CssGames.css">
    <link href="https://fonts.googleapis.com/css2?family=MuseoModerno&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/874986f905.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="style.css" />

<title>Domeng E-Shop</title>
</head>
	 <nav>
	      <div class="logo"><p>Domeng E-Shop </p></div>
	      <div class="nav-links"><a href="#"></a></div> <!-- Purposely empty -->
	      <div class="nav-links"><a href="#"></a></div> <!-- Purposely empty -->
	      <div class="nav-links"><a  href="index.jsp">Home</a></div> <!-- Links to: index.jsp -->
	      <div class="nav-links"><a href="allProducts.jsp">Games</a></div> <!-- Links to: allProducts.jsp -->
	      <div class="nav-links"><a class="active" href="cart.jsp">Cart</a></div> <!-- Links to: cart.jsp -->
	</nav>
<body>
 <section>
            <!-- TABLE: Starts as empty. 
                If empty, table will consist only 1 row which is the Total Price. 
                Rows must increment everytime user clicks "Add to cart" 
                After user clicks "Buy", table must reset into being empty. -->
            <div class="outer-container">
                <table>
                    <thead>
                        <tr>
                            <th>Product</th>
                            <th>Price</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                    <%
 						//Start loop
 						if(GameShopCart.clearCart == true){
 							GameShopCart.cartItemName.clear();
 							GameShopCart.cartItemPrice.clear();
 							GameShopCart.currentTotalAmount = 0;
 						}else{
 							for(int index=0; index < GameShopCart.cartItemCtr; index++){
 								int counter = index;
 								double convert = GameShopCart.cartItemPrice.get(index);
                    %>
                        <tr class="priority-600">
                            <td><%=GameShopCart.cartItemName.get(index)%></td>
                            <td>Php <%=String.format("%.2f", convert)%></td>
                            <td><form action="remove.action" method="post">
                            	<button class="delete-btn" type="submit" name="removeItem" value="<%=index%>"><i class="fas fa-trash-alt" title="delete row"></i></button>
                           	</form></td>
                        </tr>
                    <%
 						//End loop
 						}}
                   	%>
                   	
                        <!-- PRICE ROW. Must ALWAYS be present and Total Price's value should be accurate -->
                        <tr>
                            <th style="text-align: center;">Total Price</th>
                            <th style="text-align: right;">Php <%=String.format("%.2f",GameShopCart.currentTotalAmount)%></th>
                        </tr>
                    </tbody>
                </table>
                
				<form action="checkoutCart.action" method="post">
                	<button class="checkoutBtn" type="submit">Buy</button>
                </form>
                <!-- Function must empty the table and update necessary changes (if any, like database, etc) -->
            </div>
        </section>

        <script src="script.js"></script>
</body>
</html>