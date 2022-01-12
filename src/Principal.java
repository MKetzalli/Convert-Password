
import java.util.Scanner;

/*
@author MKetzalli
ver. 1.1 finalizada 19/06/2019
DESCRIPCION: solicita mensaje y lo pasa por medio de 5 filtros diferentes para que al obtener el resultado
sea imposible comprender el mensaje original, enseguida pregunta que mensaje se desea desencriptar, si se escribe 
un mensaje codificado valido entonces este es devuelto descodificado, el contenido de los mensajes debe ser corto
esto debido a que el parametro long solo soporta 9223372036854775807
VALOR DE PRUEBA: MARIA 123
VALOR RESULTADO: yddvdxzes2947582
NOTA1: por ahora no se pueden incluir signos ya que estos cambian el resultado y lo volverian imposible de traducir de vuelta
NOTA2: si se ingresan numeros se debe ingresar por lo menos una letra, ya que al volverlas minusculas si no se detectan letras en la cadena marca error
 */
public class Principal {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int menu = 0;
        while (menu != 3) {
            System.out.println("MENU \n1)Encriptar \n2)Desencriptar \n3)Salir");
            menu = ingreso.nextInt();
            ingreso.nextLine();
            switch (menu) {
                case 1:
                    //declaracion de objeto
                    Encriptacion enc = new Encriptacion();
                    //uso del metodo que permite el ingreso y encriptacion
                    enc.Pandora();
                    break;
                case 2:
                    //declaracion de objeto
                    Desencriptacion des = new Desencriptacion();
                    //uso del metodo que permite el ingreso y desencriptacion
                    des.Pandora();
                    break;
                case 3:
                    System.out.println("Hasta pronto!!");
                    break;
                default:
                    System.out.println("Ingreso incorrecto");
            }
        }
    }

}
