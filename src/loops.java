public class loops {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

//         scope
//         For loop
        for (int i = 0; i < 6; i++) {
            System.out.println("Conteo desde el for " + i);
        }
//         while
        int conteo = 1;
        while (conteo <= 5) {
            System.out.println("Conteo desde el while " + conteo);
            conteo++; // nunca borrar esto, siempre asegurarme de que no estoy creando un loop infinito
        }
//       aca la variable conteo es 6
        do {
            System.out.println("El otro conteo desde el do-while " + conteo);
            conteo++;
        } while (conteo <=9);

        System.out.println("La variable despues de los loops es " + conteo);

        for (int i = 0; i < 10; i++) {
           if (i == 3) continue;
           System.out.println(i);
        }
        // Imprimir los numeros del 1 al 100 usando los 3 loops for while do-while
        // Pedir al usuario un numero, imprimir la tabla de fibonacci hasta 1k desde el numero valido mas cercano
        // Imprimir la suma de todos los numeros impares de 1 a 100 usando un for loop
        // imprimir todos los numeros de 1 a 50 que sean divisibles por 3
        // usar un while loop que pida una contrasena y siga iterando hasta que el usario entre "Javaesunachimba123*"
        // usar un for para encontrar el factorial de un numero (ej. 5! = 12)
    }

}
