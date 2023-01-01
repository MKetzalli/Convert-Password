let x = 0;
document.addEventListener('DOMContentLoaded', function() {
  document.getElementById('buttonTransform').addEventListener('click', pandoraT, false);
 }, false)

 document.addEventListener('DOMContentLoaded', function() {
  document.getElementById('buttonUnTransform').addEventListener('click', pandora, false);
 }, false)

function pandoraT() {
  console.log("Se ejecuto pandoraT");
  //cuando se aprete el boton para transformar
  let textPreTransform = document.getElementById("TextPreTransform").value;
  let textTransform = document.getElementById("TextTransform");
  let mensaje, mensaje2, num, mensaje3, mensaje4, mensaje5;
  mensaje = SolicitarMensajeT(textPreTransform);
  mensaje = Letras1T(mensaje);
  mensaje = Letras2T(mensaje);
  mensaje = SepararNumT(mensaje);
  mensaje2 = ObtenerNumT(mensaje);
  num = NumT(mensaje2);
  mensaje3 = GirarT(num);

  mensaje4 = UnirT(mensaje, mensaje3); //une el arreglo con texto y el arreglo con numeros
  mensaje4 = Letras3T(mensaje4); //cambia el valor de los numeros
  mensaje5 = ImprimirT(mensaje4);
  textTransform.value = mensaje5;
}

function SolicitarMensajeT(cadena) {
  cadena = cadena.toLowerCase();
  let mensaje = new Array(cadena.length);
  mensaje = toCharArray(cadena);
  return mensaje;
}

function Letras1T(mensaje) {
  for (let i = 0; i < mensaje.length; i++) {
    switch (mensaje[i]) {
      case "a":
        mensaje[i] = "s";
        break;
      case "b":
        mensaje[i] = "c";
        break;
      case "c":
        mensaje[i] = "a";
        break;
      case "d":
        mensaje[i] = "k";
        break;
      case "e":
        mensaje[i] = "w";
        break;
      case "f":
        mensaje[i] = "r";
        break;
      case "g":
        mensaje[i] = "e";
        break;
      case "h":
        mensaje[i] = "x";
        break;
      case "i":
        mensaje[i] = "t";
        break;
      case "j":
        mensaje[i] = "y";
        break;
      case "k":
        mensaje[i] = "g";
        break;
      case "l":
        mensaje[i] = "n";
        break;
      case "m":
        mensaje[i] = "i";
        break;
      case "n":
        mensaje[i] = "d";
        break;
      case "o":
        mensaje[i] = "l";
        break;
      case "p":
        mensaje[i] = "z";
        break;
      case "q":
        mensaje[i] = "b";
        break;
      case "r":
        mensaje[i] = "q";
        break;
      case "s":
        mensaje[i] = "v";
        break;
      case "t":
        mensaje[i] = "u";
        break;
      case "u":
        mensaje[i] = "m";
        break;
      case "v":
        mensaje[i] = "o";
        break;
      case "w":
        mensaje[i] = "h";
        break;
      case "x":
        mensaje[i] = "f";
        break;
      case "y":
        mensaje[i] = "p";
        break;
      case "z":
        mensaje[i] = "j";
        break;
      case "0":
        mensaje[i] = "7";
        break;
      case "1":
        mensaje[i] = "9";
        break;
      case "2":
        mensaje[i] = "6";
        break;
      case "3":
        mensaje[i] = "5";
        break;
      case "4":
        mensaje[i] = "3";
        break;
      case "5":
        mensaje[i] = "1";
        break;
      case "6":
        mensaje[i] = "4";
        break;
      case "7":
        mensaje[i] = "0";
        break;
      case "8":
        mensaje[i] = "2";
        break;
      case "9":
        mensaje[i] = "8";
        break;
      default:
        console.log("");
        break;
    }
  }
  return mensaje;
}

