import java.util.Scanner;
public class ArraySort {
    public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter array size: ");
    int arraySize=in.nextInt();
    int[] arrayList= new int [arraySize];
    for (int i=0;i<arrayList.length;i++){
        System.out.println("Enter next array value: ");
        arrayList[i]=in.nextInt();
    }
    System.out.println("Unsorted array: ");
    printArray(arrayList);
    System.out.println("Sorted array: ");
    arrayList=descending(arrayList);
    printArray(arrayList);

        
    }
    public static int[] descending(int[] arrayList){
         int[] ordered=new int [arrayList.length];
         ordered=arrayList;
         int n=ordered.length;
         int temp=0;
         for (int i=0; i<n;i++){
             for(int j=1; j < (n-i); j++){
                 if(ordered[j-1] < ordered[j]){
                     temp = ordered[j-1];
                      ordered[j-1] = ordered[j];
                       ordered[j] = temp;
                 }
             }
         }
         return ordered;
    }
    
    public static void printArray (int[] arrayList){
        for (int i=0;i<arrayList.length;i++){
            System.out.print(arrayList[i]+" | ");
        }
        System.out.println();
    }
}