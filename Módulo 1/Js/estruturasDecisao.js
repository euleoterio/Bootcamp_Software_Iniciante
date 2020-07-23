var a = 10;
var b = 5;

if (a > b) {
  console.log("a maior que b");
} else if(b < a) {
  console.log("b maior que a");
} else {
  console.log("a e b são iguais");
}

var c = 30;
var d = 30;

if (c >= d) {
  console.log("c maior ou igual a d");
} 
if (d <= c) {
  console.log("d menor ou igual a c");
}

var e = 10;
var f = 10;

if (e === f) {
  console.log("e é igual a f");
}

var g = 10;
var h = "10";

if (g !== h) {
  console.log("g é diferente de h");
}


if ((a !== b) && (c === d)) {
  console.log("Todas condições são válidas");
}

if ((a === b) || (c === d)) {
  console.log("Uma das condições é válida");
}


var fruta = "Abacaxi";
var valor = 0;

switch (fruta) {
  case "Banana":
      valor = 2;
    break;
  case "Maça":
      valor = 3;
    break;
  case "Abacaxi":
      valor = 4;
    break

  default:
    valor = 10;
    break;
}

console.log("Valor: " + valor);


var x = 4;
var y = 2;
var resultado = 0;

resultado = x > y ? "x maior que y" : "senao";
console.log(resultado);