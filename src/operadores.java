public class operadores {
    public static void main(String[] args) {
        int a = 10, b = 3;
        //operadores aritméticos
        System.out.println("a + b = " + (a + b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a * b = " + (a * b));

        /*
        operadores relacionales
        > mayor que
        > mayor que
        < menor que
        == es igual a
        != es diferente a
         */
        System.out.println(a > 5);
        System.out.println(a == 10);
        System.out.println(a != 7);
        System.out.println(a < 7);

        /*operadores logicos
        && (AND)
        || (OR)
        ! (NOT)
         */
        boolean esAdulto = false;
        boolean tienePase = false;
        System.out.println("AND");
        System.out.println(esAdulto && tienePase);
        System.out.println("OR");
        System.out.println(esAdulto || tienePase);
        System.out.println("NOT");
        System.out.println(!esAdulto);
        System.out.println("Varios Operadores Lógicos");
        System.out.println((esAdulto || tienePase) && (!tienePase));
        // Type Casting

    }
}
