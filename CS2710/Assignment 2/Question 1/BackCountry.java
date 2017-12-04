//BackCountry class (Campsite subclass)
public class BackCountry extends Campsite{
  private String location, modeTravel;
  
  //BackCountry Constructor
  public BackCountry(String pN, String p, double cPN, String l, String mT){
    super(pN,p,cPN);
    location=l;
    modeTravel=mT;
  }
  
  //BackCountry Mutators
  public void setLocation(String l){
    location=l;
  }
  public void setModeTravel(String mT){
    modeTravel=mT;
  }
  
  //BackCountry Accessors
  public String getLocation(){
    return location;
  }
  public String getModeTravel(){
    return modeTravel;
  }
  
  //BackCountry toString
  public String toString(){
    return super.toString()+"[Location: "+location+"][Mode of Travel: "+modeTravel+"]";
  }
}