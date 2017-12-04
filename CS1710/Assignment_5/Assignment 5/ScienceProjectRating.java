public class ScienceProjectRating{
    String title;
    String presenter;
    int innovative;
    int creative;
    int research;
    int independent;
    double average;
    int star;
    private static int count1=0;
    private static int count2=0;
    private static int count3=0;
    private static int count4=0;
    public ScienceProjectRating(String pTitle, String pPresenter, int pInnovative,int pCreative, int pResearch, int pIndependent){
        title=pTitle;
        presenter=pPresenter;
        innovative=pInnovative;
        creative=pCreative;
        research=pResearch;
        independent=pIndependent;
        average=average(innovative,creative,research,independent);
        star=star(average);
        if (star==1)
            count1++;
        if (star==2)
            count2++;
        if(star==3)
            count3++;
        if (star==4)
            count4++;
        
        
        
    }
    public String getTitle(){
    return title;
    }
    public String getPresenter(){
        return presenter;
    }
    public int getInnovative(){
        return innovative;
    }
    public int getCreative(){
        return creative;
    }
    public int getResearch(){
        return research;
    }
    public int getIndependent(){
        return independent;
    }
    public int getCount1(){
        return count1;
    }
    public int getCount2(){
        return count2;
    }
    public int getCount3(){
        return count3;
    }
    public int getCount4(){
        return count4;
    }
    public static double average(int a, int b, int c, int d){
        double x=a+b+c+d;
        double average=x/4.0;
        average=(double)Math.round(average*10)/10.0;
        return average;
        
    }
    public static int star(double a){
        int x;
        if (a>=8)
            x=1;
        else if (a<8 && a>=6.5)
            x=2;
        else if(a<6.5 && a>=5.5)
            x=3;
        else
            x=4;
        return x;
        
    }
    public String toString(){
        return         "Title: "+title+"\n"+
                "   Presenter: "+presenter+"\n"+
                "  Innovative: "+innovative+"\n"+
                "    Creative: "+creative+"\n"+
                "    Research: "+research+"\n"+
                " Independent: "+independent+"\n"+
                "     Average: "+average+"\n"+
                "        Star: "+star+"\n";     
    }
        
    }
    