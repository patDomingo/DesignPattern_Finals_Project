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
         <div class="nav-links"><a class="active" href="allProducts.jsp">Games</a></div> <!-- Links to: allProducts.jsp -->
         <div class="nav-links"><a href="cart.jsp">Cart</a></div> <!-- Links to: cart.jsp -->
</nav>
<body>
<section class="crunchSection"><h2>All games</h2>
            <div class="gamesMaxContainer">
                <div class="img-hover-zoom"><img src="images\hotseller-re2r.jpeg"></div>
                <p>Php 1200</p>
                <form action="game.action" method="post">
                	<button type="submit" name="gameCode" value="residentevil">Buy Resident Evil 2 Remake</button>
                </form>
                <!-- Links to: viewProducts.jsp : must load Resident Evil 2 data (game name, game price) -->
            </div>

            <div class="gamesMaxContainer">
                <div class="img-hover-zoom"><img src="images\hotseller-fe3h.png"></div>
                <p>Php 2800</p>
                <form action="game.action" method="post">
                	<button type="submit" name="gameCode" value="fireemblem">Buy Fire Emblem Three Houses</button>
                </form>
                <!-- Links to: viewProducts.jsp : Fire Emblem Three Houses data (game name, game price) -->
            </div>
        </section>

        <section>
            <div class="gamesMinContainer">
                <div class="img-hover-zoom"><img src="images\hero-image.jpg"></div>
                <p>Php 1500</p>
                <form action="game.action" method="post">
                	<button type="submit" name="gameCode" value="crashteamracing">Buy Crash Team Racing Nitro Fueled</button>
                </form>
                <!-- Links to: viewProducts.jsp : must load Crash Team Racing Nitro Fueled data (game name, game price) -->
            </div>

            <div class="gamesMinContainer">
                <div class="img-hover-zoom"><img src="images\hotseller-minecraft.jpg"></div>
                <p>Php 999</p>
                <form action="game.action" method="post">
                	<button type="submit" name="gameCode" value="minecraft">Buy Minecraft</button>
                </form>
                <!-- Links to: viewProducts.jsp : must load Minecraft data (game name, game price) -->
            </div>

            <div class="gamesMinContainer">
                <div class="img-hover-zoom"><img src="images\ringfitadventure.jpg"></div>
                <p>Php 3500</p>
                <form action="game.action" method="post">
                	<button type="submit" name="gameCode" value="ringfitadventure">Buy Ring Fit Adventure</button>
                </form>
                <!-- Links to: viewProducts.jsp : must load Ring Fit Adventure data (game name, game price) -->
            </div>

            <div class="gamesMinContainer">
                <div class="img-hover-zoom"><img src="images\bayonetta2.jpg"></div>
                <p>Php 1400</p>
                <form action="game.action" method="post">
                	<button type="submit" name="gameCode" value="bayonetta">Buy Bayonetta 2</button>
                </form>
                <!-- Links to: viewProducts.jsp : must load Bayonetta data (game name, game price) -->
            </div>
        </section>

        <div class="barrier">
            <div class="barrier-line"></div>
        </div>
</body>
</html>