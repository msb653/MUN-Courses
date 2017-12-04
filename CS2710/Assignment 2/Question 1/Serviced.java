//Serviced class (FrontCountry subclass)
public class Serviced extends FrontCountry{
  private int ampService;
  private boolean waterService;
  
  //Serviced Constructor
  public Serviced(String pN, String p, double cPN, String cgN, int sN, boolean f, int a, boolean wS){
    super(pN,p,cPN,cgN,sN,f);
    ampService=a;
    waterService=wS;
  }
  
  //Serviced Mutators
  public void setAMPService(int a){
    ampService=a;
  }
  public void setWaterService(boolean wS){
    waterService=wS;
  }
  
  //Serviced Accessors
  public int getAMPService(){
    return ampService;
  }
  public boolean getWaterService(){
    return waterService;
  }
  
  //Serviced toString
  public String toString(){
    return super.toString()+"[Amp Service: "+ampService+"][Water Service: "+waterService+"]";
  }
}