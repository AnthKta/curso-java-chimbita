import java.util.Scanner;
import java.util.InputMismatchException;

public class TareaTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        boolean validIn = false;

        while (!validIn) {
            System.out.println("Escriba su edad terrestre (máximo hasta 200 años): ");

            try {
                edad = scanner.nextInt();
                validIn = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor ingrese solo números");
                scanner.next();
            }
        }
            if (edad < 13) {
                System.out.println("Usted es Niño");
                validIn = true;
            } else if (edad <= 17) {
                System.out.println("Usted es Adolecente");
                validIn = true;
            } else if (edad <= 200) {
                System.out.println("Usted es Adulto");
                validIn = true;
            } else {
                System.out.println("Usted ha ingresado una edad imposible en esta era del plano terrestre.");
            }
            int nota = 0;
            boolean validNota = false;
            while (!validNota) {
                System.out.println("Escriba su calificación en números del 1 al 5: ");
                try {
                    nota = scanner.nextInt();
                    validNota = true;
                } catch (InputMismatchException a) {
                    System.out.println("Entrada inválida. Por favor ingrese un valor en números enteros del 1 al 5");
                    scanner.next();
                }
                switch (nota) {
                    case 1:
                        System.out.println("Su nota es Deficiente");
                        validNota = true;
                        break;
                    case 2:
                        System.out.println("Su nota es Insuficiente");
                        validNota = true;
                        break;
                    case 3:
                        System.out.println("Su nota es Aceptable");
                        validNota = true;
                        break;
                    case 4:
                        System.out.println("Su nota es Sobresaliente");
                        validNota = true;
                        ;
                        break;
                    case 5:
                        System.out.println("Su nota es CHIMBITA!!!");
                        validNota = true;
                        break;
                    default:
                        System.out.println("El valor de la calificación ingresado es inválido, intente nuevamente con números del 1 al 5");
                        break;
                }

            }

        }}
