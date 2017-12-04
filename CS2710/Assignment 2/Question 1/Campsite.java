//Campsite class
public class Campsite{
  private String parkName, province;
  private double costPN;
  //Campsite constructor
  public Campsite(String pN, String p, double cPN){
    parkName=pN;
    province=p;
    costPN=cPN; 
  }  
  
  //Campsite Mutators
  public void setParkName(String pN){
    parkName=pN;
  }
  public void setProvince(String p){
    province=p;
  }
  public void setCostPN(double c){
    costPN=c;
  }
  
  //Campsite Accessors
  public String getParkName(){
    return parkName;
  }
  public String getProvince(){
    return province;
  }
  public double getCostPN(){
    return costPN;
  }
  
  //Campsite toString
  public String toString(){
    return "[Park Name: "+parkName+"][Province: "+province+"][Cost Per Night: $"+costPN+"]";
  } 
}
