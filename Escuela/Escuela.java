package Escuela;

public class Escuela {
  public static void main(String[] args) {
    Alumno alumno = new Alumno();
    alumno.saludar();
    alumno.setEdad(23);

    System.out.println(alumno.getEdad());
  }
}
