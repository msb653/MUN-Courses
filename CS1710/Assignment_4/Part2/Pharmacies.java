import java.util.Scanner;
public class Pharmacies {
    public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    String[] pharm={"PH1","PH2","PH3","PH4","PH5","PH6"};
    String[] allerMed={"A1","A2","A3","A4","A5"};
    int[][] numbers = {
    {200, 350, 400, 150, 350, 0},
    {330, 540, 280, 190, 600, 0},
    {290, 430, 610, 500, 280, 0},
    {280, 330, 190, 480, 560, 0},
    {250, 460, 310, 400, 380, 0},
    {200, 430, 590, 680, 260, 0},
    {0, 0, 0, 0, 0, 0}
    }; 
    findAllerMedTotal(numbers);
    findPharmTotal(numbers);
    for (int i=0;i<numbers.length;i++){
        for (int j=0;j<numbers[0].length;j++){
            System.out.print(numbers[i][j]+" | ");
        }
        System.out.println();
    }      
    int popMed=findMostPopularMed(numbers);
    System.out.println("The most popular allergy pill is "+allerMed[popMed]);
    int profPharm=findMostProfitablePharm(numbers);
    System.out.println("The most profitable pharmacy is "+pharm[profPharm]);
    }
    public static int[][] findAllerMedTotal(int [][] x){
        int sum;
        int[][] numbers= new int [x.length][x[0].length];
        numbers=x;
        for (int j=0;j<x[0].length;j++){
            sum=0;
            for (int i=0;i<x.length;i++){
                sum=sum+x[i][j];
            }
        numbers[x.length-1][j]=sum;            
        }
    return numbers;    
    }
    public static int[][] findPharmTotal(int [][]x){
        int sum;
        int[][] numbers= new int [x.length][x[0].length];
        numbers=x;
        for (int i=0; i<x.length-1; i++){
            sum=0;
            for (int j=0; j<x[0].length;j++){
                sum=sum+x[i][j];
            }
            numbers[i][x[0].length-1]=sum;
        }
        return numbers;
    }
    public static int findMostPopularMed (int [][] x){
        int max=x[0][0];
        int position=0;
        for (int i=x.length-1; i<x.length;i++){
            for (int j=0;j<x[0].length-1;j++){
                if (x[i][j]>max){
                  max=x[i][j];
                  position=j;
                }            
            }           
        }
        return position;
    }
    public static int findMostProfitablePharm(int[][]x){
        int max=x[0][0];
        int position=0;
        for (int j=x[0].length-1; j<x[0].length;j++){
            for (int i=0;i<x.length-1;i++){
                if (x[i][j]>max){
                    max=x[i][j];
                    position=i;
                }    
            }
        }
        return position;
    }
}
    
        
  