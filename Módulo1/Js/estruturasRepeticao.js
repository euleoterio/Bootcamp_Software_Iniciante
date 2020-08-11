for (var i = 0; i < 10; i++){
  //console.log(i)
}

var i = 0;
while(i < 10){
  // console.log(i);
  i++;
}

i = 0;
while(true){
  // console.log(i)
  if (i == 5)
    break;
  i++;
}


var j = 0;
do{
  j++
  // console.log(j)
} while (j < 10);


var carros = ["Gol", "Palio", "Uno", "Sandero", "Honda Fit"];
for( var carro of carros) {
    console.log(carro);
}