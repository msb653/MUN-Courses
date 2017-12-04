import java.util.Scanner;
public class OilDeliveries {
    public static void main( String[] args ) {
    Scanner in=new Scanner(System.in);
    int countD1=0;
    int countD2=0;
    int countD3=0;
    float litresD1=0;
    float litresD2=0;
    float litresD3=0;
    String D1="D1";
    String D2="D2";
    String D3="D3";
    System.out.print("Enter delivery code: ");
    String code=in.nextLine();
    while (!"END".equals(code)){
        if (D1.equals(code.substring(7))){
            countD1=countD1+1;
            String middle=code.substring(4,7);
            float litres=Float.parseFloat(middle); 
            litresD1=litresD1+litres;}
        if (D2.equals(code.substring(7))){
            countD2=countD2+1;
            String middle=code.substring(4,7);
            float litres=Float.parseFloat(middle); 
            litresD2=litresD2+litres;}
        if (D3.equals(code.substring(7))){
            countD3=countD3+1;
            String middle=code.substring(4,7);
            float litres=Float.parseFloat(middle); 
            litresD3=litresD3+litres;}
        System.out.println("Enter next delivery code (or 'END'): ");
        code=in.nextLine();}
    System.out.println(D1);  
    System.out.print("  Number of Orders: "+ countD1 );
    System.out.println();
    System.out.printf("  Total litres: ");
    System.out.print(litresD1);
    System.out.println();

    System.out.println(D2);  
    System.out.print("  Number of Orders: "+ countD2 );
    System.out.println();
    System.out.printf("  Total litres: ");
    System.out.print(litresD2);
    System.out.println();
    
    System.out.println(D3);  
    System.out.print("  Number of Orders: "+ countD3 );
    System.out.println();
    System.out.printf("  Total litres: ");
    System.out.print(litresD3);
    System.out.println();
          
    }
}