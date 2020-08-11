console.log("Hello world no arquivo externo!");

document.write("Anyaway");

//DOM - Document Object Model
function clickButton() {
  //document.getElementById("changeText").innerHTML = "Texto alterado com sucesso";
  document.getElementById("changeText").style.display = "none";
}

function clickButton2() {
  document.getElementById("changeText").style.display = "block";
  document.getElementById("changeText").innerHTML = "Texto alterado com sucesso";
}

function conheceTheo() {
  document.getElementById("Theo").src = "sou_Theo.jpeg"
  
}

function souTheo() {
  document.getElementById("Theo").src = "conhece_Theo.jpeg"
  
}

var quantidadeElementos = 0;

function addElementos() {
  var elemento = document.createElement("P");
  elemento.innerHTML = "elemento " + quantidadeElementos;

  quantidadeElementos++;

  document.getElementById("div_elementos").appendChild(elemento);
}

function removeElementos() {
  var filhos = document.getElementById("div_elementos").childNodes;
  var size = filhos.length;

  for(var i = 0; i < size; i++){
    document.getElementById("div_elementos").removeChild(filhos[0]);
  }
}