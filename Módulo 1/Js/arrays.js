var carros = ["Gol", "Palio", "Uno"];

for (var i = 0; i < carros.length; i++)
  console.log (i + 1 + " posicão: " + carros[i] );

carros[2] = "Argo"

for (var i = 0; i < carros.length; i++)
  console.log (i + 1 + " posicão: " + carros[i] );

console.log("Tamanho do array: " + carros.length);
console.log("Última posição: " + carros[carros.length-1]);

carros[carros.length] = "Sandero";
carros[carros.length] = "Honda Fit";

for (var i = 0; i < carros.length; i++)
  console.log (i + 1 + " posicão: " + carros[i] );


carros.push("Polo");
console.log(carros);
for (var i = 0; i < carros.length; i++)
  console.log (i + 1 + " posicão: " + carros[i] );

carros.push(123);
console.log(carros);