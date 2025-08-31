import java.util.Scanner;

public class tarealoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        // Imprimir los numeros del 1 al 100 usando los 3 loops for while do-while
        System.out.println("VAMOS A IMPRIMIR LOS NUMEROS DE 1 A100 UTILIZANDO VARIOS LOOPS");
        System.out.println("FOR");

                for (int i=1; i <= 100; i++){
                    System.out.println(i);
                }
         System.out.println("WILE");
                 int b = 1;
                while (b<=100){
                    System.out.println(b);
                    b++;
                }
                 int c = 1;
         System.out.println("DO-WILE");
                do {
                    System.out.println(c);
                    c++;
                }while (c <= 100);





           // Pedir al usuario un numero, imprimir la tabla de fibonacci hasta 1k desde el numero valido mas cercano
             System.out.println("iMPRIMIR LA TABLA DE FIBONACCI DESDE EL NUMERO VALIDO MAS CERCANO");
                System.out.println("Ingresa un numero");
                int num6 = scanner.nextInt();
                int a = 0;
                int r = 1;
                int masCerca = 0;

        while (b <= 1000) {
            if (Math.abs(num6 - a) < Math.abs(num6 - masCerca)) {
                masCerca = a;
            }
            if (Math.abs(num6 - r) < Math.abs(num6 - masCerca)) {
                masCerca = r;
            }

            int temp = a + r;
            a = r;
            b = temp;
        }

        a = 0;
        r = 1;

        while (b < masCerca) { // avanzar hasta el más cercano
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println("Serie Fibonacci desde " + masCerca + " hasta 1000:");
        while (a <= 1000) { // imprimir desde ahí hasta 1000
            System.out.print(a + " ");
            int temp = a + r;
            a = r;
            b = temp;
        }



        // Imprimir la suma de todos los numeros impares de 1 a 100 usando un for loop

        System.out.println("VAMOS A IMPRIMIR LA SUMA DE LOS NUMEROS IMPARES DE 1 A100");
        int suma=0;

        for (int i = 1; i<=100; i++){
            if(i % 2 !=0)
            suma = suma + i;
        }

        System.out.println("la suma de los impares de 1 a 100 es " +suma);




        // imprimir todos los numeros de 1 a 50 que sean divisibles por 3
        System.out.println("VAMOS A IMPRIMIR TODOS LOS NUMEROS DE 1 A 50 DIVISIBLES POR 3");

        for (int d = 1; d<=50; d++){
            if(d % 3 == 0)
                System.out.println(d);
        }

        // usar un while loop que pida una contrasena y siga iterando hasta que el usario entre "Javaesunachimba123*"

        String contraseña = "";

        // Mientras la contraseña ingresada sea diferente de la correcta
        System.out.println("VAMOS A IMPRIMIR CONTRASEÑAS CORRECTAS");

        while (!contraseña.equals("Javaesunachimba123*")) {
            System.out.print("Ingrese la contraseña: ");
            contraseña = scanner.nextLine();
        }

        System.out.println("Acceso concedido");


        // usar un for para encontrar el factorial de un numero (ej. 5! = 12)
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int fac = 1;

        for (int f= 1; f <= numero; f++) {
            fac = fac * f;
        }

        System.out.println("El factorial de " + numero + " es: " + fac);



    }



}
