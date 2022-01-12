
import java.util.Scanner;

public class Desencriptacion {

    //declaracion de objeto scanner
    Scanner ingreso = new Scanner(System.in);
    //declaracion de variables
    int x;

    //filtros: metodo para solicitar el mensaje que se desencriptara, retorna un arreglo
    private char[] SolicitarMensaje() {
        String cadena;
        System.out.println("ingrese mensaje a desencriptar: "); //solicitar ingreso de mensaje
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

    //filtro 1: metodo que cambia el valor de los numeros, retorna un arreglo
    private char[] Letras1(char[] mensaje) {
        for (int i = 0; i < mensaje.length; i++) {//recorre la totalidad del arreglo
            switch (mensaje[i]) { //"si el valor contenido en la posicion i del arreglo mensaje es...", se asigna
                /*
                0 1 2 3 4 5 6 7 8 9  <--valor original
                5 8 1 4 3 9 7 6 2 0  <--valor asignado
                 */
                case '0':
                    mensaje[i] = '5';
                    break;
                case '1':
                    mensaje[i] = '8';
                    break;
                case '2':
                    mensaje[i] = '1';
                    break;
                case '3':
                    mensaje[i] = '4';
                    break;
                case '4':
                    mensaje[i] = '3';
                    break;
                case '5':
                    mensaje[i] = '9';
                    break;
                case '6':
                    mensaje[i] = '7';
                    break;
                case '7':
                    mensaje[i] = '6';
                    break;
                case '8':
                    mensaje[i] = '2';
                    break;
                case '9':
                    mensaje[i] = '0';
                    break;
                default:
                    System.out.print(""); //no muestra nada
                    break;
            }
        }
        return (mensaje); //retorna arreglo
    }

    //filtro 2: metodo que toma los numeros del arreglo y los asigna a un arreglo 2, retorna un arreglo
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

    //filtro 3: metodo que invierte el orden de los numeros en el arreglo recibido, retorna un arreglo
    private char[] Girar(char[] mensaje) {
        int n;
        char mensaje1[] = new char[mensaje.length]; //se crea un arreglo con la longitud de la cadena (en esta se invertiran)
        n = mensaje.length; //n es igual a la longitud del arreglo1
        for (int i = 0; i < mensaje1.length; i++) { //se recorre la totalidad del arreglo
            n--; //n es igual a n menos 1
            /*
            i se aumenta y n se disminuye de forma que los valores del arreglo1 se asignen
            a el arreglo2, de esta forma en el arreglo 2 los valores del arreglo 1 quedaran
            ordenados de forma invertida
             */
            mensaje1[i] = mensaje[n]; //asignar valor de arreglo1 a arreglo2
        }
        return (mensaje1); //retornar arreglo2 (numeros invertidos)
    }

    //filtro 3: metodo que convierte el arreglo en numeros y con ellos opera, retorna una cadena
    private char[] Num(char[] mensaje) {
        String numeros = String.valueOf(mensaje); //se convierte el arreglo en una cadena
        long numero = Long.parseLong(numeros); //se convierte la cadena en un entero largo
        long resta = numero - 84; //se resta el numero menos 84 (pensado al azar)
        long div = resta / 13; //se divide el resultado de la resta entre 13 (pensado al azar)   
        numeros = Long.toString(div); //se convierte el entero largo en una cadena
        char mensaje1[] = new char[numeros.length()]; //se crea un arreglo con la longitud de la cadena (en esta iran en orden)
        mensaje1 = numeros.toCharArray(); //se asigna el contenido de la cadena al arreglo
        return (mensaje1); //se retorna el valor de las operaciones anteriores
    }

    //filtro 3: metodo que une la parte de letras con la parte de numeros, retorna un arreglo
    /*
    mensaje 1= arreglo que contiene tanto letras como numeros (Letras3)
    mensaje 2= arreglo obtenido al operar con los numeros (Num)
     */
    private char[] Unir(char[] mensaje1, char[] mensaje2) {
        x = 0; //x es igual a la longitud del arreglo
        for (int i = 0; i < mensaje1.length; i++) { //se recorre la totalidad del arreglo
            if (mensaje1[i] == 'a' || mensaje1[i] == 'b' || mensaje1[i] == 'c' || mensaje1[i] == 'd' || mensaje1[i] == 'e' || mensaje1[i] == 'f'
                    || mensaje1[i] == 'g' || mensaje1[i] == 'h' || mensaje1[i] == 'i' || mensaje1[i] == 'j' || mensaje1[i] == 'k' || mensaje1[i] == 'l'
                    || mensaje1[i] == 'm' || mensaje1[i] == 'n' || mensaje1[i] == 'o' || mensaje1[i] == 'p' || mensaje1[i] == 'q' || mensaje1[i] == 'r'
                    || mensaje1[i] == 's' || mensaje1[i] == 't' || mensaje1[i] == 'u' || mensaje1[i] == 'v' || mensaje1[i] == 'w' || mensaje1[i] == 'x'
                    || mensaje1[i] == 'y' || mensaje1[i] == 'z') { //si el arreglo tiene una letra entonces x aumenta
                x++; //x es igual a x mas 1
            }
        }
        int tam1 = x; //tam1 es igual a x que equivale al espacio con letras
        int tam2 = tam1 + mensaje2.length; //tam2 es igual al espacio con letras mas la longitud del arreglo con los numeros invertidos
        char mensaje3[] = new char[tam2]; //arreglo que tendra letras y numeros, por lo tanto tiene la longitud de tam2
        int LocMen1 = 0, LocMen2 = 0, LocMen3 = 0; //variables que señalan la ubicacion del mensaje 1, mensaje 2, mensaje 3
        /*
        mensaje 1: arreglo con letras y numeros (numeros no manipulados)
        mensaje 2: arreglo con numeros ya operados
        mensaje 3: arreglo donde se ubicaran las letras y numeros
         */
        for (int i = 0; i < tam1; i++) { //se recorre la totalidad del mensaje 3
            if (mensaje1[LocMen1] == 'y' || mensaje1[LocMen1] == 'd' || mensaje1[LocMen1] == 'v') { //si en la ubicacion de mensaje1 estan y,d,v entonces
                mensaje3[LocMen3] = mensaje1[LocMen1]; //se ubica la letra de mensaje 1 en mensaje 3
                LocMen3++; //se aumenta la localizacion de mensaje 3 (ya que y,d,v siempre van acompañados de un numero)
                mensaje3[LocMen3] = mensaje2[LocMen2]; //se ubica el numero de mensaje 2 en mensaje 3
                LocMen1++; //se aumenta localizacion de mensaje 1
                LocMen2++; //se aumenta localizacion de mensaje 2
                LocMen3++; //se aumenta localizacion de mensaje 3
            }
            if (mensaje1[LocMen1] == 'x' || mensaje1[LocMen1] == 'u' || mensaje1[LocMen1] == 't' || mensaje1[LocMen1] == 'r'
                    || mensaje1[LocMen1] == 'c' || mensaje1[LocMen1] == 'f' || mensaje1[LocMen1] == 's' || mensaje1[LocMen1] == 'e'
                    || mensaje1[LocMen1] == 'o' || mensaje1[LocMen1] == 'n' || mensaje1[LocMen1] == 'z') { //si en la ubicacion de mensaje1 estan estas letras entonces
                mensaje3[LocMen3] = mensaje1[LocMen1]; //se ubica la letra de mensaje 1 en mensaje 3
                LocMen3++; //se aumenta localizacion de mensaje 3
                LocMen1++; //se aumenta localizacion de mensaje 1
            }
        }
        return (mensaje3); //retorna arreglo con letras y numeros
    }

    //filtro 4: metodo que cambia el valor de letras por numeros y viceversa, retorna un arreglo
    private char[] Letras2(char[] mensaje) {
        char mensaje2[] = new char[mensaje.length]; //arreglo2 con longitud igual a arreglo1
        int LocMen2 = 0; //localizacion de mensaje 2
        for (int i = 0; i < mensaje.length; i++) { //se recorre toda la extension del arreglo
            switch (mensaje[i]) { //"si el valor contenido en la posicion i del arreglo mensaje es...", se asigna
                /*
                'y' aumenta el valor de i (para verificar cual es el numero que le sigue), 'y' va de 'a' hasta 'i'
                'd' aumenta el valor de i (para verificar cual es el numero que le sigue), 'd' va de 'j' hasta 's'
                'v' aumenta el valor de i (para verificar cual es el numero que le sigue), 'v' va de 't' hasta 'z'
                de esta manera 'y'-posicion0 '3'-posicion1 de mensaje sera asignado como 'c'-posicion0 en mensaje2
                 */
                case 'y':
                    i++;
                    switch (mensaje[i]) {
                        case '1':
                            mensaje2[LocMen2] = 'a';
                            LocMen2++;
                            break;
                        case '2':
                            mensaje2[LocMen2] = 'b';
                            LocMen2++;
                            break;
                        case '3':
                            mensaje2[LocMen2] = 'c';
                            LocMen2++;
                            break;
                        case '4':
                            mensaje2[LocMen2] = 'd';
                            LocMen2++;
                            break;
                        case '5':
                            mensaje2[LocMen2] = 'e';
                            LocMen2++;
                            break;
                        case '6':
                            mensaje2[LocMen2] = 'f';
                            LocMen2++;
                            break;
                        case '7':
                            mensaje2[LocMen2] = 'g';
                            LocMen2++;
                            break;
                        case '8':
                            mensaje2[LocMen2] = 'h';
                            LocMen2++;
                            break;
                        case '9':
                            mensaje2[LocMen2] = 'i';
                            LocMen2++;
                            break;
                    }
                    break;
                case 'd':
                    i++;
                    switch (mensaje[i]) {
                        case '0':
                            mensaje2[LocMen2] = 'j';
                            LocMen2++;
                            break;
                        case '1':
                            mensaje2[LocMen2] = 'k';
                            LocMen2++;
                            break;
                        case '2':
                            mensaje2[LocMen2] = 'l';
                            LocMen2++;
                            break;
                        case '3':
                            mensaje2[LocMen2] = 'm';
                            LocMen2++;
                            break;
                        case '4':
                            mensaje2[LocMen2] = 'n';
                            LocMen2++;
                            break;
                        case '5':
                            mensaje2[LocMen2] = 'o';
                            LocMen2++;
                            break;
                        case '6':
                            mensaje2[LocMen2] = 'p';
                            LocMen2++;
                            break;
                        case '7':
                            mensaje2[LocMen2] = 'q';
                            LocMen2++;
                            break;
                        case '8':
                            mensaje2[LocMen2] = 'r';
                            LocMen2++;
                            break;
                        case '9':
                            mensaje2[LocMen2] = 's';
                            LocMen2++;
                            break;
                    }
                    break;
                case 'v':
                    i++;
                    switch (mensaje[i]) {
                        case '0':
                            mensaje2[LocMen2] = 't';
                            LocMen2++;
                            break;
                        case '1':
                            mensaje2[LocMen2] = 'u';
                            LocMen2++;
                            break;
                        case '2':
                            mensaje2[LocMen2] = 'v';
                            LocMen2++;
                            break;
                        case '3':
                            mensaje2[LocMen2] = 'w';
                            LocMen2++;
                            break;
                        case '4':
                            mensaje2[LocMen2] = 'x';
                            LocMen2++;
                            break;
                        case '5':
                            mensaje2[LocMen2] = 'y';
                            LocMen2++;
                            break;
                        case '6':
                            mensaje2[LocMen2] = 'z';
                            LocMen2++;
                            break;
                    }
                    break;
                /*
                     x  u t r c f s e o n z  <--valor original
                    ' ' 0 1 2 3 4 5 6 7 8 9  <--valor obtenido
                 */
                case 'x':
                    mensaje2[LocMen2] = ' ';
                    LocMen2++;
                    break;
                case 'u':
                    mensaje2[LocMen2] = '0';
                    LocMen2++;
                    break;
                case 't':
                    mensaje2[LocMen2] = '1';
                    LocMen2++;
                    break;
                case 'r':
                    mensaje2[LocMen2] = '2';
                    LocMen2++;
                    break;
                case 'c':
                    mensaje2[LocMen2] = '3';
                    LocMen2++;
                    break;
                case 'f':
                    mensaje2[LocMen2] = '4';
                    LocMen2++;
                    break;
                case 's':
                    mensaje2[LocMen2] = '5';
                    LocMen2++;
                    break;
                case 'e':
                    mensaje2[LocMen2] = '6';
                    LocMen2++;
                    break;
                case 'o':
                    mensaje2[LocMen2] = '7';
                    LocMen2++;
                    break;
                case 'n':
                    mensaje2[LocMen2] = '8';
                    LocMen2++;
                    break;
                case 'z':
                    mensaje2[LocMen2] = '9';
                    LocMen2++;
                    break;

                default:
                    System.out.println("");
                    break;
            }
        }
        return (mensaje2); //retornar arreglo
    }

    //filtro 5: metodo que cambia el valor de letras y numeros en el arreglo indicado, retorna un arreglo
    private char[] Letras3(char[] mensaje) {
        x = 0; //x es igual a 0
        for (int i = 0; i < mensaje.length; i++) { //recorre toda la extension del arreglo
            switch (mensaje[i]) { //"si el valor contenido en la posicion i del arreglo mensaje es...", se asigna
                /*
                a b c d e f g h i j k l m n o p q r s t u v w x y z 0 1 2 3 4 5 6 7 8 9 ' ' <--valor original
                c q b n g x k w m z d o u l v y r f a i t s e h j p 7 5 8 4 6 3 2 0 9 1 ' ' <--valor obtenido
                 */
                case 'a':
                    mensaje[i] = 'c';
                    x++;
                    break;
                case 'b':
                    mensaje[i] = 'q';
                    x++;
                    break;
                case 'c':
                    mensaje[i] = 'b';
                    x++;
                    break;
                case 'd':
                    mensaje[i] = 'n';
                    x++;
                    break;
                case 'e':
                    mensaje[i] = 'g';
                    x++;
                    break;
                case 'f':
                    mensaje[i] = 'x';
                    x++;
                    break;
                case 'g':
                    mensaje[i] = 'k';
                    x++;
                    break;
                case 'h':
                    mensaje[i] = 'w';
                    x++;
                    break;
                case 'i':
                    mensaje[i] = 'm';
                    x++;
                    break;
                case 'j':
                    mensaje[i] = 'z';
                    x++;
                    break;
                case 'k':
                    mensaje[i] = 'd';
                    x++;
                    break;
                case 'l':
                    mensaje[i] = 'o';
                    x++;
                    break;
                case 'm':
                    mensaje[i] = 'u';
                    x++;
                    break;
                case 'n':
                    mensaje[i] = 'l';
                    x++;
                    break;
                case 'o':
                    mensaje[i] = 'v';
                    x++;
                    break;
                case 'p':
                    mensaje[i] = 'y';
                    x++;
                    break;
                case 'q':
                    mensaje[i] = 'r';
                    x++;
                    break;
                case 'r':
                    mensaje[i] = 'f';
                    x++;
                    break;
                case 's':
                    mensaje[i] = 'a';
                    x++;
                    break;
                case 't':
                    mensaje[i] = 'i';
                    x++;
                    break;
                case 'u':
                    mensaje[i] = 't';
                    x++;
                    break;
                case 'v':
                    mensaje[i] = 's';
                    x++;
                    break;
                case 'w':
                    mensaje[i] = 'e';
                    x++;
                    break;
                case 'x':
                    mensaje[i] = 'h';
                    x++;
                    break;
                case 'y':
                    mensaje[i] = 'j';
                    x++;
                    break;
                case 'z':
                    mensaje[i] = 'p';
                    x++;
                    break;
                case '0':
                    mensaje[i] = '7';
                    x++;
                    break;
                case '1':
                    mensaje[i] = '5';
                    x++;
                    break;
                case '2':
                    mensaje[i] = '8';
                    x++;
                    break;
                case '3':
                    mensaje[i] = '4';
                    x++;
                    break;
                case '4':
                    mensaje[i] = '6';
                    x++;
                    break;
                case '5':
                    mensaje[i] = '3';
                    x++;
                    break;
                case '6':
                    mensaje[i] = '2';
                    x++;
                    break;
                case '7':
                    mensaje[i] = '0';
                    x++;
                    break;
                case '8':
                    mensaje[i] = '9';
                    x++;
                    break;
                case '9':
                    mensaje[i] = '1';
                    x++;
                    break;
                case ' ':
                    mensaje[i] = ' ';
                    x++;
                    break;
                default:
                    System.out.print(""); //no se imprime nada
                    break;
            }
        }
        char mensaje1[] = new char[x]; //se crea arreglo mensaje1 con longitud de x (x es igual al total de caracteres que estan dentro del arreglo mensaje)
        System.arraycopy(mensaje, 0, mensaje1, 0, x);
        /*se copia el contenido de mensaje en mensaje1 
        (arreglo original, posicion donde comienza a copiar, arreglo destino, posicion donde comienza el pegado, cantidad de elementos que se copiaran)*/
        return (mensaje1); //retorna arreglo
    }

    //pandora: metodo que permite el uso de todos los metodos anteriores, no retorna
    /*
    solicita mensaje, realiza las operaciones pertinentes y posteriormente imprime solo el resultado de la desencriptacion
     */
    public void Pandora() {
        //declaracion de variables
        char mensaje1[], mensaje2[], mensaje3[], mensaje4[], mensaje5[];
        //aplicacion de metodos
        mensaje1 = SolicitarMensaje(); //solicita mensaje que se desencriptara
        mensaje1 = Letras1(mensaje1); //cambia el valor de los numeros
        mensaje2 = ObtenerNum(mensaje1); //saca los numeros
        mensaje2 = Girar(mensaje2); //gira el orden de los numeros
        mensaje3 = Num(mensaje2); //realiza operaciones con los numeros
        mensaje4 = Unir(mensaje1, mensaje3); //une en la posicion correcta los numeros y letras
        mensaje5 = Letras2(mensaje4); //cambia el valor de los numeros y letras
        mensaje5 = Letras3(mensaje5); //cambia el valor de los numeros y letras
        Imprimir(mensaje5); //imprime el codigo final
    }
}
