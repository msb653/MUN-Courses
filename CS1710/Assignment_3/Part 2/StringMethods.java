import java.util.Scanner;
public class StringMethods {
    public static void main (String[]args){
        Scanner in=new Scanner (System.in);
        String loopControl="y";
        while("y".equals(loopControl)){
            String str1=in.next();
            if (str1.length()>=4){
                System.out.println("Given word: "+str1);
                second(str1);
                String noVowels=removeVowels(str1);
                System.out.println("Word with lowercase vowels removed: "+noVowels);
                String mid=findMidChar(str1);
                System.out.println("Middle character(s) of the word: "+mid);
                String scramble=scramble(str1);
                System.out.println("Scrambled word: "+scramble);
                System.out.println();
            }
            System.out.println("Do you want to enter another word? y/n:");
            loopControl=in.next();
        }
    }
    public static void second(String str1){
        System.out.print("Word with first and every second charater: ");
        for (int i=0; i<str1.length();i=i+2){
            System.out.print(str1.charAt(i));       
        }
        System.out.println();
    }
    public static String removeVowels(String str1){
        str1=str1.replaceAll("[aeiou]","_");
        return str1;     
    }
    public static String findMidChar(String str1){
        String mid;
        if(str1.length()%2==0){
            int x=str1.length()/2-1;
            int y=x+2;
             mid=str1.substring(x,y);
        }
        else{
            int x=str1.length()/2;
             mid=str1.substring(x,x+1);
        }
        return mid;      
    } 
    public static String scramble(String str1){
       String str2=str1.substring(1,2);
       int x=str1.length();
       String str3=str1.substring(x-2,x-1);
       String str4=str1.substring(0,1)+str3+str1.substring(2,x-2)+str2+str1.substring(x-1);
       return str4;
    }
}
