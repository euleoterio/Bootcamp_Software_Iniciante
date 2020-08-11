console.log(process.argv);

var num = parseInt(process.argv[2]);
var qtdDividido = 1;
var result = [];

for(var dividendo = 2; dividendo <= num; dividendo++){
  for(var divisor = 2; divisor <= dividendo; divisor++){
    if(dividendo % divisor == 0)
      qtdDividido++; 
  }
  if(qtdDividido == 2)
      result.push(dividendo)

  qtdDividido = 1;
}

console.log(result);

var somaPrimos = 0;

for(var soma of result)
  somaPrimos += soma;

console.log(somaPrimos);