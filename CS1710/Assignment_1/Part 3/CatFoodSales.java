import java.util.Scanner;
public class CatFoodSales {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter amount of sales for product A: ");
        double productA=in.nextDouble();
        System.out.print("Enter amount of sales for product B: ");
        double productB=in.nextDouble();
        System.out.print("Enter amount of sales for product C: ");
        double productC=in.nextDouble();
        Double totalSales=productA+productB+productC;
        double percentA=productA/totalSales*100;
        int percentA1=(int)Math.ceil(percentA);
        double percentB=productB/totalSales*100;
        int percentB1=(int)percentB;
        double percentC=productC/totalSales*100;
        int percentC1=(int)percentC;
        System.out.print("Percentage of total sales for product A is: ");
        System.out.print(percentA1);
        System.out.println("%");
        System.out.print("Percentage of total sales for product B is: ");
        System.out.print(percentB1);
        System.out.println("%");
        System.out.print("Percentage of total sales for product C is: ");
        System.out.print(percentC1);
        System.out.println("%");
        
    }
}
        
        
        