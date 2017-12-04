public class Products{
    //Creates Product Objects (Name, price)
    private String name;
    private double price;
    private int count;
    public Products(String n, double p,int c){
        name=n;
        price=p;
        count=c;
    }
    public void setName(String n){
    name=n;
    }
    public String getName(){
        return name;
    }
    public void setPrice(double p){
        price=p;
    }
    public double getPrice(){
        return price;
    }
    public void setCount(int c){
        count=c;
    }
    public int getCount(){
        return count;
    }
    public String toString(){
        return "[Product Name: "+name+"] [Product Price: $"+price+"] [Amount Left: "+count+"]";
    }


}