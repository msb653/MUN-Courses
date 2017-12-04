//CampTester Class (Includes main method)
public class CampTester{
  //CampTester Main Method
  public static void main(String[]args){
    Campsite [] CampsiteArray=new Campsite[13];
    CampsiteArray[0]=new Campsite("Terra Nova National Park", "Newfoundland and Labrador", 30.00);   
    CampsiteArray[1]=new Campsite("Gros Morne National Park", "Newfoundland and Labrador", 45.00);
    CampsiteArray[2]=new BackCountry("Terra Nova National Park", "Newfoundland and Labrador", 30.00, "Location A", "hike");
    CampsiteArray[3]=new BackCountry("Terra Nova National Park", "Newfoundland and Labrador", 30.00, "Location B", "canoe");
    CampsiteArray[4]=new BackCountry("Gros Morne National Park", "Newfoundland and Labrador", 45.00, "Location C", "hike");
    CampsiteArray[5]=new BackCountry("Gros Morne National Park", "Newfoundland and Labrador", 45.00, "Location D", "boat");
    CampsiteArray[6]=new FrontCountry("Terra Nova National Park", "Newfoundland and Labrador", 30.00, "Newman Sound", 1, true);
    CampsiteArray[7]=new FrontCountry("Terra Nova National Park", "Newfoundland and Labrador", 30.00, "Malady Head", 2, false);
    CampsiteArray[8]=new FrontCountry("Gros Morne National Park", "Newfoundland and Labrador", 45.00, "Norris Point", 1, true);
    CampsiteArray[9]=new Serviced("Terra Nova National Park", "Newfoundland and Labrador", 30.00, "Newman Sound", 1, true,30,true);
    CampsiteArray[10]=new Serviced("Terra Nova National Park", "Newfoundland and Labrador", 30.00, "Newman Sound", 1, true,15,false);
    CampsiteArray[11]=new Serviced("Terra Nova National Park", "Newfoundland and Labrador", 30.00, "Malady Head", 2, false,50,false);
    CampsiteArray[12]=new Unserviced("Gros Morne National Park", "Newfoundland and Labrador", 45.00, "Norris Point", 1, true, true);
    statistics(CampsiteArray);
  }
  //CampTester statistics method
  public static void statistics (Campsite [] temp){
    int count=0;
    //Printing attribute values for each object
    for (int i=0; i<13;i++){
      System.out.println(temp[i].toString());
      System.out.println();
    }
    //Calculating number of FrontCountry sites in Terra Nova
    for (int j=0; j<13; j++){
      if (temp[j].getParkName().equals("Terra Nova National Park")){
     	 if (temp[j] instanceof FrontCountry)
        	count=count+1;
     	 if (temp[j] instanceof Serviced)
       		count=count-1;
     	 if (temp[j] instanceof Unserviced)
       	    count=count-1;
      }
    }
    System.out.println("Number of front country sites in Terra Nova National Park: "+count);
    count=0;
    //Calculating the number of serviced sites with 30 amp service in Newman Sound
    for (int k=0; k<13; k++){
      if (temp[k].getParkName().equals("Terra Nova National Park")){
        if (temp[k] instanceof FrontCountry)
          if (((FrontCountry)temp[k]).getCGName()=="Newman Sound")
            if (temp[k] instanceof Serviced)
              if (((Serviced)temp[k]).getAMPService()==30)
                count=count+1;
      }
    }
    System.out.println();
    System.out.println("Number of serviced sites (with 30 amp service) in Newman Sound: "+count);
    System.out.println();
    //Listing BackCountry site locations in Gros Morne
    System.out.println("List of all back country site locations in Gros Morne: ");
    for (int l=0; l<13; l++){
      if (temp[l].getParkName().equals("Gros Morne National Park"))
        if (temp[l] instanceof BackCountry)
          System.out.println("-"+((BackCountry)temp[l]).getLocation());
    } 
    //List all the unserviced sites in Malady Head
    System.out.println();
    System.out.println("List of all unserviced sites in Malady Head (by site number): ");
    for (int m=0; m<13; m++){
      if (temp[m].getParkName().equals("Terra Nova National Park"))
        if (temp[m] instanceof Unserviced)
        System.out.println("-"+((FrontCountry)temp[m]).getSiteNumber());
    
      
    }
  }
}