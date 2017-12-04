import java.util.Scanner;
public class NumericMethods {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        int d=in.nextInt();
        int n=in.nextInt();
        System.out.println();
        printPowers(x,y);
        printNumbers(a,b,d);
        int sum=randomSum(n);
        System.out.println("The sum of the random numbers is "+sum);
    }
    public static void printPowers(int x, int y){
        for(int i=1; i<=x;i++){
            double z=Math.pow(i,y);
            System.out.println(i+"^"+y+" = "+z);
        }
        System.out.println();
    }
    public static void printNumbers(int a, int b, int d){
        System.out.println("The numbers divisible by "+d+" are ");
        int c;
        for(c=a;c<=b;c++){
            if(c%d==0)
                System.out.println(c);
        }
        System.out.println();
    }
    public static int randomSum(int n){
        int range=(99-11)+1;
        return (int)(Math.random()*range)+11;
        
    }
      
}