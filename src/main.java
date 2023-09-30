import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int[] a = new int[20];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<20; i++) {
            System.out.print("Numero " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }

        for(int i=0; i<20; i++)
            System.out.println("numero:" + a[i] + " cuadrado:" + Math.pow(a[i],2) + " cubo:" + Math.pow(a[i],3));

    }
}
