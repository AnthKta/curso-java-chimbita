import java.util.Scanner;
public class TareaLoops1LC {
    public static void main(String[] args) {
        //Imprimir los numeros del 1 al 100
        //for
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

        }
        //while
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        //do-while
        int e = 1;
        do {
            System.out.println(e);
            e++;
        } while (e <= 100);

        //suma de todos los numeros impares de 1 a 100 usando FOR
        int sumaDeImpar = 0;

        for (int n = 1; n <= 100; n++) {

            if (n % 2 != 0) {
                sumaDeImpar = sumaDeImpar + n;
            }
        }
        System.out.println("Suma de números impares 1 a 100= " + sumaDeImpar);

        // imprimir todos los numeros de 1 a 50 que sean divisibles por 3
        System.out.println("los numeros de 1 a 50 que sean divisibles por 3 son:");
        for (int d = 1; d <= 50; d++) {
            if (d % 3 == 0) {
                System.out.println(d);
            }
        }
        /*usar un FOR para encontrar el factorial de un numero (ej. 5! = 12)
        Nota: averiguando encontré que Se usa el tipo de dato "long" para la variable factorial porque los factoriales
        crecen muy rápido y un int podría desbordarse. Dice que por ejemplo, el factorial de 13 ya supera el límite de un int. (2,147,483,647)
        factorial se obtiene multiplicando todos los números enteros positivos desde 1 hasta ese número (inclusive)*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un número entero positivo:");
        int numero = scanner.nextInt();
        long factorial = 1;
        for (int f = 1; f <= numero; f++) {
            factorial = factorial * f;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);


        // usar un while loop que pida una contrasena y siga iterando hasta que el usario entre "Javaesunachimba123*"
        final String contraCorrecta = "Javaesunachimba123*";

        String contraEscrita = "";
        Scanner scanner2 = new Scanner(System.in);

        while (!contraEscrita.equals(contraCorrecta)) {
            System.out.println("Escriba la contraseña");
            contraEscrita = scanner2.nextLine();
        }

        System.out.println("La contraseña es correcta");
        scanner.close();
    }}
