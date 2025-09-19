
import java.util.Scanner;
public class metodostareaJava {



    //*****************************************************************
    //Solucionar el metodo Scope del repositorio.
    public static int testScope() {
        int x = 10;
        return x; // devolvemos x al main
    }

    //*****************************************************************


    //*****************************************************************

    //5Crear un metodo que retorne el MCD de dos enteros.

    public static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    //*****************************************************************

    //4Crear un metodo que tome un entero y retorne verdadero si es par, falso si es impar.
    public static boolean par(int numero) {

        if (numero % 2 ==0 ){
                return true;
        }
        else{
            return false;
        }

    }
    //*****************************************************************




    //*****************************************************************

    //3 Crear un overload que imprima el area() de: si recibe un entero es un
    // cuadrado, si recibe dos enteros es un rectangulo, si recibe un double
    // es un circulo (radio).

     public static int area(int areac) {
        return areac * areac;

        }

     public static int area(int arear, int arear2) {
        return arear * arear2;

        }

     public static double area(double areacir) {
        return 3.1416 * areacir * areacir;

        }

    //*****************************************************************




    //*****************************************************************

    //2Crear un metodo que divida dos numeros y retorne el resultado y el residuo.
    public static void division(int a,int b) {


        if(b==0){
            System.out.println(" no se puede dividir por 0 ");
        }else{

            int total = a/ b;
            int residuo = a % b;

            System.out.println(" El resultado de la división de  " + a + " y " + b + " Es igual a "+ total + " y su reciduo es " + residuo);
        }


    }


    //*****************************************************************





     //*****************************************************************

    //1Crear un metodo que imprima un mensaje personalizado, interactuando con el usuario en consola.

    public static void saludar(String nombre) {
        System.out.println(" Hola este es un saludo de bienvenida para  " + nombre);
    }

    //*****************************************************************




    //*****************************************************************



    //*****************************************************************

    //1Crear un metodo que imprima un mensaje personalizado, interactuando con el usuario en consola.

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombre = scanner.nextLine();

        saludar(nombre);




    //2Crear un metodo que divida dos numeros y retorne el resultado y el residuo.

      System.out.println("digite el primer numero");
      int a= scanner.nextInt();

      System.out.println("digite el Segundo numero");
      int b= scanner.nextInt();

      division(a,b);


      //3 Crear un overload que imprima el area() de: si recibe un entero es un
      // cuadrado, si recibe dos enteros es un rectangulo, si recibe un double
      // es un circulo (radio).

      System.out.println("El area de un cuadrado de lado 5 es: " + area(5) );
      System.out.println("El area de un rectangulo de lado 8 y otro lado es 4: " + area(8,4));
      System.out.println("El area de un circulo de radio 5.8 es: " + area(5.8));



      //4Crear un metodo que tome un entero y retorne verdadero si es par, falso si es impar.

      System.out.println("Digite el numeo que quieres saber si es par o impar");
      int npar= scanner.nextInt();


      System.out.println("¿ " + npar + "es par?: " + par(npar));




      //5Crear un metodo que retorne el MCD de dos enteros.

      System.out.println("MCD de 48 y 108 = " + mcd(48, 108));


      //6 Solucionar el metodo Scope del repositorio.

      int valor = testScope();
      System.out.println("Dentro de main: " + (valor + 20));


  }

}