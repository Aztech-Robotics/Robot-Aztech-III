
// Importamos la clase calculadora
import Calculadora.Calculadora;

// Objeto: "HolaMundo"
// Clase de nuestro objeto
public class HolaMundo {

  // Método: "main"
  public static void main(String[] args) {
    System.out.println("Primer programa en Java");

    // Creamos el objeto de la clase Calculadora
    // Tipo de dato / nombre del objeto / operador new / constructor
    Calculadora calculadora = new Calculadora();
    System.out.println(calculadora.sumar()); // llamada al método "sumar" del objeto calculadora

    saludar(); // Llamada al método "saludar"
    despedir(); // Llamada al método "despedir"
    Bienvenido(); // Llamada al metodo "Bienvenido"
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
