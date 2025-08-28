import java.util.Scanner;

public class TareaCondicionalesSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 //Crear un programa que pida la edad y la calificacion de un estudiante
//Si la edad es menor que 13 imprimir Nino
//Si la edad esta entre 13 y 17 imprimir Adolecente
//Si la edad es mayor o igual a 18 imprimir Adulto

                try {
                    System.out.println("Digame su edad: ");
                    String digitacionentrada= scanner.nextLine();
                    int edad = Integer.parseInt(digitacionentrada);

                    if (edad <= 13) {
                        System.out.println("Nino");
                    } else if (edad > 13 & edad <= 17) {
                        System.out.println("Adolecente");
                    } else if (edad >= 18) {
                        System.out.println("Adulto");
                    } else {
                        System.out.println("Ese numero no esta identificado");
                    }


//Luego la calificacion puede ser de 1 - 5 1->Deficiente 2->Insuficiente 3->Aceptable 4->Sobresaliente 5->CHIMBITA!!!
 //Si intento entrar algo diferente a algun numero que imprima un mensaje de error diferente
//Como un PR Abierto en el repositorio


                    System.out.println("Digite su calificación de 1 a 5");
                    String entradacalificacion = scanner.nextLine();
                    int calificacion = Integer.parseInt(entradacalificacion);


                    switch (calificacion) {
                        case 1:
                            System.out.println("Deficiente");
                            break;
                        case 2:
                            System.out.println("Insuficiente");
                            break;
                        case 3:
                            System.out.println("Aceptable");
                            break;
                        case 4:
                            System.out.println("Sobresaliente");
                            break;
                        case 5:
                            System.out.println("CHIMBITA!!!");
                            break;
                        default:
                            System.out.println("Error: Numero no admitido .");


                    }
                }catch (NumberFormatException e){
                    System.out.println("Error: Por favor ingresa solo números.");
                }

        scanner.close();
    }

}
