# -*- coding: utf-8 -*-
"""Capitulo4.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1MlpaKD7SP5VoVDEy2Mp3yjmFrRa5JGbL
"""

def somar(num1,num2):
  return num1 + num2

print(somar(1,2))
print(somar(3,2))



def buscar_informacao(informacao):
  return input("Digite {}".format(informacao))

nome = buscar_informacao("nome: ")

print(nome)

#Digitar item da compra e quantidade
#Verificar o valor total
#Quando encerrar, dar valor total da compra

#funções auxiliares
def ler_quantidade():
  informacao = input("Qual a quantidade consumida? ")
  while (not informacao.isdigit()):
    informacao = input("A quantidade consumida deve ser em um número. \nDigite novamente: ")
  
  return int(informacao)

def ler_item(produtos):
  nome = input("Qual o identificador do item da compra? (Ou digite ENTER para terminar) ")
  indice = -1
  if (nome == ""):
    return -1

# enumerate faz com que cada produto retorne(indice, item)
  for i, item in enumerate(produtos):
    # o IN verificar se esta dentro/ se existe em produto
    if (nome.upper() in item.upper()):
      indice = i
      break
  
  return indice

def processar_compra(itens_comprados):
  item_compra = ler_item(produtos)
  if (item_compra == -1):
    return -1, 0

  itens_comprados.append(produtos[item_compra])
  quantidade = ler_quantidade()
  return item_compra, quantidade


#programa principal
produtos = ['Hamburguer', 'Batata fritas', 'Combo', 'Refrigerante']
precos = [15, 10.5, 20, 5]
itens_comprados = []
valor_total = 0

item_compra, quantidade = processar_compra(itens_comprados)

while item_compra != -1:
  valor_total += (precos[item_compra] * quantidade)
  item_compra, quantidade = processar_compra(itens_comprados)

print("*** Relatório final das compras ***")
for item in itens_comprados:
  print("Comprado: {}".format(item))
print("*******************************")
print("Total da compra {}".format(valor_total))