function Letras2T(mensaje) {
  console.log("Se ejecuto Letras2T" + mensaje);
  let aumento = 0;
  for (let i = 0; i < mensaje.length; i++) {
    let ascii = mensaje[i].toUpperCase().charCodeAt(0);
    if (ascii > 64 && ascii < 91) {
      aumento++;
    }
  }
  aumento = aumento + mensaje.length;
  let mensaje2 = new Array(aumento);
  x = 0;
  for (let r = 0; r < mensaje.length; r++) {
    switch (mensaje[r]) {
      case "a":
        mensaje2[x] = "y";
        x++;
        mensaje2[x] = "1";
        x++;
        break;
      case "b":
        mensaje2[x] = "y";
        x++;
        mensaje2[x] = "2";
        x++;
        break;
      case "c":
        mensaje2[x] = "y";
        x++;
        mensaje2[x] = "3";
        x++;
        break;
      case "d":
        mensaje2[x] = "y";
        x++;
        mensaje2[x] = "4";
        x++;
        break;
      case "e":
        mensaje2[x] = "y";
        x++;
        mensaje2[x] = "5";
        x++;
        break;
      case "f":
        mensaje2[x] = "y";
        x++;
        mensaje2[x] = "6";
        x++;
        break;
      case "g":
        mensaje2[x] = "y";
        x++;
        mensaje2[x] = "7";
        x++;
        break;
      case "h":
        mensaje2[x] = "y";
        x++;
        mensaje2[x] = "8";
        x++;
        break;
      case "i":
        mensaje2[x] = "y";
        x++;
        mensaje2[x] = "9";
        x++;
        break;
      case "j":
        mensaje2[x] = "d";
        x++;
        mensaje2[x] = "0";
        x++;
        break;
      case "k":
        mensaje2[x] = "d";
        x++;
        mensaje2[x] = "1";
        x++;
        break;
      case "l":
        mensaje2[x] = "d";
        x++;
        mensaje2[x] = "2";
        x++;
        break;
      case "m":
        mensaje2[x] = "d";
        x++;
        mensaje2[x] = "3";
        x++;
        break;
      case "n":
        mensaje2[x] = "d";
        x++;
        mensaje2[x] = "4";
        x++;
        break;
      case "o":
        mensaje2[x] = "d";
        x++;
        mensaje2[x] = "5";
        x++;
        break;
      case "p":
        mensaje2[x] = "d";
        x++;
        mensaje2[x] = "6";
        x++;
        break;
      case "q":
        mensaje2[x] = "d";
        x++;
        mensaje2[x] = "7";
        x++;
        break;
      case "r":
        mensaje2[x] = "d";
        x++;
        mensaje2[x] = "8";
        x++;
        break;
      case "s":
        mensaje2[x] = "d";
        x++;
        mensaje2[x] = "9";
        x++;
        break;
      case "t":
        mensaje2[x] = "v";
        x++;
        mensaje2[x] = "0";
        x++;
        break;
      case "u":
        mensaje2[x] = "v";
        x++;
        mensaje2[x] = "1";
        x++;
        break;
      case "v":
        mensaje2[x] = "v";
        x++;
        mensaje2[x] = "2";
        x++;
        break;
      case "w":
        mensaje2[x] = "v";
        x++;
        mensaje2[x] = "3";
        x++;
        break;
      case "x":
        mensaje2[x] = "v";
        x++;
        mensaje2[x] = "4";
        x++;
        break;
      case "y":
        mensaje2[x] = "v";
        x++;
        mensaje2[x] = "5";
        x++;
        break;
      case "z":
        mensaje2[x] = "v";
        x++;
        mensaje2[x] = "6";
        x++;
        break;
      case "0":
        mensaje2[x] = "u";
        x++;
        break;
      case "1":
        mensaje2[x] = "t";
        x++;
        break;
      case "2":
        mensaje2[x] = "r";
        x++;
        break;
      case "3":
        mensaje2[x] = "c";
        x++;
        break;
      case "4":
        mensaje2[x] = "f";
        x++;
        break;
      case "5":
        mensaje2[x] = "s";
        x++;
        break;
      case "6":
        mensaje2[x] = "e";
        x++;
        break;
      case "7":
        mensaje2[x] = "o";
        x++;
        break;
      case "8":
        mensaje2[x] = "n";
        x++;
        break;
      case "9":
        mensaje2[x] = "z";
        x++;
        break;
      case " ":
        mensaje2[x] = "x";
        x++;
        break;
      default:
        let signo = mensaje[r];
        mensaje2[x] = signo;
        x++;
        break;
    }
  }
  return mensaje2;
}

