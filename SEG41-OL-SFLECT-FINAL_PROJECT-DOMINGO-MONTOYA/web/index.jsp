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
 	<div class="nav-links"><a class="active" href="index.jsp">Home</a></div> <!-- Links to: index.jsp -->
    <div class="nav-links"><a href="allProducts.jsp">Games</a></div> <!-- Links to: allProducts.jsp -->
    <div class="nav-links"><a href="cart.jsp">Cart</a></div> <!-- Links to: cart.jsp -->
</nav>
    
<body>
 <div class="hero-image">
 <form action="game.action" method="post">
	 <button class="hero-button" type="submit" name="gameCode" value="crashteamracing"></button>
 </form>
 </div>
        <!-- Links to: viewProducts.jsp : must load Crash Team Racing Nitro Fueled data (game name, game price) -->

        <div class="barrier">
            <div class="barrier-line"></div>
        </div>

        <section><h2>Give love for these games</h2>
            <div class="newsContainer">
                <img src="images\news-bayonetta.jpg">
                <p><i>06/18/2020</i></p>
                <h4>Bayonetta, the beloved witch that stole our hearts</h4>
                <p>The famous and ever so sassy witch, Bayonetta has always been a popular character for gamers due to her attitude, moxie, and combat prowess.
                    No one dares to go against her, as she can control time itself if you get too close. She's also very agile and very deadly from both near and
                    distant ranges. Did she peek your interest? Come check Bayonetta 2!
                </p>
                <form action="game.action" method="post">
                	<button type="submit" name="gameCode" value="bayonetta">Check game</button>
                </form>
                <!-- Links to: viewProducts.jsp : must load Bayonetta data (game name, game price) -->
            </div>

            <div class="newsContainer">
                    <img src="images\news-ringfitadventure.jpg">
                    <p><i>06/26/2020</i></p>
                <h4>Ready your body, Ring Fit Adventure is here!</h4>
                <p>Nintendo has done it again. Ring Fit Adventure is a mixture of an RPG game that mixes really well with exercise. Not exercising your character
                    in-game, but you yourself as the player. Travel the world of monsters that exercise as well and defeat the prideful and evil macho demon thing.
                    This game is very innovative as it actually makes exercising fun, most especially if you are a gamer. Is your body ready? Come check
                    Ring Fit Adventure!
                </p>
                <form action="game.action" method="post">
                	<button type="submit" name="gameCode" value="ringfitadventure">Check game</button>
                 </form>
                <!-- Links to: viewProducts.jsp : must load Ring Fit Adventure data (game name, game price) -->
                </div>
        </section>

        <div class="barrier">
            <div class="barrier-line"></div>
        </div>

        <section>
            <h2>Hot Sellers</h2>    
            <div class="hotSellersContainer">
                <img src="images\hotseller-fe3h.png">
                <h4>Fire Emblem Three Houses</h4>
                <form action="game.action" method="post">
                	<button type="submit" name="gameCode" value="fireemblem">Check game</button>
                </form>
                <!-- Links to: viewProducts.jsp : Fire Emblem Three Houses data (game name, game price) -->
            </div>

            <div class="hotSellersContainer">
                <img src="images\hotseller-minecraft.jpg">
                <h4>Minecraft</h4>
                <form action="game.action" method="post">
                	<button type="submit" name="gameCode" value="minecraft">Check game</button>
                </form>
                <!-- Links to: viewProducts.jsp : must load Minecraft data (game name, game price) -->
            </div>

            <div class="hotSellersContainer">
                <img src="images\hotseller-re2r.jpeg">
                <h4>Resident Evil 2 Remake</h4>
                <form action="game.action" method="post">
                	<button type="submit" name="gameCode" value="residentevil">Check game</button>
                </form>
                <!-- Links to: viewProducts.jsp : must load Resident Evil 2 data (game name, game price) -->
            </div>

            <a href="allProducts.jsp"><span>Check all games here ></span></a>
            <!-- LINKS TO:  allProducts.jsp -->
        </section>

        <div class="barrier">
            <div class="barrier-line"></div>
        </div>


</body>
</html>