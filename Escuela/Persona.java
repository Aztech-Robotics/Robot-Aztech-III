package Escuela;

public class Persona {
  private int edad;
  private double peso;
  private double altura;

  public void saludar() {
    System.out.println("Hola, soy una persona");
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getPeso() {
    return this.peso;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getAltura() {
    return this.altura;
  }
}