function SepararNumT(mensaje) {
  console.log("Se ejecuto SepararNumT " + mensaje);
  let mensaje2 = new Array(mensaje.length);
  x = 0;

  for (let i = 0; i < mensaje.length; i++) {
    switch (mensaje[i]) {
      case "a":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "b":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "c":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "d":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "e":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "f":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "g":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "h":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "i":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "j":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "k":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "l":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "m":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "n":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "o":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "p":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "q":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "r":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "s":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "t":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "u":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "v":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "w":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "x":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "y":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "z":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      default:
        console.log("");
        break;
    }
  }
  for (let i = 0; i < mensaje.length; i++) {
    switch (mensaje[i]) {
      case "0":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "1":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "2":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "3":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "4":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "5":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "6":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "7":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "8":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "9":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      default:
        console.log("");
        break;
    }
  }
  return mensaje2;
}

function ObtenerNumT(mensaje) {
  x = 0;
  for (let y = 0; y < mensaje.length; y++) {
    if (
      mensaje[y] == "0" ||
      mensaje[y] == "1" ||
      mensaje[y] == "2" ||
      mensaje[y] == "3" ||
      mensaje[y] == "4" ||
      mensaje[y] == "5" ||
      mensaje[y] == "6" ||
      mensaje[y] == "7" ||
      mensaje[y] == "8" ||
      mensaje[y] == "9"
    ) {
      x++;
    }
  }
  let mensaje2 = new Array(x);
  x = 0;
  for (let i = 0; i < mensaje.length; i++) {
    switch (mensaje[i]) {
      case "0":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "1":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "2":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "3":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "4":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "5":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "6":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "7":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "8":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "9":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      default: //no imprime nada
        console.log("");
        break;
    }
  }
  return mensaje2; //retorna el arreglo
}

function NumT(mensaje) {
  console.log("Se ejecuto num " + mensaje);
  let numeros = mensaje.join(""); //se convierte el arreglo en una cadena
  console.log("valor de numeros " + numeros);
  let numero = parseFloat(numeros); //se convierte la cadena en un entero largo
  console.log("valor de numero " + numero);
  let multi = numero * 13; //se multiplica el entero por 13 (pensado al azar)
  console.log("valor de multi " + multi);
  let suma = multi + 84; //se suma el numero obtenido en la multiplicacion mas 84 (pensado al azar)
  console.log("valor de suma " + suma);
  return suma; //se retorna el valor de la suma anterior
}

function GirarT(suma) {
  console.log("Se ejecuto GirarT" + suma);
  let n;
  let numeros = suma.toString();
  let mensaje1 = new Array(numeros.length);
  mensaje1 = toCharArray(numeros);
  let mensaje2 = new Array(numeros.length);
  n = mensaje1.length;
  for (let i = 0; i < mensaje1.length; i++) {
    n--;
    mensaje2[i] = mensaje1[n];
  }
  return mensaje2;
}

