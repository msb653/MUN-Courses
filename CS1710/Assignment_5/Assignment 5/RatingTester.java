public class RatingTester{
    public static void main(String[]args){
        ScienceProjectRating p1=new ScienceProjectRating("Atmosphere","Ryan", 9,7,8,8);
        ScienceProjectRating p2=new ScienceProjectRating("Mars","Steve", 6,7,4,6);
        ScienceProjectRating p3=new ScienceProjectRating("Oceans","Amy", 10,7,9,8);
        System.out.println("Number of 1-star projects: "+p1.getCount1());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}