public class WhaleTester{
    public static void main(String[]args){
        Whale w1=new Whale("ABC","John","blue",true,"adult",340.0);
        Whale w2=new Whale("DEF", "Sara","orca",false,"baby",220.0);
        Whale w3=new Whale("GHI","Kevin","humpback",true,"newborn",140.0);
        Whale w4=new Whale("JKL","Brian","orca",true,"adult",330.0);
        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w3.toString());
        System.out.println(w4.toString());
        w1.setLength(345.0);
        System.out.println("   ID :"+w1.getID());
        System.out.println("Length: "+w1.getLength());
        
    }

}