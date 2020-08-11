saudacao("Vinicius");
//ordem da chamada ou criação da function não importa


function multiplicacao(p1, p2){
  console.log("function multiplicacao executada");
  return p1 * p2;
}

function saudacao(nome){
  console.log("Olá, " + nome + " seja bem vindo!\n");
}

function funcaoSemParamentro() {
  var a = 1;
  var b = 2
  console.log(a + b);
}


console.log(multiplicacao(4,3));

funcaoSemParamentro();