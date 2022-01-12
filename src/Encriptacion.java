
import java.util.Scanner;

public class Encriptacion {

    //declaracion de objeto scanner
    Scanner ingreso = new Scanner(System.in);
    //declaracion de variables
    int x;

    //filtros: metodo para solicitar el mensaje que se encriptara, retorna un arreglo
    private char[] SolicitarMensaje() {
        String cadena;
        System.out.println("ingrese mensaje a encriptar: "); //solicitar ingreso de mensaje
        cadena = ingreso.nextLine(); //ingreso de cadena por teclado
        cadena = cadena.toLowerCase(); //convertir letras en minusculas
        char mensaje[] = new char[cadena.length()]; //creacion de arreglo con tamaño de la cadena
        mensaje = cadena.toCharArray(); //llenado de arreglo con contenido de la cadena
        return (mensaje); //retornar arreglo (mensaje ingresado convertido en cadena)
    }

    //filtros: metodo para imprimir lo contenido en el arreglo indicado, no retorna
    private void Imprimir(char[] mensaje) {
        for (int i = 0; i < mensaje.length; i++) { //recorre toda la extension del arreglo
            System.out.print(mensaje[i]); //imprime la posicion i del arreglo mensaje
        }
        System.out.println(); //pone un salto de linea
    }

    //filtro 1: metodo que cambia el valor de letras y numeros en el arreglo indicado, retorna un arreglo
    private char[] Letras1(char[] mensaje) {
        for (int i = 0; i < mensaje.length; i++) { //recorre toda la extension del arreglo
            switch (mensaje[i]) { //"si el valor contenido en la posicion i del arreglo mensaje es...", se asigna
                /* 
                a b c d e f g h i j k l m n o p q r s t u v w x y z  <--valor original
                s c a k w r e x t y g n i d l z b q v u m o h f p j  <--valor asignado
                
                0 1 2 3 4 5 6 7 8 9  <--valor original
                7 9 6 5 3 1 4 0 2 8  <--valor asignado
                 */
                case 'a':
                    mensaje[i] = 's';
                    break;
                case 'b':
                    mensaje[i] = 'c';
                    break;
                case 'c':
                    mensaje[i] = 'a';
                    break;
                case 'd':
                    mensaje[i] = 'k';
                    break;
                case 'e':
                    mensaje[i] = 'w';
                    break;
                case 'f':
                    mensaje[i] = 'r';
                    break;
                case 'g':
                    mensaje[i] = 'e';
                    break;
                case 'h':
                    mensaje[i] = 'x';
                    break;
                case 'i':
                    mensaje[i] = 't';
                    break;
                case 'j':
                    mensaje[i] = 'y';
                    break;
                case 'k':
                    mensaje[i] = 'g';
                    break;
                case 'l':
                    mensaje[i] = 'n';
                    break;
                case 'm':
                    mensaje[i] = 'i';
                    break;
                case 'n':
                    mensaje[i] = 'd';
                    break;
                case 'o':
                    mensaje[i] = 'l';
                    break;
                case 'p':
                    mensaje[i] = 'z';
                    break;
                case 'q':
                    mensaje[i] = 'b';
                    break;
                case 'r':
                    mensaje[i] = 'q';
                    break;
                case 's':
                    mensaje[i] = 'v';
                    break;
                case 't':
                    mensaje[i] = 'u';
                    break;
                case 'u':
                    mensaje[i] = 'm';
                    break;
                case 'v':
                    mensaje[i] = 'o';
                    break;
                case 'w':
                    mensaje[i] = 'h';
                    break;
                case 'x':
                    mensaje[i] = 'f';
                    break;
                case 'y':
                    mensaje[i] = 'p';
                    break;
                case 'z':
                    mensaje[i] = 'j';
                    break;
                case '0':
                    mensaje[i] = '7';
                    break;
                case '1':
                    mensaje[i] = '9';
                    break;
                case '2':
                    mensaje[i] = '6';
                    break;
                case '3':
                    mensaje[i] = '5';
                    break;
                case '4':
                    mensaje[i] = '3';
                    break;
                case '5':
                    mensaje[i] = '1';
                    break;
                case '6':
                    mensaje[i] = '4';
                    break;
                case '7':
                    mensaje[i] = '0';
                    break;
                case '8':
                    mensaje[i] = '2';
                    break;
                case '9':
                    mensaje[i] = '8';
                    break;
                default:
                    System.out.print(""); //no se imprime nada
                    break;
            }
        }
        return (mensaje); //retorna arreglo
    }

