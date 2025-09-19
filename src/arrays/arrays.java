//Arrays
//Es un contenedor que contiene un numero fijo 
//de elementos del mismo tipo, empieza a contar desde el 0
//Un array tiene dos cosas, 
//la primera es la posicion, se le dice Index [0]
//la segunda es el valor
//Como un cassillero, por que tiene un numero y tiene contenido
//el contenido de los arrays es mutable
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3 at arrays.main(arrays.java:27)
public class arrays {
  public static void main(String[] args) {
    int[] notas = new int[5]; //array de 5 enteros declaracion de 1 linea

    System.out.println("notas es igual a " + notas[1]); //imprimimos

    int[] notas2;
    notas2 = new int[4]; //declaracion de 2 lineas

    System.out.println("notas2 es igual a " + notas2[1]); //imprimimos

    int[] notas3 = {4, 3, 5, 2, 4, 5, 7, 8, 9}; //con valores 

    System.out.println("notas 3 el valor de index 1 es " + notas3[1]); //imprimimos

    notas3[1] = 5; //cambiamos valor

    System.out.println("notas 3 el valor de index 1 es " + notas3[1]); //imprimimos
    //System.out.println("notas 3 el valor de index 10 es " + notas3[10]); //imprimimos
    for(int i = 0; i < notas3.length; i++) { //for clasico
      System.out.println("El elemento con index " + i + " es " + notas3[i]);
    }
    for(int richardEsUnCarechimba : notas3) { // for-each
      System.out.println("El valor es " + richardEsUnCarechimba);
    }
    //operaciones con arrays
    int suma  = 0;
    for (int valor : notas3) {
      suma += valor;
      System.out.println("Suma cuando se le agrega " + valor + " es " + suma);
    }

    int maximo = notas3[0];
    for (int valor2 : notas3){
      maximo = (valor2 > maximo) ? valor2 : maximo; // logica terniaria
    }
    System.out.println("el valor maximo es " + maximo);
  }
}
