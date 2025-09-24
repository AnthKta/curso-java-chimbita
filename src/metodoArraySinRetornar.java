import java.util.ArrayList;

public class metodoArrayList {
  public static void crearArrayList() {
    ArrayList<Object> list = new ArrayList<>();

    list.add("String");
    list.add(2025);
    list.add(3.1416);
    list.add(false);
    list.add("H");

    for(Object item : list) {
      System.out.println("Valor " + item + " tipo " + item.getClass().getSimpleName());
    }
  }
  public static void main(String[] args) {
    crearArrayList();
  }
}
