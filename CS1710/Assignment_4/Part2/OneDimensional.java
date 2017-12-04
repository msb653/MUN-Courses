import java.util.Scanner;
public class OneDimensional {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please input an integer: ");
        int n=in.nextInt();
        int Low = 1;
        int High = 100;
        int [] randomList=new int [n];
        for (int i=0;i<randomList.length;i++){
            randomList[i] = (int) (Math.random() * (High - Low)) + Low;
        }
        System.out.println("Array with random numbers: ");
        Print(randomList);
        int [] reverseArray=new int [randomList.length];
        reverseArray=Reverse(randomList);
        System.out.println("Reversed array: ");
        Print(reverseArray);
    }
    public static int[] Reverse(int [] reverseList){
        int[] d=new int[reverseList.length];
        for (int i=reverseList.length-1;i>=0;i--){
            d[(reverseList.length-i-1)]=reverseList[i];
        }
        return d;
    }
    public static void Print(int [] arrayList){
        for (int i=0;i<arrayList.length;i++){
            System.out.print(arrayList[i]+" | ");
        }
        System.out.println();
    }
}         