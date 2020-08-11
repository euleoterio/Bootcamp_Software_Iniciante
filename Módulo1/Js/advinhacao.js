var readline = require("readline");
var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
}); 
 
var numeroAleatorio = Math.round(Math.random() * 100);

if(numeroAleatorio === 0)
  numeroAleatorio = 1;

var numeroTentativas = 10;

pergunta();


function pergunta(){
  rl.question("Digite um número: ", function(numero){
    numero = parseInt(numero);
    numeroTentativas--;
  
    if(numero === numeroAleatorio){
      console.log("Parabéns, você acertou o número!");
      rl.close();
    } else if(numeroTentativas === 0){
        console.log("Que pena, você não descobriu o número em 10 tentativas");
        rl.close();
      } else if (numero > numeroAleatorio){
          console.log("Número errado, você ainda tem " + numeroTentativas + " tentativas." +
                        "O número informado é maior que o sorteado.");
          pergunta();
      } else {
        console.log("Número errado, você ainda tem " + numeroTentativas + " tentativas." +
                        "O número informado é menor que o sorteado.");
        pergunta();
      }
    
  
  });
}