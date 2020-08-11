/* Exercise 1 of project Euler
 https://projecteuler.net/problem=1

 If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23
 Find the sum of all the multiples of 3 or 5 below 1000.
*/


var multiplos = [];
var sum = 0;

for(var i = 3; i < 10000; i ++) {
  if ((i % 3 === 0) || (i % 5 === 0))
    multiplos.push(i);
}

for(var num of multiplos){
  sum += num;
}

console.log("Soma: " + sum);