function UnirT(mensaje1, mensaje2) {
  console.log("Se ejecuto UnirT" + mensaje1 + " " + mensaje2);
  x = mensaje1.length;
  for (let y = 0; y < mensaje1.length; y++) {
    //se recorre la totalidad del arreglo
    if (
      mensaje1[y] == "0" ||
      mensaje1[y] == "1" ||
      mensaje1[y] == "2" ||
      mensaje1[y] == "3" ||
      mensaje1[y] == "4" ||
      mensaje1[y] == "5" ||
      mensaje1[y] == "6" ||
      mensaje1[y] == "7" ||
      mensaje1[y] == "8" ||
      mensaje1[y] == "9"
    ) {
      //si el arreglo tiene un numero entonces x aumenta
      x--; //x es igual a x mas 1
    }
  }
  let tam1 = x; //tam1 es igual a x que equivale al espacio con letras
  let tam2 = tam1 + mensaje2.length; //tam2 es igual al espacio con letras mas la longitud del arreglo con los numeros invertidos
  let mensaje3 = new Array(tam2); //arreglo que tendra letras y numeros, por lo tanto tiene la longitud de tam2
  x = 0; //x es igual a 0
  for (let i = 0; i < tam1; i++) {
    //se recorre solo la parte con letras del arreglo1
    x++; //x es igual a x mas 1
    mensaje3[i] = mensaje1[i]; //se asignan las letras del arreglo1 en el arreglo que contendra letras y numeros
  }
  let u = mensaje3.length - x; //u es igual al tamaño del arreglo con letras y numeros menos el valor de x
  for (let i = 0; i < u; i++) {
    //se recorre el arreglo a partir de donde termina la parte con letras
    mensaje3[x] = mensaje2[i]; //se asignan los numeros del arreglo2 en el arreglo que contiene letras y numeros
    x++; //x es igual a x mas 1
  }
  return mensaje3; //retorna arreglo con letras y numeros
}

function Letras3T(mensaje) {
  console.log("Se ejecuto Letras3T" + mensaje);
  for (let i = 0; i < mensaje.length; i++) {
    switch (mensaje[i]) {
      case "0":
        mensaje[i] = "9";
        break;
      case "1":
        mensaje[i] = "2";
        break;
      case "2":
        mensaje[i] = "8";
        break;
      case "3":
        mensaje[i] = "4";
        break;
      case "4":
        mensaje[i] = "3";
        break;
      case "5":
        mensaje[i] = "0";
        break;
      case "6":
        mensaje[i] = "7";
        break;
      case "7":
        mensaje[i] = "6";
        break;
      case "8":
        mensaje[i] = "1";
        break;
      case "9":
        mensaje[i] = "5";
        break;
      default: //no muestra nada
        console.log("");
        break;
    }
  }
  return mensaje; //retorna arreglo
}

function ImprimirT(mensaje) {
  let mensaje1 = mensaje.join("");
  return mensaje1;
}

function toCharArray(str) {
  charArray = [];
  for (var i = 0; i < str.length; i++) {
    charArray.push(str[i]);
  }

  return charArray;
}
//~~~~~~~~~~~~~~~~~~~~~~~
function SolicitarMensaje(cadena) {
  cadena = cadena.toLowerCase();
  let mensaje = new Array(cadena.length);
  mensaje = toCharArray(cadena);
  return mensaje;
}

function Imprimir(mensaje) {
  let mensaje1 = mensaje.join("");
  return mensaje1;
}

function Letras1(mensaje) {
  for (let i = 0; i < mensaje.length; i++) {
    switch (mensaje[i]) {
      case "0":
        mensaje[i] = "5";
        break;
      case "1":
        mensaje[i] = "8";
        break;
      case "2":
        mensaje[i] = "1";
        break;
      case "3":
        mensaje[i] = "4";
        break;
      case "4":
        mensaje[i] = "3";
        break;
      case "5":
        mensaje[i] = "9";
        break;
      case "6":
        mensaje[i] = "7";
        break;
      case "7":
        mensaje[i] = "6";
        break;
      case "8":
        mensaje[i] = "2";
        break;
      case "9":
        mensaje[i] = "0";
        break;
      default: //no muestra nada
        console.log("");
        break;
    }
  }
  return mensaje; //retorna arreglo
}

