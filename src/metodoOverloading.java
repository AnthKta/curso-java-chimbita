public class metodoOverloading {
  public static int add(int a, int b) {
    return a + b;
  }
  public static double add(double a, double b) {
    return a + b;
  }
  public static void main(String[] args) {
    System.out.println("La suma double es = " + add(4.5, 5.5));
    System.out.println("La suma int es = " + add(4, 5));
  }
}
