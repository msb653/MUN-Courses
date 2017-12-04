import java.util.Scanner;
public class PolygonTester{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Input rectangle width: ");
        double w=in.nextDouble();
        System.out.println("Input rectangle height: ");
        double h=in.nextDouble();
        System.out.println("Input triangle height: ");
        double th=in.nextDouble();
        System.out.println("Input triangle base: ");
        double base=in.nextDouble();
        System.out.println("Input triangle side a: ");
        double a=in.nextDouble();
        System.out.println("Input triangle side b: ");
        double b=in.nextDouble();
        Rectangle r=new Rectangle (w,h);
        Triangle t=new Triangle(base,th,a,b);
        System.out.println("Rectangle area: "+r.area());
        System.out.println("Rectangle Perimeter: "+r.perimeter());
        System.out.println("Triangle area: "+t.area());
        System.out.println("Triangle perimeter: "+t.perimeter());
    }
}
