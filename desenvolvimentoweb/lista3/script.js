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
function Tabuada() {
    var nTabuada = document.getElementById("nTabuada").value;
    for (var i = 1; i < 11; i++) {
        document.writeln(i + " x " + nTabuada + " = " + i * nTabuada + "<br>");
    }
    return false;
}

//exercicio 7
function VerificaPerfeito() {
    nPerfeito = document.getElementById("nPerfeito").value;
    divisores = 0;
    for (var i = 1; i < nPerfeito; i++) {
        if (nPerfeito % i == 0) {
            divisores += i;
        }
    }
    var resultado = nPerfeito == divisores ? "Numero perfeito" : "Número não é perfeito";
    alert(resultado);

}

//exercicio8
function nValoresImpares() {
    var nImpar1 = document.getElementById("nImpar1").value;
    var nImpar2 = document.getElementById("nImpar2").value;
    for (var i = nImpar1; i <= nImpar2; i++) {
        if (i % 2 != 0) {
            document.writeln(i);
        }
    }
    return false;
}

//exercicio9
function retornaImparouPar(num) {
    if (num.value.length > 0) {
        if (parseInt(num.value) % 2 == 0) {
            document.exe9.resultado.value = 0;
        } else {
            document.exe9.resultado.value = 1;

        }
    } else {
        document.exe9.resultado.value = "";
    }
}

//exercicio10
function desenhaCaractere(linha, caractere) {
    var linha = document.getElementById("linha").value;
    var caractere = document.getElementById("caractere").value;
    var resultado = '';

    for (var i = 1; i <= linha; i++) {
        resultado += '<br />' + caractere;

    }
    document.getElementById('result').innerHTML = resultado;
    return false;
}

//exercicio11
function anoBissexto() {
    var ano = document.getElementById("ano").value;

    if (validaQuantidadeDigitos(ano.value))
        return (new Date(ano, 1, 29).getMonth() == 1) ? 1 : 0;
    }




//exercicio12
function validaData() {
    var canpo = new Date(document.getElementById("data").value);

   if (campo!=""){

        erro=0;
        hoje = new Date();
        anoAtual = hoje.getFullYear();
        barras = campo.split("/");
        if (barras.length == 3)
        {
            dia = barras[0];
            mes = barras[1];
            ano = barras[2];

                resultado = (!isNaN(dia) && (dia > 0) && (dia < 32))
                 && (!isNaN(mes) && (mes > 0) && (mes < 13)) && (!isNaN(ano) && (ano.length == 4)
                  && (ano <= anoAtual && ano >= 1900));
                if (!resultado)
                {
                        alert("Data inválida.");
                        //campo.focus();
                        return false;
                }
         }
         else
         {
                 alert("Data inválida.");
                 //campo.focus();
                 return false;
         }
return true;
}
}
}