    //filtro 2: metodo que cambia el valor de letras por numeros y viceversa, retorna un arreglo
    private char[] Letras2(char[] mensaje) {
        int aumento = 0;
        for (int i = 0; i < mensaje.length; i++) { //se recorre la totalidad del arreglo
            if (mensaje[i] == 'a' || mensaje[i] == 'b' || mensaje[i] == 'c' || mensaje[i] == 'd' || mensaje[i] == 'e' || mensaje[i] == 'f'
                    || mensaje[i] == 'g' || mensaje[i] == 'h' || mensaje[i] == 'i' || mensaje[i] == 'j' || mensaje[i] == 'k' || mensaje[i] == 'l'
                    || mensaje[i] == 'm' || mensaje[i] == 'n' || mensaje[i] == 'o' || mensaje[i] == 'p' || mensaje[i] == 'q' || mensaje[i] == 'r'
                    || mensaje[i] == 's' || mensaje[i] == 't' || mensaje[i] == 'u' || mensaje[i] == 'v' || mensaje[i] == 'w' || mensaje[i] == 'x'
                    || mensaje[i] == 'y' || mensaje[i] == 'z') { //si el arreglo tiene una letra entonces se ingrementa aumento
                aumento++; //aumento es igual a aumento mas 1
            }
        }
        aumento = aumento + mensaje.length; //aumento es igual a aumento mas el tamaño del arreglo mensaje
        char mensaje2[] = new char[aumento]; //arreglo mensaje con tamaño determinado por variable aumento
        x = 0; //x es igual a cero
        for (int r = 0; r < mensaje.length; r++) { //se recorre toda la extension del arreglo
            switch (mensaje[r]) { //"si el valor contenido en la posicion i del arreglo mensaje es...", se asigna
                /* 
                a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z   <--valor original
                y1 y2 y3 y4 y5 y6 y7 y8 y9 d0 d1 d2 d3 d4 d5 d6 d7 d8 d9 v0 v1 v2 v3 v4 v5 v6  <--valor asignado
                
                0 1 2 3 4 5 6 7 8 9  <--valor original
                u t r c f s e o n z  <--valor asignado
                
                espacio  <--valor original
                x        <--valor asignado
                
                nota: la variable x se aumenta para llenar el arreglo "mensaje2" con tamaño de "aumento"
                explicacion: se recorre la variable mensaje y la variable mensaje2 de forma simultanea, de esta manera
                cuando se encuentran las letras de mensaje estas son sustituidas en mensaje2 que tiene una extension mayor
                ya que las letras en mensaje2 son sustituidas por dos caracteres por cada letra
                 */
                case 'a':
                    mensaje2[x] = 'y';
                    x++;
                    mensaje2[x] = '1';
                    x++;
                    break;
                case 'b':
                    mensaje2[x] = 'y';
                    x++;
                    mensaje2[x] = '2';
                    x++;
                    break;
                case 'c':
                    mensaje2[x] = 'y';
                    x++;
                    mensaje2[x] = '3';
                    x++;
                    break;
                case 'd':
                    mensaje2[x] = 'y';
                    x++;
                    mensaje2[x] = '4';
                    x++;
                    break;
                case 'e':
                    mensaje2[x] = 'y';
                    x++;
                    mensaje2[x] = '5';
                    x++;
                    break;
                case 'f':
                    mensaje2[x] = 'y';
                    x++;
                    mensaje2[x] = '6';
                    x++;
                    break;
                case 'g':
                    mensaje2[x] = 'y';
                    x++;
                    mensaje2[x] = '7';
                    x++;
                    break;
                case 'h':
                    mensaje2[x] = 'y';
                    x++;
                    mensaje2[x] = '8';
                    x++;
                    break;
                case 'i':
                    mensaje2[x] = 'y';
                    x++;
                    mensaje2[x] = '9';
                    x++;
                    break;
                case 'j':
                    mensaje2[x] = 'd';
                    x++;
                    mensaje2[x] = '0';
                    x++;
                    break;
                case 'k':
                    mensaje2[x] = 'd';
                    x++;
                    mensaje2[x] = '1';
                    x++;
                    break;
                case 'l':
                    mensaje2[x] = 'd';
                    x++;
                    mensaje2[x] = '2';
                    x++;
                    break;
                case 'm':
                    mensaje2[x] = 'd';
                    x++;
                    mensaje2[x] = '3';
                    x++;
                    break;
                case 'n':
                    mensaje2[x] = 'd';
                    x++;
                    mensaje2[x] = '4';
                    x++;
                    break;
                case 'o':
                    mensaje2[x] = 'd';
                    x++;
                    mensaje2[x] = '5';
                    x++;
                    break;
                case 'p':
                    mensaje2[x] = 'd';
                    x++;
                    mensaje2[x] = '6';
                    x++;
                    break;
                case 'q':
                    mensaje2[x] = 'd';
                    x++;
                    mensaje2[x] = '7';
                    x++;
                    break;
                case 'r':
                    mensaje2[x] = 'd';
                    x++;
                    mensaje2[x] = '8';
                    x++;
                    break;
                case 's':
                    mensaje2[x] = 'd';
                    x++;
                    mensaje2[x] = '9';
                    x++;
                    break;
                case 't':
                    mensaje2[x] = 'v';
                    x++;
                    mensaje2[x] = '0';
                    x++;
                    break;
                case 'u':
                    mensaje2[x] = 'v';
                    x++;
                    mensaje2[x] = '1';
                    x++;
                    break;
                case 'v':
                    mensaje2[x] = 'v';
                    x++;
                    mensaje2[x] = '2';
                    x++;
                    break;
                case 'w':
                    mensaje2[x] = 'v';
                    x++;
                    mensaje2[x] = '3';
                    x++;
                    break;
                case 'x':
                    mensaje2[x] = 'v';
                    x++;
                    mensaje2[x] = '4';
                    x++;
                    break;
                case 'y':
                    mensaje2[x] = 'v';
                    x++;
                    mensaje2[x] = '5';
                    x++;
                    break;
                case 'z':
                    mensaje2[x] = 'v';
                    x++;
                    mensaje2[x] = '6';
                    x++;
                    break;
                case '0':
                    mensaje2[x] = 'u';
                    x++;
                    break;
                case '1':
                    mensaje2[x] = 't';
                    x++;
                    break;
                case '2':
                    mensaje2[x] = 'r';
                    x++;
                    break;
                case '3':
                    mensaje2[x] = 'c';
                    x++;
                    break;
                case '4':
                    mensaje2[x] = 'f';
                    x++;
                    break;
                case '5':
                    mensaje2[x] = 's';
                    x++;
                    break;
                case '6':
                    mensaje2[x] = 'e';
                    x++;
                    break;
                case '7':
                    mensaje2[x] = 'o';
                    x++;
                    break;
                case '8':
                    mensaje2[x] = 'n';
                    x++;
                    break;
                case '9':
                    mensaje2[x] = 'z';
                    x++;
                    break;
                case ' ':
                    mensaje2[x] = 'x';
                    x++;
                    break;
                default:
                    char signo = mensaje[r]; //el signo que se encuentre en la posicion
                    mensaje2[x] = signo; //sera asignado al nuevo arreglo manteniendo su posicion relativa
                    x++; //x es igual a x mas 1
                    break;
            }
        }
        return (mensaje2); //retornar arreglo
    }