function ObtenerNum(mensaje) {
  x = 0;
  for (let y = 0; y < mensaje.length; y++) {
    if (
      mensaje[y] == "0" ||
      mensaje[y] == "1" ||
      mensaje[y] == "2" ||
      mensaje[y] == "3" ||
      mensaje[y] == "4" ||
      mensaje[y] == "5" ||
      mensaje[y] == "6" ||
      mensaje[y] == "7" ||
      mensaje[y] == "8" ||
      mensaje[y] == "9"
    ) {
      x++;
    }
  }
  let mensaje2 = new Array(x);
  x = 0;
  for (let i = 0; i < mensaje.length; i++) {
    switch (mensaje[i]) {
      case "0":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "1":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "2":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "3":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "4":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "5":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "6":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "7":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "8":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      case "9":
        mensaje2[x] = mensaje[i];
        x++;
        break;
      default: //no imprime nada
        console.log("");
        break;
    }
  }
  return mensaje2; //retorna el arreglo
}

//filtro 3: metodo que invierte el orden de los numeros en el arreglo recibido, retorna un arreglo
function Girar(mensaje) {
  let n;
  let mensaje1 = new Array(mensaje.length);
  n = mensaje.length;
  for (let i = 0; i < mensaje1.length; i++) {
    n--;
    mensaje1[i] = mensaje[n];
  }
  return mensaje1;
}

function Num(mensaje) {
  let numeros = mensaje.join(""); //tenia string.valueof
  let numero = parseFloat(numeros);
  let resta = numero - 84;
  let div = resta / 13;
  numeros = div.toString(); //tenia long.tostring(div)
  let mensaje1 = new Array(numeros.length);
  mensaje1 = toCharArray(numeros);
  return mensaje1;
}

function Unir(mensaje1, mensaje2) {
  for (let i = 0; i < mensaje1.length; i++) {
    if (
      mensaje1[i] == "a" ||
      mensaje1[i] == "b" ||
      mensaje1[i] == "c" ||
      mensaje1[i] == "d" ||
      mensaje1[i] == "e" ||
      mensaje1[i] == "f" ||
      mensaje1[i] == "g" ||
      mensaje1[i] == "h" ||
      mensaje1[i] == "i" ||
      mensaje1[i] == "j" ||
      mensaje1[i] == "k" ||
      mensaje1[i] == "l" ||
      mensaje1[i] == "m" ||
      mensaje1[i] == "n" ||
      mensaje1[i] == "o" ||
      mensaje1[i] == "p" ||
      mensaje1[i] == "q" ||
      mensaje1[i] == "r" ||
      mensaje1[i] == "s" ||
      mensaje1[i] == "t" ||
      mensaje1[i] == "u" ||
      mensaje1[i] == "v" ||
      mensaje1[i] == "w" ||
      mensaje1[i] == "x" ||
      mensaje1[i] == "y" ||
      mensaje1[i] == "z"
    ) {
      x++;
    }
  }
  let tam1 = x;
  let tam2 = tam1 + mensaje2.length;
  let mensaje3 = new Array(tam2);
  let LocMen1 = 0,
    LocMen2 = 0,
    LocMen3 = 0;

  for (let i = 0; i < tam1; i++) {
    if (
      mensaje1[LocMen1] == "y" ||
      mensaje1[LocMen1] == "d" ||
      mensaje1[LocMen1] == "v"
    ) {
      mensaje3[LocMen3] = mensaje1[LocMen1];
      LocMen3++;
      mensaje3[LocMen3] = mensaje2[LocMen2];
      LocMen1++;
      LocMen2++;
      LocMen3++;
    }
    if (
      mensaje1[LocMen1] == "x" ||
      mensaje1[LocMen1] == "u" ||
      mensaje1[LocMen1] == "t" ||
      mensaje1[LocMen1] == "r" ||
      mensaje1[LocMen1] == "c" ||
      mensaje1[LocMen1] == "f" ||
      mensaje1[LocMen1] == "s" ||
      mensaje1[LocMen1] == "e" ||
      mensaje1[LocMen1] == "o" ||
      mensaje1[LocMen1] == "n" ||
      mensaje1[LocMen1] == "z"
    ) {
      mensaje3[LocMen3] = mensaje1[LocMen1];
      LocMen3++;
      LocMen1++;
    }
  }
  return mensaje3;
}

