import java.io.*;
import java.util.Scanner;
public class SalesCommission {
    public static void main (String[] args) throws FileNotFoundException{
        Scanner file=new Scanner(new File("Sales.txt"));
        int numTimes=5;
        PrintWriter out=new PrintWriter("Commissions.txt");
        for (int i=0; i<numTimes;i++){
            String[] split=file.nextLine().split(" ");
            Double listPrice=Double.parseDouble(split[2]);
            Double sellingPrice=Double.parseDouble(split[3]);
            Double commission;
            Double difference=listPrice-sellingPrice;
            if (sellingPrice>=listPrice)
                commission=0.07*sellingPrice;
            else if (difference<1000)
                commission=0.05*sellingPrice;
            else if (difference>=1000 && difference<3000)
                commission=0.03*sellingPrice;
            else
                commission=0.02*sellingPrice;
            System.out.printf("RID: "+split[0]+" HID: "+split[1]+" Commission: $%.2f",commission);
            System.out.println();
            out.print(split[0]+" "+split[1]+" ");
            out.printf("%.2f",commission);
            out.println();
                      
        }
        out.close();
    }
}