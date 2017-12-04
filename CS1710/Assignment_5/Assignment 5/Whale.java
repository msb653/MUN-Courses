public class Whale{
    String ID;
    String name;
    String type;
    Boolean male; //True if male and false if female
    String lifeStage;
    Double length;
    public Whale(String wID, String wName, String wType, Boolean wMale, String wLifeStage, Double wLength){
        ID=wID;
        name=wName;
        type=wType;
        male=wMale;
        lifeStage=wLifeStage;
        length=wLength;
    }
    public void setLifeStage(String newLifeStage){
        lifeStage=newLifeStage;
    }
    public void setLength(Double newLength){
        length=newLength;
    }
    public String getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public Boolean getMale(){
        return male;
    }
    public String getLifeStage(){
        return lifeStage;
    }
    public Double getLength(){
        return length;
    }
    public String toString(){
        return "        ID: "+ID+"\n"+
                "      Name: "+name+"\n"+
                "      Type: "+type+"\n"+
                "     Male?: "+male+"\n"+
                "Life Stage: "+lifeStage+"\n"+
                "   Length : "+length+"\n";
    }
}