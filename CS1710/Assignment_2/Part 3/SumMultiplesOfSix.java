import java.util.Scanner;
public class SumMultiplesOfSix {
    public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    int sum=0;
    int count=1;
    int value;
    int total;
    System.out.print("How many integers do you want to enter?: ");
    total=in.nextInt();

    while(count<=total) {
        System.out.print("Enter a number: ");
        value=in.nextInt();
        int test=value%6;
        if(test==0){
            sum=sum+value;}
        count=count+1;
        }
   System.out.print("Sum of multiples of 6: "+sum);     
    }
}