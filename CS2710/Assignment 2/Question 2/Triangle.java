public class Triangle implements Polygon{
    private double height, base, sideC, sideD;
    public Triangle(double b, double h, double c, double d){
        base=b;
        height=h;
        sideC=c;
        sideD=d;
    }
    public double area(){
        return (base*height)/2;
        
    }
    public double perimeter(){
        return base+sideC+sideD;
    }
}
