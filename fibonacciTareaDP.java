import java.util.Scanner;

public class fibonacciTareaDP {
       static int[] ciclo(int a, int b, int c,int i){
        c =a+b;
        a=b;
        b=c;
        i =i+1;
        return new int[]{a, b, c, i};
    }
    public static void main(String[] args) {
        System.out.println("Digite el numero hasta donde va a llegar la tabla fibonacci");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a=0;
        int b=1;
        int i=1;
        int c=0;

        while (i<=16){
            if (a < n){
                //System.out.println(i+" 2 "+a);
              /*  int c =a+b;
                a=b;
                b=c;
                i++;*/
                int[] ciclofin = ciclo(a,b,c,i);
                a =ciclofin[0];
                b =ciclofin[1];
                c =ciclofin[2];
                i = ciclofin[3];


            }else {

                int[] ciclofin = ciclo(a,b,c,i);
                a =ciclofin[0];
                b =ciclofin[1];
                c =ciclofin[2];
                i = ciclofin[3];
                System.out.println(i +" "+a);
            }


        }
        scanner.close();


    }
}
