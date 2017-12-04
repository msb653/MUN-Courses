import java.util.Scanner;
public class CodeDigits {
    public static void main( String[] args ) {
    Scanner in=new Scanner(System.in);
    System.out.print("How many codes do you want to enter?: ");
    int n=in.nextInt();
    String str1="1";
    String str2="2";
    String str3="0";
    int count=1;
    while (count<=n){
        System.out.print("Enter a code: ");
        String list=in.next();
        String str4="";   
        int len=list.length();
        int a=0;
        int b=1;
            while (b<=len){
                if (str1.equals(list.substring(a,b)))
                    str4=str4+str1;
                if (str2.equals(list.substring(a,b)))
                    str4=str4+str2;
                if (str3.equals(list.substring(a,b)))
                    str4=str4+str3;
                a=a+1;
                b=b+1;}
        System.out.println(list+" has the following digits: "+str4);
        count=count+1;
       }
    }
}