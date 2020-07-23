var carros = ["Gol", "Palio", "Uno", "Sandero"];

console.log(carros);

var carro = carros.pop(); //remove ultimo elemento e retorna o elemento
console.log(carro);
console.log(carros);

console.log(carros.push("Honda Fit")); //acrescenta na ultima posicao, e retorna o tamanho novo do array
console.log(carros);

console.log(carros.shift()); //remove primeiro elemento e retorna o elemento
console.log(carros);

console.log(carros.unshift("Onix")); //acrescenta na primeira posicao, e retorna o tamanho novo do array
console.log(carros);

carros[2] = "Novo Uno"; //atualiza elemento do indice informado
console.log(carros);

delete carros[2]; //remove elemento do índice, deixando como undefined no lugar
console.log(carros);

carros[2] = "Uno";


carros.splice(2, 0, "HR-V", "Creta"); // splice( posicisao inicial, qtd elementos a ser removidos, (opcaional >)... elemento(s) a serem inseridos)
console.log(carros);

carros.splice(2, 1, "WR-V", "Jeep"); 
console.log(carros);


var carrosAntigos = [ "Brasília", "Monza", "Fusca"];
var carrosAntigos2 = [ "Corcel", "Chevet"];
var allCars = carros.concat(carrosAntigos,carrosAntigos2);
console.log(allCars);


console.log(allCars.slice(1)); //cria novo array sem alterar o original
console.log(allCars.slice(2,5)); // slice(posicao inicial, (opcaional) posicao final)