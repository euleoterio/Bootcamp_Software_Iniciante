var fs = require("fs")
var fileName = "employees.json";

var readline = require('readline');
var read = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

menu();

function menu(){
  read.question("Escolha uma das opções abaixo:\n\n"
                 +" 1) Cadastrar funcionário.\n"
                 +" 2) Imprimir contracheque.\n"
                 +" 3) Sair.\n\n", option =>{
    
             option = parseInt(option);
            
             switch (option) {
               case 1:
                  cadastrarFuncionario()
                 break;
               case 2:
                  console.log("Imprimir");
                 break;
              case 3:
                 console.log("Obrigado!");
                break;

               default:
                 console.log("Opção inválida")
                 menu()
                 break;
             }
  });
}

function cadastrarFuncionario() {
  read.question("Digite o nome do funcionário: ", employeeName =>{
    read.question("Informe o salário bruto do funcionário: ", employeeSalary =>{
      employeeSalary = parseInt(employeeSalary);

      var obj = {
        employees: []
      }

      //JSON.stringify - obj json para string
      //JSON.parse - string para obj json
      fs.exists(fileName, exists =>{
        if(exists){
          fs.readFile(fileName, (err,data) =>{
            if(err)
              console.log(err);
            else{
              obj = JSON.parse(data);
              obj.employees.push({name: employeeName,
                                  salary: employeeSalary});
              var json = JSON.stringify(obj);
              fs.writeFile(fileName, json, (err) =>{
                if(err)
                  console.log(err);
                });
            }    
          })
        } else {
          obj = {
            employees: [{
              name: employeeName,
              salary: employeeSalary
            }]
          }
          var json = JSON.stringify(obj);
          console.log(json);
          fs.writeFile(fileName, json, (err) =>{
            if(err)
              console.log(err);
          });
        }
      });
      console.log("\nFuncionário adicionado\n\n\n")
      menu();
    });
  });
  
}