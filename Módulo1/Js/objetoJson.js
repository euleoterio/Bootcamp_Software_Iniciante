var pessoa = {
  nome: "Vinicius",
  idade: 24,
  telefone: "(51) 98289-5068",
  temCarro: true,
  animaisDeEstimacao: [
    "Bella",
    "Speed"
  ],
  linguas: {
    nativa: "Português",
    outras: "Ingl˜es"
  }
}

console.log(pessoa);

console.log(pessoa.nome);

console.log(pessoa.linguas.nativa);

pessoa.animaisDeEstimacao.push("Lola");
console.log(pessoa.animaisDeEstimacao);

pessoa.nome += " Euleoterio";
console.log(pessoa);

salvarDadosPessoa(pessoa);

function salvarDadosPessoa(pessoa) {
  console.log(pessoa.nome);
}

pessoa.cor = "Branco";
console.log(pessoa);


console.log(JSON.stringify(pessoa));