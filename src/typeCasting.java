public class typeCasting {
    public static void main(String[] args) {
        // este es implicito (Widening)
        int a = 223;
        double b = a; //covertir int en double
        System.out.println(a);
        System.out.println(b);

        // este es explicito (Narrowing)
        double x = 223.12;
        int y = (int)x;
        System.out.println(y);
    }
}
