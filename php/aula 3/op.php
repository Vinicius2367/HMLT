<?php

$peso = $_POST ['peso'];
$altura = $_POST ['altura'];

$resultado = $peso / ($altura * $altura);

if($resultado < 18.5){
    echo "Abaixo do peso.";
    return $resultado = 0;
}
if($resultado >18.6 && $resultado <=25){
    echo "Está no peso ideal.";
    return $resultado = 0;
}
else{
    echo "Acima do peso.";
    return $resultado = 0;
}