import java.util.*;
public class box {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int i;
        
        int n=8;
        int m=22;
        for(i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0||j==0||i==n-1||j==m-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
