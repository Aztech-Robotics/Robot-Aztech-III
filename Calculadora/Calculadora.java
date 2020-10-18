package Calculadora;
  // importar la entrada por teclado
import java.util.Scanner;
// Clase del obeto calculadora
public class Calculadora {
  // método para sumar
  public static int sumar() {
    int res = 1 + 3 + 5;

    return res;
  }

  // método resta

  // método multiplicación
public static int multiplicar() {
    Scanner teclado = new Scanner (System.in);
    int dato,num,mul;
    System.out.println("Ingresa un numero entero que deses multiplicar");
    dato = teclado.nextInt (); 
    System.out.println("Ingresa 0 para finalizar");
    int i=1;
    while (dato!=0) {
      System.out.println("Ingresa otro numero entero que deses multiplicar");
    num = teclado.nextInt (); 
    int mul = dato*num;
    return mul;
   i++;
  }
}
}