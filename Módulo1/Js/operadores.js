var soma = 4 + 2;
var subtracao = 5 - 3;
var multiplica = 5 * 4;
var divisao = 10 / 5;
var resto = 20 % 3;

console.log("soma: " + soma);
console.log("subtracao: " + subtracao);
console.log("multiplica: " + multiplica);
console.log("divisão: " + divisao);
console.log("resto: " + resto);

var num1 = 10;
var num2 = 50;
var resultado = (num2 + num1) / (8 + 2);

console.log("presedencia: " + resultado);


var incremento = 1;
incremento = incremento + 1;
incremento++;
console.log("incremento: " + incremento);

var atribuicaoComAdicao = 5;
atribuicaoComAdicao += 6;
console.log("atribuição com adição: " + atribuicaoComAdicao);


var decremento = 1;
decremento = decremento - 1;
decremento--;
console.log("decremento: " + decremento);


var atribuicaoComSubtracao = 5;
atribuicaoComSubtracao -= 6;
console.log("atribuição com subtracao: " + atribuicaoComSubtracao);


var atribuicaoComMultiplicacao = 5;
atribuicaoComMultiplicacao *= 6;
console.log("atribuição com multiplicação: " + atribuicaoComMultiplicacao);


var atribuicaoComDivisao = 15;
atribuicaoComDivisao /= 5;
console.log("atribuição com divisao: " + atribuicaoComDivisao);


var a = 4;
var b = 3;

var adicaoPosterior = a + b++;
console.log("Adição Posterior: " + adicaoPosterior);

var adicaoAnterior = a + ++b;
console.log("Adição Anterior: " + adicaoAnterior);


var c = 5;
var d = 6;

var subtracaoPosterior = c + d--;
console.log("Subtração Posterior: " + subtracaoPosterior);

var subtracaoAnterior = c + --d;
console.log("Subtração Anterior: " + subtracaoAnterior);