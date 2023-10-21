<?php 

	 $numero1 ="";
     $numero2 = "";

	if ($_POST) {
		$numero1 = $_POST['num1'];
		$numero2 = $_POST['num2'];
	}

	if ($_POST) {
		 $suma = ($numero1 + $numero2);
         echo "<a href='http://localhost:3000/EjerciciosPracticos/src/EjerciciosPHP/prueba.html'> Volver</a>";
		 echo "<br><br><strong>La suma de ".$numero1." y ".$numero2." es: ".$suma."</strong>";
	}else{
		echo "Algo ha pasado!";
	}
?>