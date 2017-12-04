//FrontCountry class (Campsite subclass)
public class FrontCountry extends Campsite{
  private String cgName;
  private int siteNumber;
  private boolean firepit; //(True=Yes, False=No)
  
  //FrontCountry Constructor
  public FrontCountry (String pN, String p, double cPN, String cgN, int sN, boolean f){
    super(pN, p, cPN);
    cgName=cgN;
    siteNumber=sN;
    firepit=f;
  }
  
  //FrontCountry mutators
  public void setCGName(String cgN){
    cgName=cgN;
  }
  public void setSiteNumber(int sN){
    siteNumber=sN;
  }
  public void setFirepit(boolean f){
    firepit=f;
  }
  
  //FrountCountry accessors
  public String getCGName(){
    return cgName;
  }
  public int getSiteNumber(){
    return siteNumber;
  }
  public boolean getFirepit(){
    return firepit;
  }
  
  //FrontCountry toString
  public String toString(){
    return super.toString()+"[Campground Name: "+cgName+"][Site Number: "+siteNumber+"][Has Firepit (T/F): "+firepit+"]";
  }
}