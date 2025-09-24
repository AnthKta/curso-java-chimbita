public class metodoRetorno {
  public static int alCuadrado(int x) {
    return x * x;
  }
  public static void main(String[] args) {
    int numero = 9;
    int resultado = alCuadrado(numero);
    System.out.println("El cuadrado del numero "+ numero + " es " + resultado);
  }
}
