import java.util.*;
public class Questions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[6][6];
        int i,j,r,c;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                a[i][j]=sc.nextInt(); //input matrix
                if(a[i][j]==1){
                    r=Math.abs(3-i); //abs difference from center for rows
                    c=Math.abs(3-j); //abs difference from center for columns
                    System.out.println(r+c); //sum of the moves required and printing it
                }
            }
        }
    }
}
