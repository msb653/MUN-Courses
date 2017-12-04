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
            int i=0;
            int count=0;
            int countOne=0;
            int countTwo=0;
            int countThree=0;
            int countFour=0;
            double totalIncome=0;
            String dateCheck;
            String temp;
            String temp2;
            String temp3;
            String condition="Y";
            
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
            //Sorting Array
            Arrays.sort(TrailerArray);
            
            //Displaying trailer info
            for(int j=0; j<10;j++){
                System.out.println(TrailerArray[j].toString());
                System.out.print("     Seasonal Cost: $");
                System.out.println( String.format( "%.2f", TrailerArray[j].costOfStorage( )));
                System.out.println(" ");
            }
            
            //Finding number of trailers over 30 feet
            for(int k=0; k<10; k++ ){
                if (TrailerArray[k].getTrailerLength()>30)
                    count=count+1;
            }
            System.out.println(" Trailers over 30 feet: "+count);
            
            //Finding number of trailers in each building
            for(int l=0; l<10;l++){
                if (TrailerArray[l].getBuildingNumber()==1)
                    countOne=countOne+1;
                if (TrailerArray[l].getBuildingNumber()==2)
                    countTwo=countTwo+1;
                if (TrailerArray[l].getBuildingNumber()==3)
                    countThree=countThree+1;
                if (TrailerArray[l].getBuildingNumber()==4)
                    countFour=countFour+1;                 
            }
            System.out.println("Trailers in building 1: "+countOne);
            System.out.println("Trailers in building 2: "+countTwo);
            System.out.println("Trailers in building 3: "+countThree);
            System.out.println("Trailers in building 4: "+countFour);
            
            //Calculating total income
            for(int m=0;m<10;m++){
                totalIncome=totalIncome+TrailerArray[m].costOfStorage();    
            }
            System.out.println("Total income from all trailers: $"+totalIncome);
            
            
            //Can't get java to compare the string input to the returned string from getEndDate
            //so this section doesn't work properly
            while (condition.equals("Y")){
                System.out.println("Enter a date to check for trailer removals (25/03/16 format): ");
                dateCheck=in.nextLine();
                System.out.print("");
                System.out.println("  ");
                System.out.println("Trailers being removed on "+dateCheck+":");
                for (int z=0;z<10;z++){
                    if (dateCheck.equals(TrailerArray[z].getEndDate()))
                        System.out.println(TrailerArray[z].toString());
                }
                System.out.println();
                System.out.println("Do you want to enter another date? (Y/N): ");
                condition=in.nextLine();
            }

       


            
            
           
        
    }
            
}
                                                          