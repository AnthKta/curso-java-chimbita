import java.util.ArrayList;

public class metodoArrayList {
  public static ArrayList<Object> crearArrayList() {
    ArrayList<Object> list = new ArrayList<>();

    list.add("String");
    list.add(2025);
    list.add(3.1416);
    list.add(false);
    list.add("H");

    return list;
  }
  public static void main(String[] args) {
    ArrayList<Object> listaMixta = crearArrayList();

    for(Object item : listaMixta) {
      System.out.println("Valor " + item + " tipo " + item.getClass().getSimpleName());
    }
  }
}
