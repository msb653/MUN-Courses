public class Rectangle implements Polygon{
    private double width, height;
    public Rectangle(double w, double h){
        width=w;
        height=h;
    }
    public double area(){
        return width*height;
        
    }
    public double perimeter(){
        return width*2+height*2;
        
    }
}
