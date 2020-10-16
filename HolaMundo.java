// Objeto: "HolaMundo"

// Clase de nuestro objeto
public class HolaMundo {

  // Método: "main"
  public static void main(String[] args) {
    System.out.println("Primer programa en Java");

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
