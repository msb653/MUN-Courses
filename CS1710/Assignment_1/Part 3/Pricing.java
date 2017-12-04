import java.util.Scanner;
public class Pricing {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        double costJan=0.50;
        double costFeb=0.75;
        double costMar=1.00;
        System.out.print("Enter number of bunnies ordered in January: ");
        int sizeJan=in.nextInt();
        System.out.print("Enter number of bunnies ordered in February: ");
        int sizeFeb=in.nextInt();
        System.out.print("Enter number of bunnies ordered in March: ");
        int sizeMar=in.nextInt();
        int sizeTotal=sizeJan+sizeFeb+sizeMar;
        double costTotal=(sizeJan*costJan)+(sizeFeb*costFeb)+(sizeMar*costMar);
        double smallBoxes=sizeTotal/2/5;
        int smallBoxes1=(int)smallBoxes;
        double largeBoxes=sizeTotal/2/20;
        int largeBoxes1=(int)largeBoxes;
        double costAverage=costTotal/sizeTotal;
        double costSmall=costAverage*5*1.9;
        double costLarge=costAverage*20*1.8;
        System.out.print("Number of Small Boxes packed: ");
        System.out.println(smallBoxes1);
        System.out.print("Number of Large Boxes packed: ");
        System.out.println(largeBoxes1);
        System.out.printf("Selling Price Small Box: %10.2f", costSmall);
        System.out.println();
        System.out.printf("Selling Price Large Box: %10.2f", costLarge);
        System.out.println();
    }
}