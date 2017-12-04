public class Trailer implements Comparable<Trailer>{
    //Declaring variables
    String name;
    String phoneNumber;
    String licensePlate;
    int trailerLength; //In feet
    int buildingNumber; //1,2,3 or 4
    String startDate;
    String endDate;
    
    //Contructor
    public Trailer(String n, String pN, String lP, int tL, int bN, String sD, String eD)
    {
        name=n;
        phoneNumber=pN;
        licensePlate=lP;
        trailerLength=tL;
        buildingNumber=bN;
        startDate=sD;
        endDate=eD;
    }
    
    //Accessors
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getLicensePlate(){
        return licensePlate;
    }
    public int getTrailerLength(){
        return trailerLength;
    }
    public int getBuildingNumber(){
        return buildingNumber;
    }
    public String getStartDate(){
        return startDate;
    }
    public String getEndDate(){
        return endDate;
    }

    //Mutators
    public void setName(String newName){
        name=newName;
    }
    public void setPhoneNumber(String newPhoneNumber){
        phoneNumber=newPhoneNumber;
    }
    public void setLicensePlate(String newLicensePlate){
        licensePlate=newLicensePlate;
    }
    public void setTrailerLength(int newTrailerLength){
        trailerLength=newTrailerLength;
    }
    public void setBuildingNumber(int newBuildingNumber){
        buildingNumber=newBuildingNumber;
    }
    public void setStartDate(String newStartDate){
        startDate=newStartDate;
    }
    public void setEndDate(String newEndDate){
        endDate=newEndDate;
    }

    //Seasonal storage cost method
    public double costOfStorage(){
        double cost=(trailerLength*30)*1.15;
        return cost;
    }
    
    //toString method
    public String toString(){
        return "               Name: "+name+"\n"+
                "      Phone Number : "+phoneNumber+"\n"+
                "      License Plate: "+licensePlate+"\n"+
                "     Trailer Length: "+trailerLength+"\n"+
                "    Building Number: "+buildingNumber+"\n"+
                "         Start Date: "+startDate+"\n"+
                "          End Date : "+endDate;
    }
    
    //Override
    public int compareTo(Trailer o) {
        return toString().compareTo(o.toString());
    }
}