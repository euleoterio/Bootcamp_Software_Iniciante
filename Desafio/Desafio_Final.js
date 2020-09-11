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
                  cadastrarFuncionario();
                 break;
               case 2:
                  imprimirContracheque();
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


function imprimirContracheque() {
  read.question("Digite o indice do funcionário que deseja imprimir: ", index =>{
    indice = parseInt(index);

    inss = 0;
    irrf = 0;

    fs.readFile(fileName, (err,data) => {
      if(err)
        console.log(err);
      else{
        obj = JSON.parse(data);
        employeeName = obj.employees[index].name;
        employeeSalary = obj.employees[index].salary;

        inss += (1045 * 0.075);

        if(employeeSalary >= 1045.01)
          if (employeeSalary <= 2089.60)
            inss += (employeeSalary - 1045.01) * 0.09;
          else
            inss += (2089.6 - 1045.01) * 0.09;

        if(employeeSalary >= 2089.60)
          if(employeeSalary <= 3134.40)
            inss += (employeeSalary - 2089.61) * 0.12;
          else
            inss += (3134.40 - 2089.61) * 0.12;

        if(employeeSalary >= 3134.41)
          if (employeeSalary <= 6101.06)
            inss += (employeeSalary - 3134.41) * 0.14;
          else
            inss += (6101.06 - 3134.41) * 0.14;

        if(employeeSalary > 6101.06)
          inss += 713.1;


        aux = employeeSalary - inss;

        if(aux <= 1903.98)
          irrf = 0;
        else if(aux <= 2826.65)
          irrf = (aux * 0.075) - 142.8;
        else if(aux <= 3751.05)
          irrf = (aux * 0.15) - 354.8;
        else if(aux <= 4664.68)
          irrf = (aux * 0.225) - 636.13;
        else if(aux > 4664.68)
          irrf = (aux * 0.275) - 869.36;


        console.log("Funcionário: " + employeeName 
                    + "\nSalário bruto: R$" + employeeSalary
                    + "\nDesconto INSS: R$" + inss
                    + "\nDesconto IRRF: R$" + irrf
                    + "\nSalário líquido: R$" + (employeeSalary-inss-irrf));

      }
    })
  })
}