    //filtro 3: metodo que toma los valores de numeros y los pasa al final del arreglo, retorna un arreglo
    private char[] SepararNum(char[] mensaje) {
        char mensaje2[] = new char[mensaje.length]; //arreglo mensaje2 con longitud igual al arreglo mensaje
        x = 0; //x es igual a 0

        for (int i = 0; i < mensaje.length; i++) { //se recorre la totalidad del arreglo
            switch (mensaje[i]) { //"si el valor contenido en la posicion i del arreglo mensaje es...", se asigna valor
                /*
                se ubican las letras del primer arreglo y estas se posicionan en 
                orden en el nuevo arreglo de forma que todas las letras quedan primero
                en el segundo arreglo
                 */
                case 'a':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'b':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'c':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'd':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'e':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'f':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'g':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'h':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'i':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'j':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'k':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'l':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'm':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'n':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'o':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'p':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'q':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'r':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 's':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 't':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'u':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'v':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'w':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'x':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'y':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case 'z':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                default:
                    System.out.print(""); //no imprime nada
                    break;
            }

        }
        for (int i = 0; i < mensaje.length; i++) { //se recorre la totalidad del arreglo
            switch (mensaje[i]) { //"si el valor contenido en la posicion i del arreglo mensaje es...", se asigna el valor
                /*
                posteriormente a la asignacion de letras se asignan los numeros
                de forma que el primer arreglo se mantiene en orden mientras que en el
                segundo los numeros se localizan al final del arreglo
                 */
                case '0':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '1':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '2':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '3':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '4':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '5':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '6':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '7':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '8':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '9':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                default:
                    System.out.print("");
                    break;
            }
        }
        return (mensaje2); //retorna el arreglo2
    }

