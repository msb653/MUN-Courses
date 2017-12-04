import java.util.Scanner;
public class Computation {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a=in.nextInt();
        System.out.print("Enter value of p: ");
        int p=in.nextInt();
        System.out.print("Enter value of m1: ");
        int m1=in.nextInt();
        System.out.print("Enter value of m2: ");
        int m2=in.nextInt();
        double G=((4*Math.pow(Math.PI,2)*Math.pow(a,3))/(Math.pow(p,2)*(m1+m2)));
        System.out.print(G);
    }
}