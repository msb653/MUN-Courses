import java.util.Scanner;
public class NonIncreasing {
    public static void main (String[]args){
        Scanner in=new Scanner (System.in);
        System.out.print("Please enter an integer: ");
        int a=in.nextInt();
        System.out.print("Please enter another integer: ");
        int b=in.nextInt();
        System.out.print("Please enter one more integer: ");
        int c=in.nextInt();
        String result=orderCheck(a,b,c);
        System.out.println(result);
    }
    public static String orderCheck(int a, int b, int c){
        String result;
        if (a>=b || b>=c)
            result="The given numbers are already in non-increasing order.";
        else
            result="The given numbers in non-increasing order are " +c+" "+b+" "+a;         
        return result;
    }
      
}