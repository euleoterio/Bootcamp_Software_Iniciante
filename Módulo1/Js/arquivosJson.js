var fs = require("fs");
var nomeArquivo = "carros.json"

var carros = ["Gol", "Palio", "Uno", "Sandero"];

var concessionaria = {
    nome: "Concessionaria XYZ",
    carros
}


//JSON.stringify - obj json para string
//JSON.parse - string para obj json

fs.writeFile(nomeArquivo, JSON.stringify(concessionaria), function(err){
  if(err)
    console.log(err);
  else
    fs.readFile(nomeArquivo,"utf-8", function(err,data){
      if(err)
        console.log(err);
      else{
        var obj = JSON.parse(data)
        obj.carros.push("HRV");
        fs.writeFile(nomeArquivo, JSON.stringify(obj), function(err,){
          if(err)
          console.log(err);
        });
      }
    });
});