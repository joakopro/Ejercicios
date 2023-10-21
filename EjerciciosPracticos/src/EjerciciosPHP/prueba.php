<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
	
    <script>
        function limpiar(){
            document.getElementById('num1').value ="";
            document.getElementById('num2').value ="";
        }
    </script>		
</head>

<body>
<?php 
	 $numero1 ="";
     $numero2 = "";

    if ($_POST) {
        $numero1 = $_POST['num1'];
        $numero2 = $_POST['num2'];
    }
?>

<h2> Suma de dos números en PHP</h2>
<form action="prueba.php" method="POST">
<table>
    <tr>
        <td>  <input type="text"  placeholder = "numero 1" id="num1" value ="<?php echo $numero1; ?>" > </td>
    </tr>
    <tr>
        <td>  <input type="text"  placeholder = "numero 2" id ="num2" value ="<?php echo $numero2; ?>" > </td>
    </tr>
    <tr>
        <td></br><input type="submit" value="Sumar"> </td>
		<td></br><input type="button" value="Limpiar" onclick= "JavasScript:limpiar();" > </td>
    </tr>	
</table>
</form>

</body>
</html>

<?php 

	if ($_POST) {
		 $suma = ($numero1 + $numero2);
		 echo "<br><strong>La suma de ".$numero1." y ".$numero2." es: ".$suma."</strong>";
	}

?>