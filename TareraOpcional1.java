import java.util.Scanner;

public class TareraOpcional1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Ejercicio 1: Comparar dos números
        Pide al usuario dos números enteros y determina
        si son iguales, si el primero es mayor que el segundo
        o si el segundo es mayor que el primero. Muestra el resultado en pantalla.*/
                 System.out.println("COMPAREMOS NUMEROS");

                 System.out.println("Digite el primer numero");
                 String entradan1 = scanner.nextLine();
                 int n1 = Integer.parseInt(entradan1);

                 System.out.println("Digite el Segundo numero");
                 String entradan2 = scanner.nextLine();
                 int n2 = Integer.parseInt(entradan2);

            if (n1>n2){
                System.out.println(n1 + " Es mayor que " + n2);
            } else if (n1<n2) {
                System.out.println(n1 + " Es menor que " + n2);

            }else {
                System.out.println("LOS NUMEROS SON IGUALES");
            }


        /*Ejercicio 2: Promedio de dos enteros => Type Casting
        //Declara dos variables enteras y calcula su promedio. Usa casting
        explícito para convertir la suma a double antes de dividir, de forma
        que no se pierdan decimales.*/

            System.out.println("VAMOS A TRABAJAR TYPE CASTING");
             int numero1 = 7;
             int numero2 = 2;

            System.out.println("El promedio de la suma de  " + numero1 + " y " + numero2 + " Es " );

            int prom = numero1 + numero2;
            double prom2 = prom;
            double promfinal = prom2/2;

            System.out.println(promfinal);

        //Condicionales y Operadores

        /*Ejercicio 3: Descuento en compras
        Pide al usuario el valor total de su compra. Si el monto es mayor a 100,
        aplica un 10% de descuento. Muestra el total a pagar con el descuento aplicado
        si corresponde.*/

             System.out.println( " VAMOS A MIRAR EL DESCUENTO DE UN COMPRADOR ");
             System.out.println("Digite el total de su compra");

             int totalcomp = scanner.nextInt();
             int descuen = totalcomp - (totalcomp * 10 /100);

             if(totalcomp > 100 ){
                 System.out.println("Tienes un 10% de descuento total a pagar es " + descuen);
             }else {
                 System.out.println("No se aplicara ningun descuento, El valor a pagar es de " + totalcomp);
             }

        scanner.close();
    }
}
