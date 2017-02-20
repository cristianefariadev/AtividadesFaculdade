//exercicio 1
function CalcularMedia() {
    var n1 = parseFloat(document.getElementById("n1").value);
    var n2 = parseFloat(document.getElementById("n2").value);
    var n3 = parseFloat(document.getElementById("n3").value);
    var media = parseFloat((n1 + n2 + n3) / 3).toFixed(2)

    var resultado = media >= 6 ? ("Média: " + media + " - Resultado - APROVADO") : ("Média: " + media + " - Resultado - REPROVADO");

    alert(resultado);

    return false;
}

//exercicio 2
function VerificaSeDivisivel() {
    var n = document.getElementById("n").value;

    if ((n % 3 == 0) && (n % 5 == 0)) {
        alert("Número : " + n + " é divisível por 3 e 5");
    } else {
        alert(n + " não é divisível");
    }
    return false;
}

//exercicio 3
function VerificaMaior() {
    var num1 = document.getElementById("num1").value;
    var num2 = document.getElementById("num2").value;
    var num3 = document.getElementById("num3").value;

    alert("O maior número : " + Math.max(num1, num2, num3));

    return false;
}

//exercicio 4
function VerificaMes() {
    var mes = document.getElementById("mes").value;

    if ((mes == "janeiro") || (mes == "março") || (mes == "maio") || (mes == "julho") || (mes == "agosto") || (mes == "outubro") || (mes == "dezembro")) {
        alert("Possui 31 dias");
    } else if ((mes == "abril") || (mes == "junho") || (mes == "setembro") || (mes == "novembro")) {
        alert("Possui 30 dias");
    } else if (mes == "fevereiro") {
        alert("Possui 28 dias");
    } else {
        alert("Mês inválido, digite novamente!");
    }
    return false;
}

//exercicio 5
function ImprimiImpar() {
    var nImpar = document.getElementById("nImpar").value;
    for (var i = 0; i <= nImpar; i++) {
        if (i % 2 != 0) {
           document.writeln(i);
        }
    }
    return false;
}

//exercicio 6
function Tabuada(){
    var nTabuada = document.getElementById("nTabuada").value;
    for (var i = 1; i < 11; i++) {
        document.writeln(i + " x " + nTabuada + " = " + i*nTabuada + "<br>");
    }
   return false;
}

//exercicio 7
function VerificaPerfeito(){
for (var i = 0; i < 10; i++) {
    var element = array[i];
    
}
    return false;
}

//exercicio8
function nValoresImpares(){
    var nImpar1 = document.getElementById("nImpar1").value;
    var nImpar2 = document.getElementById("nImpar2").value;
    for (var i = nImpar1; i <= nImpar2; i++) {
        if (i % 2 != 0) {
           document.writeln(i);
        }
    }
    return false;
}