function Letras2(mensaje) {
  let mensaje2 = new Array(mensaje.length);
  let LocMen2 = 0;
  for (let i = 0; i < mensaje.length; i++) {
    switch (mensaje[i]) {
      case "y":
        i++;
        switch (mensaje[i]) {
          case "1":
            mensaje2[LocMen2] = "a";
            LocMen2++;
            break;
          case "2":
            mensaje2[LocMen2] = "b";
            LocMen2++;
            break;
          case "3":
            mensaje2[LocMen2] = "c";
            LocMen2++;
            break;
          case "4":
            mensaje2[LocMen2] = "d";
            LocMen2++;
            break;
          case "5":
            mensaje2[LocMen2] = "e";
            LocMen2++;
            break;
          case "6":
            mensaje2[LocMen2] = "f";
            LocMen2++;
            break;
          case "7":
            mensaje2[LocMen2] = "g";
            LocMen2++;
            break;
          case "8":
            mensaje2[LocMen2] = "h";
            LocMen2++;
            break;
          case "9":
            mensaje2[LocMen2] = "i";
            LocMen2++;
            break;
        }
        break;
      case "d":
        i++;
        switch (mensaje[i]) {
          case "0":
            mensaje2[LocMen2] = "j";
            LocMen2++;
            break;
          case "1":
            mensaje2[LocMen2] = "k";
            LocMen2++;
            break;
          case "2":
            mensaje2[LocMen2] = "l";
            LocMen2++;
            break;
          case "3":
            mensaje2[LocMen2] = "m";
            LocMen2++;
            break;
          case "4":
            mensaje2[LocMen2] = "n";
            LocMen2++;
            break;
          case "5":
            mensaje2[LocMen2] = "o";
            LocMen2++;
            break;
          case "6":
            mensaje2[LocMen2] = "p";
            LocMen2++;
            break;
          case "7":
            mensaje2[LocMen2] = "q";
            LocMen2++;
            break;
          case "8":
            mensaje2[LocMen2] = "r";
            LocMen2++;
            break;
          case "9":
            mensaje2[LocMen2] = "s";
            LocMen2++;
            break;
        }
        break;
      case "v":
        i++;
        switch (mensaje[i]) {
          case "0":
            mensaje2[LocMen2] = "t";
            LocMen2++;
            break;
          case "1":
            mensaje2[LocMen2] = "u";
            LocMen2++;
            break;
          case "2":
            mensaje2[LocMen2] = "v";
            LocMen2++;
            break;
          case "3":
            mensaje2[LocMen2] = "w";
            LocMen2++;
            break;
          case "4":
            mensaje2[LocMen2] = "x";
            LocMen2++;
            break;
          case "5":
            mensaje2[LocMen2] = "y";
            LocMen2++;
            break;
          case "6":
            mensaje2[LocMen2] = "z";
            LocMen2++;
            break;
        }
        break;
      case "x":
        mensaje2[LocMen2] = " ";
        LocMen2++;
        break;
      case "u":
        mensaje2[LocMen2] = "0";
        LocMen2++;
        break;
      case "t":
        mensaje2[LocMen2] = "1";
        LocMen2++;
        break;
      case "r":
        mensaje2[LocMen2] = "2";
        LocMen2++;
        break;
      case "c":
        mensaje2[LocMen2] = "3";
        LocMen2++;
        break;
      case "f":
        mensaje2[LocMen2] = "4";
        LocMen2++;
        break;
      case "s":
        mensaje2[LocMen2] = "5";
        LocMen2++;
        break;
      case "e":
        mensaje2[LocMen2] = "6";
        LocMen2++;
        break;
      case "o":
        mensaje2[LocMen2] = "7";
        LocMen2++;
        break;
      case "n":
        mensaje2[LocMen2] = "8";
        LocMen2++;
        break;
      case "z":
        mensaje2[LocMen2] = "9";
        LocMen2++;
        break;

      default:
        console.log("");
        break;
    }
  }
  return mensaje2; //retornar arreglo
}

