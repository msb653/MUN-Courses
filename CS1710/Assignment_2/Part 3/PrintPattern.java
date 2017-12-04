import java.util.Scanner;
public class PrintPattern {
    public static void main( String[] args ) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int N=in.nextInt();
    String str1=" ";
    String str2="  ";
    String str3="&";
    int i=1;
    int count1=N;
    int count2=N;
    while (i<=N){
        count1=count2;
        while (count1>0){
            System.out.print(str3);
            count1=count1-1;}
        System.out.print(str1);
        count1=count2;
        while (count1>0){
            System.out.print(str3);
            count1=count1-1;}
        System.out.println() ; 
        str1=str1+str2; 
        i=i+1;  
        count2=count2-1;}
    
    }
}