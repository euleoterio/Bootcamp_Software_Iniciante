var fs = require('fs');
var file = "funcionarios.json";

fs.readFile(file,"utf-8", function(err, data) {
  if(err)
    console.log(err)
  else{
    var obj = JSON.parse(data);
    
    callFunctions(obj);
    
  }
});

function callFunctions(obj){
  var funcionarios = obj.funcionarios;
  var count = Object.keys(funcionarios).length

  highestSalary(funcionarios,count);
  lowestSalary(funcionarios,count);
  averageWage(funcionarios,count);

  var sector = "Comercial";
  highestSalarySector(funcionarios,count,sector);
  lowestSalarySector(funcionarios,count,sector);
  averageWageSector(funcionarios,count,sector);
}

function highestSalary(funcionarios, count) {
   var highestSalary = funcionarios[0].salario;

  for(var i = 0; i < count; i++){
    if(highestSalary < funcionarios[i].salario){
      highestSalary = funcionarios[i].salario;
      var funcionario = funcionarios[i].nome;
    }
  }
   console.log(funcionario);
}

function lowestSalary(funcionarios, count) {
  var lowestSalary = funcionarios[0].salario;;

  for(var i = 0; i < count; i++){
    if(lowestSalary > funcionarios[i].salario){
      lowestSalary = funcionarios[i].salario;
      var funcionario = funcionarios[i].nome;
    }
  }
   console.log(funcionario);
}

function averageWage(funcionarios, count) {
  var average = 0;

  for(var i = 0; i < count; i++)
    average += funcionarios[i].salario;
  
   console.log(average/count);
}

function highestSalarySector(funcionarios, count, sector) {
  var i = 0;

  do{
    if(funcionarios[i].setor === sector){
      if(!highestSalary){
        var highestSalary = funcionarios[i].salario;
        var funcionario = funcionarios[i].nome;
      }else if(highestSalary < funcionarios[i].salario){
        highestSalary = funcionarios[i].salario;
        funcionario = funcionarios[i].nome;
      }
    }
    i++;
  }while(i<count)

  console.log(funcionario);
}

function lowestSalarySector(funcionarios, count, sector) {
  var i = 0;

  do{
    if(funcionarios[i].setor === sector){
      if(!lowestSalary){
        var lowestSalary = funcionarios[i].salario;
        var funcionario = funcionarios[i].nome;
      }else if(lowestSalary >funcionarios[i].salario){
        lowestSalary = funcionarios[i].salario;
        funcionario = funcionarios[i].nome;
      }
    }
    i++;
  }while(i<count)

  console.log(funcionario);
}

function averageWageSector(funcionarios, count, sector) {
  var i = 0;
  var average = 0;
  var countSector = 0;

  do{
    if(funcionarios[i].setor === sector){
      average += funcionarios[i].salario;
      countSector++;
    }
    i++;
  }while(i<count)


  console.log(average/countSector);
}