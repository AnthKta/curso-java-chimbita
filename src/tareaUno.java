public class tareaUno {
    public static void main(String[] args) {
        int num1 = 10;
//        System.out.println(num1);
//        num1 = 20;
//        System.out.println(num1);
        int num2 = 20;
        double dec = 24.2;
        final int finalnum = 1; //constante

        int sum = num1 + num2;
        System.out.println(sum);
        int mult = num1 * num2;
        System.out.println(mult);
        double resultado = sum / dec;
        System.out.println("El resultado es: " +resultado);
        System.out.println("La constante es: " +finalnum);

        boolean esMayorQueElFinal = resultado > finalnum;
        System.out.println("Es el resultado mayor que la constante? " + esMayorQueElFinal);
    }
}
