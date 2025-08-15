import java.util.Scanner;

public class tareaDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int edadChimbita = 500;

        System.out.println("Entra la edad: ");
        int edad = scanner.nextInt();

        System.out.println("Su edad es: " + edad);
        scanner.close();
        int edadEnMeses = edad * 12;
        System.out.println("la edad en meses es " + edadEnMeses);

        boolean mayorQueLaEdadChimbita = edadEnMeses > edadChimbita;
        System.out.println("su edad tiene mas de 500 meses?: " + mayorQueLaEdadChimbita);
    }
}
