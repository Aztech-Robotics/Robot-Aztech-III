package HolaMundo;

// Importar clase Calculadora para hacer operaciones
import HolaMundo.Calculadora.Calculadora;

// importar clase Scanner para entrada por teclado
import java.util.Scanner;

// Clase del objeto HolaMundo
public class HolaMundo {
  // Método: "main"
  public static void main(String[] args) {
    // Tipo de dato / nombre del objeto / operador new / constructor
    Calculadora calculadora = new Calculadora(); // Crear objeto de la clase Calculadora
    Scanner teclado = new Scanner(System.in); // Crear objeto de la clase Scanner

    // Ingresando el numero A
    System.out.print("Ingrese el número A: ");
    int a = teclado.nextInt();

    // Ingresar el numero B
    System.out.print("Ingrese el número B: ");
    int b = teclado.nextInt();

    // Cerrar teclado
    teclado.close();

    // Procesar los datos mediante los métodos del objeto calculadora
    int suma = calculadora.sumar(a, b);
    int multiplicacion = calculadora.multiplicar(a, b);
    int resta = calculadora.restar(a, b);

    // Mostrar los resultados
    System.out.println("La suma es: " + suma);
    System.out.println("La multiplicacion es: " + multiplicacion);
    System.out.println("La resta es: " + resta);

    // saludar(); // Llamada al método "saludar"
    // despedir(); // Llamada al método "despedir"
    // Bienvenido(); // Llamada al metodo "Bienvenido"
  }

  // Método: "saludar"
  public static void saludar() {
    System.out.println("Hola, les manda saludos Armando");
  }

  // Método "despedir al usuario"
  public static void despedir() {
    System.out.println("Adiós, vuelva pronto");
  }

  // Método "Bienvenido"
  public static void Bienvenido() {
    System.out.println("Bienvenido de nuevo usuario");
  }
}
