import java.util.Scanner;
public class HighLowAvg {
    public static void main( String[] args ) {
    Scanner in=new Scanner(System.in);
    int i=1;
    System.out.print("How many students are in the class?: ");
    int n=in.nextInt();
    int max=0;
    int min=100;
    int sum=0;
    while (i<=n){
        System.out.print("Enter student number: ");
        int studentNumber=in.nextInt();
        System.out.print("Enter term mark: ");
        int termMark=in.nextInt();
        sum=sum+termMark;
        if (termMark>=max)
            max=termMark;
        if (termMark<=min)
            min=termMark;
        i=i+1;
    }
    int average=sum/n;
    System.out.println("The highest mark in the class is: "+max);
    System.out.println("The lowest mark in the class is: "+min);        
    System.out.println("The average mark of the class is: "+average);

    }
}