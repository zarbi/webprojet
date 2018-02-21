<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Formation</title>

<link media=all rel="stylesheet" href="themes/css/bootstrap.css" type="text/css"/>
<link media=all rel="stylesheet" href="themes/css/bootstrap-grid.css" type="text/css"/>
<script src="theme/js/boostrap.js"></script>
</head>

<body>


	<div class="container">
		<div class="row">
		<div class="col">
				<ul class="nav justify-content-center" >
					<li class="nav-item"><a class="nav-link active" href="index.html">Index</a></li>
					<li class="nav-item"><a class="nav-link active" href="Eleve" >Eleve</a></li>
					<li class="nav-item"><a class="nav-link active" href="Contact" >Contact</a></li>
				</ul>
			</div>
		</div>

		<div class="row">
		
			<h1>Contact</h1>
			<hr />
		
		</div>	
		<div class="row">
			<h2>Ajout/récupération</h2>
</div>	
<div class="row">
			<form action="./Contact" method="post">

				<table>
					<tr>
						<td>Nom</td>
						<td><input type="text" name="tnom" size="20"></td>
					</tr>
					<tr>
						<td>Prenom</td>
						<td><input type="text" name="tprenom" size="20"></td>
					</tr>
					<tr>
						<td>Adresse</td>
						<td><input type="text" name="tadresse" size="20"></td>
					</tr>
					<tr>
						<td>Né(e) le</td>
						<td><input type="text" name="tnele" size="20"></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="Valider"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>

</body>
</html>