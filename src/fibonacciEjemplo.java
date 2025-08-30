import java.util.Scanner;

public class fibonacciEjemplo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Desde que numero quieres");
    int n = scanner.nextInt();

    int a = 0;
    int b = 1;

    //System.out.println("Vamos a hacer la secuencia de fibonacci " + n + " cantidad de veces");

    for(int i = 1; i <= 17 ; i++) {
      if (a < n){
        //System.out.println("En " + a + " estoy continuando");
        int c = a + b;
        a = b;
        b = c;
      }
      else {
        System.out.println(a);
        int c = a + b;
        a = b;
        b = c;
      }
      //System.out.println("b es " + b);
    }

    scanner.close();
  }
}

