public class Assignment4{
  
  //main method
  public static void main(String[]args){
    
    //String initialization and output
    String string1="Hello!";
    System.out.println("Original String:");
    System.out.println(string1);
    System.out.println("");
    
    //Recursive reverse and output
    String string2=reverse(string1);
    System.out.println("Reversed String (Recursive): ");
    System.out.println(string2);
    System.out.println("");
    
    //Iterative reverse and output
    String string3=reverse2(string1);
    System.out.println("Reversed String (Iterative): ");
    System.out.println(string3);
    System.out.println("");
    
    //Integer base changer test
    System.out.println("55 written as a base 2 number (110111 expected):");
    System.out.println(baseChange(55,2));
    System.out.println("");
    System.out.println("12,974 written as a base 9 number (18715 expected):");
    System.out.println(baseChange(12974,9));
    System.out.println("");
    System.out.println("162,341 written as a base 16 number (27A25 expected):");
    System.out.println(baseChange(162341,16));
    System.out.println("");
    
    //Reverse string check test
    System.out.println("Comparing 'piano' to the reverse of 'onaip' (True expected):");
    System.out.println(isStringReversed("piano","onaip"));
    System.out.println("");
    System.out.println("Comparing 'a' to the reverse of 'a' (True expected):");
    System.out.println(isStringReversed("a","a"));
    System.out.println("");
    System.out.println("Comparing 'Dog' to the reverse of 'taC' (False Expected):");
    System.out.println(isStringReversed("Dog", "taC"));
    System.out.println("");
    System.out.println("Comparing two null string (True expected):");
    System.out.println(isStringReversed("",""));
  }
  
  //recursive method for reversing string
  public static String reverse (String s1){
    if(s1.length()==0)
      return s1;
    else
      return reverse(s1.substring(1))+s1.charAt(0);
  }
  
  //iterative method for reversing string 
  public static String reverse2(String s1){
    String s2="";
    for (int i=s1.length(); i>0; i--){
      s2=s2+s1.charAt(i-1);
    }
    return s2;
  }
  
  //method for converting form base 10 to base "b"
  public static String baseChange(int a, int b){
    String temp="";
    
    //Sets a result of 10-16 to A-G respectively
    if(a%b<10)
      temp=temp+a%b;
    else if(a%b==10)
      temp=temp+"A";
    else if(a%b==11)
      temp=temp+"B";
    else if(a%b==12)
      temp=temp+"C";
    else if(a%b==13)
      temp=temp+"D";
    else if(a%b==14)
      temp=temp+"E";
    else if(a%b==15)
      temp=temp+"F";
    else if(a%b==16)
      temp=temp+"G";
    
   //If else condition that makes recursive call and returns result 
    if (a==0)
      return "";
    else
      return baseChange(a/b, b)+temp;  
  }  
  
  
    //Method to see if one string is another string reversed
  public static Boolean isStringReversed(String s1, String s2){
      boolean temp;
      if (s1.length()==0 && s2.length()==0)
          return true;
      if(s1.length()!=s2.length())
          return false;
      else{
          temp=(s1.charAt(s1.length()-1)==s2.charAt(0));
          isStringReversed(s1.substring(0,s1.length()-1),s2.substring(1));
          return temp;
      }
      
  }
  
}