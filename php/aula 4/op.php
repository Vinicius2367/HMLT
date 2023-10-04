<?php

$nome = filter_input(INPUT_POST, 'nome');
$idade = filter_input(INPUT_POST, 'idade');
$genero = filter_input(INPUT_POST, 'genero');
$idiomas = filter_input(INPUT_POST, 'idiomas');
$gmail = filter_input(INPUT_POST, 'gmail');
$senha = filter_input(INPUT_POST, 'senha');
$consenha = filter_input(INPUT_POST, 'consenha');
$mensagem = filter_input(INPUT_POST, 'mensagem');

echo $nome;

if ($idade < 18) {
    echo "Você é menor de idade";
} else {
    echo "Você é maior de idade";
}

if (isset($_POST['idiomas'])) {
    $idiomas = $_POST['idiomas'];
    foreach ($idiomas as $idioma) {
        print $idioma . "<br>";
    }
}

if ($senha == $consenha) {
    echo "Senhas iguais";
} else {
    echo "Senhas diferentes";
}

?>