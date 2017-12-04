//Unserviced class(FrontCountry subclass)
public class Unserviced extends FrontCountry{
  private boolean generatorUseage;
  
  //Unserviced Constructor
  public Unserviced(String pN, String p, double cPN, String cgN, int sN, boolean f, boolean gU){
    super(pN,p,cPN,cgN,sN,f);
    generatorUseage=gU;
  }
  
  //Unserviced Mutator
  public void setGeneratorUseage(boolean gU){
    generatorUseage=gU;
  }
  
  //Unserviced Accessor
  public boolean getGeneratorUseage(){
    return generatorUseage;
  }
  
  //Unserviced toString
  public String toString(){
    return super.toString()+"[Generator Used (T/F): "+generatorUseage+"]";
  }
  
}