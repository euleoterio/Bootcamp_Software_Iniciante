var fs = require("fs");

fs.writeFile("meuArquivo.txt", "um texto qualquer", function(err){
  if(err !== null)
    console.log(err);
    else{
      console.log("Arquivo escrito com sucesso");

      fs.appendFile("meuArquivo.txt", "\nNova linha", function(err){
        if (err)
          console.log(err);
        else{
          fs.readFile("meuArquivo.txt", "utf-8", function(err,data){
            if (err)
              console.log(err);
            else 
              console.log(data);
          });
        }
      });      
    }
});