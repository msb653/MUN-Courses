import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class TrailerTester{
    public static void main(String[]args) throws FileNotFoundException{
            Scanner input=new Scanner(new File("TrailerInfo.txt"));
            Scanner in=new Scanner(System.in);
            input.useDelimiter("-|\n");
            
            //Array creation
            Trailer [] TrailerArray=new Trailer[10];
            
            //Variable Initialization
            int smallest=0;
            int n;
            int i=0;
            int first=0;
            int last=9;
            int mid;
            boolean found=false;
            String tName;
            String tNumber;
            String tPlate;
            int tLength;
            int tBuilding;
            String tStart;
            String tEnd;
            Trailer tTrailer;
            
            //Array assignment from text file
            while(input.hasNext()) {
                String name=input.next();
                String number=input.next();
                String plate=input.next();
                int length=input.nextInt();
                int building=input.nextInt();
                String start=input.next();
                String end=input.next();
                Trailer newTrailer= new Trailer(name, number, plate, length, building, start, end);
                TrailerArray [i]=newTrailer;
                i++;
            }
            
            //Displaying unsorted array of trailer info
            System.out.println("");
            System.out.println("");
            System.out.println("Unsorted list of trailer information:");
            System.out.println("");
            for(int j=0; j<10;j++){
                System.out.println(TrailerArray[j].toString());
                System.out.println(" ");
            }
            
            //Displaying array sorted alphabetically by owner name (Selection sort)
            System.out.println("");
            System.out.println("");
            System.out.println("List sorted alphabetically by owner name:");
            System.out.println("");
            for (int k=0; k<10; k++){
                for (int l=k+1; l<10; l++ ){
                    if (TrailerArray[k].getName().compareTo(TrailerArray[l].getName())>0){
                        tName=TrailerArray[k].getName();
                        tNumber=TrailerArray[k].getPhoneNumber();
                        tPlate=TrailerArray[k].getLicensePlate();
                        tLength=TrailerArray[k].getTrailerLength();
                        tBuilding=TrailerArray[k].getBuildingNumber();
                        tStart=TrailerArray[k].getStartDate();
                        tEnd=TrailerArray[k].getEndDate();
                        tTrailer=new Trailer(tName,tNumber,tPlate,tLength,tBuilding,tStart,tEnd);
                        TrailerArray[k]=TrailerArray[l];
                        TrailerArray[l]=tTrailer;
                    }
                }
            }
            for(int j=0; j<10;j++){
                System.out.println(TrailerArray[j].toString());
                System.out.println(" ");
            }
            
                        
            
            
            //Using binary search to search for trailers owned by specific people
            
            //Testing with a name in the array
            System.out.println("");
            System.out.println("");
            System.out.println("Searching for 'Jerry' (Should return result): ");
            System.out.println("");
            tName="Jerry";
            while (!found && first<=last){
                mid=(first+last)/2;
                if (TrailerArray[mid].getName().compareTo(tName)==0){
                    found=true;
                    System.out.println(TrailerArray[mid].toString());    
                }
                else if (TrailerArray[mid].getName().compareTo(tName)<0)
                    first=mid+1;
                else
                    last=mid-1;
            }
            if (found==false)
                System.out.println("The name "+tName+" was not found.");  
  
            //Testing with a name not in the array
            found=false;
            System.out.println("");
            System.out.println("");
            System.out.println("Searching for 'Jessia' (Shouldn't return a result): ");
            System.out.println("");
            tName="Jessica";
            while (!found && first<=last){
                mid=(first+last)/2;
                if (TrailerArray[mid].getName().compareTo(tName)==0){
                    found=true;
                    System.out.println(TrailerArray[mid].toString());    
                }
                else if (TrailerArray[mid].getName().compareTo(tName)<0)
                    first=mid+1;
                else
                    last=mid-1;
            }
            if (found==false)
                System.out.println("The name "+tName+" was not found.");  
            
 
    
            
            //Displaying array sorted by building number (Insertion sort)
            System.out.println("");
            System.out.println("");
            System.out.println("List sorted numerically by building number:");
            System.out.println("");
            for (int m=1; m<10; m++){
                tTrailer=TrailerArray[m];
                n=m;
                while((n>0)&&(TrailerArray[n-1].getBuildingNumber()>tTrailer.getBuildingNumber())){
                    TrailerArray[n]=TrailerArray[n-1];
                    n--;
                }
                TrailerArray[n]=tTrailer;

            }
            for(int j=0; j<10;j++){
                System.out.println(TrailerArray[j].toString());
                System.out.println(" ");
            }

    }           
}