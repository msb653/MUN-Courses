public class NestedLoops {
    public static void main (String[] args) {
        int[][] twoD=new int [5][5];
        for (int i=0;i<twoD.length;i++ ){
            for (int j=0;j<twoD[i].length;j++){
                if (i==j){
                    twoD[i][j]=0;
                }
                if (i>j){
                    twoD[i][j]=2;
                }
                if (j>i){
                    twoD[i][j]=1; 
                }
                System.out.print(twoD[i][j]+" | ") ;   
            }
             System.out.println();      
        }

    }
}