function Letras3(mensaje) {
  x = 0;
  for (let i = 0; i < mensaje.length; i++) {
    switch (mensaje[i]) {
      case "a":
        mensaje[i] = "c";
        x++;
        break;
      case "b":
        mensaje[i] = "q";
        x++;
        break;
      case "c":
        mensaje[i] = "b";
        x++;
        break;
      case "d":
        mensaje[i] = "n";
        x++;
        break;
      case "e":
        mensaje[i] = "g";
        x++;
        break;
      case "f":
        mensaje[i] = "x";
        x++;
        break;
      case "g":
        mensaje[i] = "k";
        x++;
        break;
      case "h":
        mensaje[i] = "w";
        x++;
        break;
      case "i":
        mensaje[i] = "m";
        x++;
        break;
      case "j":
        mensaje[i] = "z";
        x++;
        break;
      case "k":
        mensaje[i] = "d";
        x++;
        break;
      case "l":
        mensaje[i] = "o";
        x++;
        break;
      case "m":
        mensaje[i] = "u";
        x++;
        break;
      case "n":
        mensaje[i] = "l";
        x++;
        break;
      case "o":
        mensaje[i] = "v";
        x++;
        break;
      case "p":
        mensaje[i] = "y";
        x++;
        break;
      case "q":
        mensaje[i] = "r";
        x++;
        break;
      case "r":
        mensaje[i] = "f";
        x++;
        break;
      case "s":
        mensaje[i] = "a";
        x++;
        break;
      case "t":
        mensaje[i] = "i";
        x++;
        break;
      case "u":
        mensaje[i] = "t";
        x++;
        break;
      case "v":
        mensaje[i] = "s";
        x++;
        break;
      case "w":
        mensaje[i] = "e";
        x++;
        break;
      case "x":
        mensaje[i] = "h";
        x++;
        break;
      case "y":
        mensaje[i] = "j";
        x++;
        break;
      case "z":
        mensaje[i] = "p";
        x++;
        break;
      case "0":
        mensaje[i] = "7";
        x++;
        break;
      case "1":
        mensaje[i] = "5";
        x++;
        break;
      case "2":
        mensaje[i] = "8";
        x++;
        break;
      case "3":
        mensaje[i] = "4";
        x++;
        break;
      case "4":
        mensaje[i] = "6";
        x++;
        break;
      case "5":
        mensaje[i] = "3";
        x++;
        break;
      case "6":
        mensaje[i] = "2";
        x++;
        break;
      case "7":
        mensaje[i] = "0";
        x++;
        break;
      case "8":
        mensaje[i] = "9";
        x++;
        break;
      case "9":
        mensaje[i] = "1";
        x++;
        break;
      case " ":
        mensaje[i] = " ";
        x++;
        break;
      default: //no se imprime nada
        console.log("");
        break;
    }
  }
  let mensaje1 = new Array(x);
  mensaje1 = mensaje.slice();
  return mensaje1;
}

function pandora() {
  let textPreUnTransform = document.getElementById("TextPreUnTransform").value;
  let textUnTransform = document.getElementById("TextUnTransform");
  let mensaje1, mensaje2, mensaje3, mensaje4, mensaje5;
  let mensaje6;
  mensaje1 = SolicitarMensaje(textPreUnTransform);
  mensaje1 = Letras1(mensaje1);
  mensaje2 = ObtenerNum(mensaje1);
  mensaje2 = Girar(mensaje2);
  mensaje3 = Num(mensaje2);
  mensaje4 = Unir(mensaje1, mensaje3);
  mensaje5 = Letras2(mensaje4);
  mensaje5 = Letras3(mensaje5);
  mensaje6 = Imprimir(mensaje5);
  textUnTransform.value = mensaje6;
}