    //filtro 4: metodo que toma los numeros del arreglo y los asigna a un arreglo 2, retorna un arreglo
    private char[] ObtenerNum(char[] mensaje) {
        x = 0; //x es igual a 0
        for (int y = 0; y < mensaje.length; y++) { //se recorre la totalidad del arreglo
            if (mensaje[y] == '0' || mensaje[y] == '1' || mensaje[y] == '2' || mensaje[y] == '3' || mensaje[y] == '4' || mensaje[y] == '5'
                    || mensaje[y] == '6' || mensaje[y] == '7' || mensaje[y] == '8' || mensaje[y] == '9') { //si el arreglo tiene un numero entonces x aumenta
                x++; //x es igual a x mas 1
            }
        }
        char mensaje2[] = new char[x]; //arreglo2 con tamaño de x que es la cantidad de numeros que tiene el arreglo original
        x = 0; //x es igual a 0
        for (int i = 0; i < mensaje.length; i++) { //se recorre la totalidad del arreglo
            switch (mensaje[i]) { //"si el valor contenido en la posicion i del arreglo mensaje es...", se asigna el valor
                /*
                se asignan los numeros del arreglo1 en el arreglo2 (que solo contiene los numeros)
                 */
                case '0':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '1':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '2':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '3':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '4':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '5':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '6':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '7':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '8':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                case '9':
                    mensaje2[x] = mensaje[i];
                    x++;
                    break;
                default:
                    System.out.print(""); //no imprime nada
                    break;
            }
        }
        return (mensaje2); //retorna el arreglo
    }

    //filtro 4: metodo que convierte el arreglo con numeros en enteros, retorna un entero largo
    private long Num(char[] mensaje) {
        String numeros = String.valueOf(mensaje); //se convierte el arreglo en una cadena
        long numero = Long.parseLong(numeros); //se convierte la cadena en un entero largo
        long multi = numero * 13; //se multiplica el entero por 13 (pensado al azar)
        long suma = multi + 84; //se suma el numero obtenido en la multiplicacion mas 84 (pensado al azar)
        return (suma); //se retorna el valor de la suma anterior
    }

    //filtro 4: metodo que invierte el orden de los numeros, retorna un arreglo
    private char[] Girar(long suma) {
        int n;
        String numeros = Long.toString(suma); //se convierte el entero largo en una cadena
        char mensaje1[] = new char[numeros.length()]; //se crea un arreglo con la longitud de la cadena (en esta iran en orden)
        mensaje1 = numeros.toCharArray(); //se asigna el contenido de la cadena al arreglo
        char mensaje2[] = new char[numeros.length()]; //se crea un arreglo con la longitud de la cadena (en esta se invertiran)
        n = mensaje1.length; //n es igual a la longitud del arreglo1
        for (int i = 0; i < mensaje1.length; i++) { //se recorre la totalidad del arreglo
            n--; //n es igual a n menos 1
            /*
            i se aumenta y n se disminuye de forma que los valores del arreglo1 se asignen
            a el arreglo2, de esta forma en el arreglo 2 los valores del arreglo 1 quedaran
            ordenados de forma invertida
             */
            mensaje2[i] = mensaje1[n]; //asignar valor de arreglo1 a arreglo2
        }
        return (mensaje2); //retornar arreglo2 (numeros invertidos)
    }

