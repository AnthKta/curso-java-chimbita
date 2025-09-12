public class metodoScope {
  public static void testScope() {
    int x = 10; //en C esta variable si se podria llamar
    System.out.println(x);
  }
  public static void main(String[] args) {
    testScope();
    System.out.println(x + 20);
  }
}
