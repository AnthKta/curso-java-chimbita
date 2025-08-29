public class condicionalesDos {
    public static void main(String[] args) {
        int edad = 12;
        boolean tieneLicencia = false;

        if (!(edad >= 18 || tieneLicencia)){
            System.out.println("Puede manejar.");
        }
        else {
            System.out.println("Otra cosa");
        }
    }
}