    //filtro 4: metodo que une la parte de letras con la parte de numeros, retorna un arreglo
    /*
    mensaje 1= arreglo obtenido despues de posicionar los numeros al final (SepararNum)
    mensaje 2= arreglo obtenido al invertir la posicion de los numeros (Girar)
     */
    private char[] Unir(char[] mensaje1, char[] mensaje2) {
        x = mensaje1.length;
        for (int y = 0; y < mensaje1.length; y++) { //se recorre la totalidad del arreglo
            if (mensaje1[y] == '0' || mensaje1[y] == '1' || mensaje1[y] == '2' || mensaje1[y] == '3' || mensaje1[y] == '4' || mensaje1[y] == '5'
                    || mensaje1[y] == '6' || mensaje1[y] == '7' || mensaje1[y] == '8' || mensaje1[y] == '9') { //si el arreglo tiene un numero entonces x aumenta
                x--; //x es igual a x mas 1
            }
        }
        int tam1 = x; //tam1 es igual a x que equivale al espacio con letras
        int tam2 = tam1 + mensaje2.length; //tam2 es igual al espacio con letras mas la longitud del arreglo con los numeros invertidos
        char mensaje3[] = new char[tam2]; //arreglo que tendra letras y numeros, por lo tanto tiene la longitud de tam2
        x = 0; //x es igual a 0
        for (int i = 0; i < tam1; i++) { //se recorre solo la parte con letras del arreglo1
            x++; //x es igual a x mas 1
            mensaje3[i] = mensaje1[i]; //se asignan las letras del arreglo1 en el arreglo que contendra letras y numeros
        }
        int u = mensaje3.length - x; //u es igual al tamaño del arreglo con letras y numeros menos el valor de x
        for (int i = 0; i < u; i++) { //se recorre el arreglo a partir de donde termina la parte con letras
            mensaje3[x] = mensaje2[i]; //se asignan los numeros del arreglo2 en el arreglo que contiene letras y numeros
            x++; //x es igual a x mas 1
        }
        return (mensaje3); //retorna arreglo con letras y numeros
    }

    //filtro 5: metodo que cambia el valor de los numeros, retorna un arreglo
    private char[] Letras3(char[] mensaje) {
        for (int i = 0; i < mensaje.length; i++) { //recorre la totalidad del arreglo
            switch (mensaje[i]) { //"si el valor contenido en la posicion i del arreglo mensaje es...", se asigna
                /*
                0 1 2 3 4 5 6 7 8 9  <--valor original
                9 2 8 4 3 0 7 6 1 5  <--valor asignado
                 */
                case '0':
                    mensaje[i] = '9';
                    break;
                case '1':
                    mensaje[i] = '2';
                    break;
                case '2':
                    mensaje[i] = '8';
                    break;
                case '3':
                    mensaje[i] = '4';
                    break;
                case '4':
                    mensaje[i] = '3';
                    break;
                case '5':
                    mensaje[i] = '0';
                    break;
                case '6':
                    mensaje[i] = '7';
                    break;
                case '7':
                    mensaje[i] = '6';
                    break;
                case '8':
                    mensaje[i] = '1';
                    break;
                case '9':
                    mensaje[i] = '5';
                    break;
                default:
                    System.out.print(""); //no muestra nada
                    break;
            }
        }
        return (mensaje); //retorna arreglo
    }

    //pandora: metodo que permite el uso de todos los metodos anteriores, no retorna
    /*
    solicita mensaje, realiza las operaciones pertinentes y posteriormente imprime solo el resultado de la encriptacion
     */
    public void Pandora() {
        //declaracion de variables
        char mensaje[], mensaje2[], mensaje3[], mensaje4[];
        long num; //extension maxima = 9223372036854775807
        //aplicacion de metodos
        mensaje = SolicitarMensaje(); //solicita mensaje que se encriptara
        mensaje = Letras1(mensaje); //cambia el valor de las letras y de los numeros
        mensaje = Letras2(mensaje); //cambia el valor de letras por el de numeros y viceversa
        mensaje = SepararNum(mensaje); //quita los numeros y los envia justo despues de las letras
        mensaje2 = ObtenerNum(mensaje); //extrae los numeros y los ingresa en un nuevo arreglo
        num = Num(mensaje2); //convierte el arreglo a cadena y esta a numero, realiza operaciones con ellos
        mensaje3 = Girar(num);//convierte nuevamente los numeros a cadena y esta en arreglo, coloca los numeros al reves
        mensaje4 = Unir(mensaje, mensaje3); //une el arreglo con texto y el arreglo con numeros
        mensaje4 = Letras3(mensaje4); //cambia el valor de los numeros
        Imprimir(mensaje4); //imprime el codigo final

        /*mejorar programa haciendo que cada que se encuentre una x (de espacio) se cree un nuevo 
        codigo, esto para evitar llegar a la extension completa del valor long, agregar tambien los
        signos*/
    }
}
