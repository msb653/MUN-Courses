import java.util.Scanner;
public class ElementaryMath {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int response;
        int sum;
        int difference;
        int correct=0;
        int level;
        int questions;
        String type;
            System.out.println("Do you wish to practice addition or subtraction?");
            type=in.next();
            if (type.equals("addition") || type.equals("subtraction"))
               System.out.println();
            else{
                System.out.println("Invalid input.");
                System.exit(0);
            }  
            System.out.println("Which difficulty level do you wish to practice? (1, 2 or 3)");
            level=in.nextInt();
            if (level==1 || level==2 || level==3)
               System.out.println();
            else{
                System.out.println("Invalid input.");
                System.exit(0);
            } 
            System.out.println("How many questions do you wish to practice?");
            questions=in.nextInt();  
            if (type.equals("addition")){
                if (level==1){
                    for (int i=1;i<=questions;i++){
                        int x=random1();
                        int y=random1();
                        sum=x+y;
                        System.out.println("What is "+x+" + "+y+" ?");
                        response=in.nextInt();
                        if (response==sum)
                            correct++;
                        
                    }
                }
                if (level==2){
                    for (int i=1;i<=questions;i++){
                        int x=random2();
                        int y=random2();
                        sum=x+y;
                        System.out.println("What is "+x+" + "+y+" ?");
                        response=in.nextInt();
                        if (response==sum)
                            correct++;
                        
                    }
                }
                if (level==3){
                    for (int i=1;i<=questions;i++){
                        int x=random3();
                        int y=random3();
                        sum=x+y;
                        System.out.println("What is "+x+" + "+y+" ?");
                        response=in.nextInt();
                        if (response==sum)
                            correct++;
                        
                    }
                }
            }
            if (type.equals("subtraction")){
                if (level==1){
                    for (int i=1; i<=questions;i++){
                        int x=random1();
                        int y=random1();
                        while (y>x){
                            y=random1();
                        }
                       difference=x-y;
                        System.out.print("What is "+x+" - "+y+" ?");
                        response=in.nextInt();
                        if (response==difference)
                            correct++;
                    }
                }
                if (level==2){
                    for (int i=1; i<=questions;i++){
                        int x=random2();
                        int y=random2();
                        while (y>x){
                            y=random2();
                        }
                       difference=x-y;
                        System.out.print("What is "+x+" - "+y+" ?");
                        response=in.nextInt();
                        if (response==difference)
                            correct++;
                    }
                }
                if (level==3){
                    for (int i=1; i<=questions;i++){
                        int x=random3();
                        int y=random3();
                        while (y>x){
                            y=random3();
                        }
                       difference=x-y;
                        System.out.print("What is "+x+" - "+y+" ?");
                        response=in.nextInt();
                        if (response==difference)
                            correct++;
                    }
                }
                
            }
            System.out.print("You got "+correct+" out of "+questions+" questions right!");
    }
    public static int random1(){
        int random = 0 + (int)(Math.random() * ((9 - 0) + 1));
        return random;
    }
    public static int random2(){
        int random = 10 + (int)(Math.random() * ((99 - 10) + 1));
        return random;
    }
    public static int random3(){
        int random = 100 + (int)(Math.random() * ((999 - 100) + 1));
        return random;
    }
}
