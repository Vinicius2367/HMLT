<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro</title>
</head>
<body>

<form action="op.php" method="POST">

<label for="nome">Nome: </label>
<input type="text"name="nome" required><br><br>

<label for="idade">Idade:</label>
<input type="number" name="idade"><br><br>

<label for="genero">Gênero: </label>
<input type="radio" value="m" name="genero">Masculino
<input type="radio" value="f" name="genero">Feminino
<input type="radio" value="o" name="genero">Outro<br><br>

<label for="idiomas">Idiomas: </label>
<input type="checkbox" name="idiomas" value="I">Inglês
<input type="checkbox" name="idiomas" value="E">Espanhol
<input type="checkbox" name="idiomas" value="F">Francês<br><br>

<label for="gmail">Gmail: </label>
<input type="text" name="gmail" required><br><br>

<label for="senha">Senha: </label>
<input type="password" name="senha" required>

<label for="consenha">Confirmar senha: </label>
<input type="password" name="consenha" required><br><br>

<label for="mensagem">Mensagem: </label>
<textarea name="mensagem" ></textarea> <br><br>

<input type="submit" value="Enviar">
    
<form action=""></form>
</body>
</html>