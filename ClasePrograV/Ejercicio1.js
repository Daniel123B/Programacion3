/*function esPar(Numero){
    if (Numero % 2 == 0){
        return "Es par"
    }
    return "Es impar"
}

console.log(esPar(2));
console.log(esPar(7));

//Factorial
function factorial(n){
    let resultado = 1;
    for (let i = 1; i <= n; i++){
        resultado = resultado * i;
    }
    return resultado;
}
console.log(factorial(5)); */

function fibonacci(n){
    let a = 0, b = 1;
    let arreglo  = [];

    for (let i = 0; i < n; i++){
        arreglo.push(a);
        let temp = a + b;
        a = b;
        b = temp;
    }
    return arreglo;
}
console.log(fibonacci(6));