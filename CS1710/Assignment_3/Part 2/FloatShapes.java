import java.util.Scanner;
public class FloatShapes {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        double tax=1.15;
        System.out.print ("Do you want your marine float to be a capsule(capsule), ");
        System.out.println("right circular cone(cone) or conical frustum(frustum)?: ");
        String shape=in.next();
        if (shape.equals("capsule")){
           double cost=capsule();
           double totalCost=cost*tax;
           System.out.printf("The cost of fabricating a capsule of the given ");
           System.out.printf("dimensions is: $%.2f",totalCost);
           
        }
        if (shape.equals("cone")){
            double cost=cone();
            double totalCost=cost*tax;
            System.out.printf("The cost of fabricating a cone of the given ");
            System.out.printf("dimensions is: $%.2f",totalCost);
        }
        if (shape.equals("frustum")){
            double cost=frustum();
            double totalCost=cost*tax;
            System.out.printf("The cost of fabricating a frustum of the given ");
            System.out.printf("dimensions is: $%.2f",totalCost);
        }

    }
    public static double capsule(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter r:");
        double r=in.nextDouble();
        System.out.println("Enter a:");
        double a=in.nextDouble();
        System.out.println("Enter cost per cubic centimeter: ");
        double costArea=in.nextDouble();
        double volume=Math.PI*Math.pow(r,2)*((4*r)/3+a);
        double costTotal=volume*costArea;
        return costTotal;
        
        
    }
    public static double cone(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter r: ");
        double r=in.nextDouble();
        System.out.println("Enter h: ");
        double h=in.nextDouble();
        System.out.println("Enter cost per cubic centimeter: ");
        double costArea=in.nextDouble();
        double volume=Math.PI*r*r*h*1/3;
        double costTotal=costArea*volume;
        return costTotal;
        
    }
    public static double frustum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter h: ");
        double h=in.nextDouble();
        System.out.println("Enter r1: ");
        double r1=in.nextDouble();
        System.out.println("Enter r2: ");
        double r2=in.nextDouble();
        System.out.println("Enter cost per cubic centimeter: ");
        double costArea=in.nextDouble();
        double volume=(Math.PI*h)/3*(Math.pow(r1,2)+r1*r2+Math.pow(r2,2));
        double costTotal=costArea*volume;
        return costTotal;
        
        
        
    }
}