import java.util.*;
public class arm {
    static int count(int n)
    {
        int c=0;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        return c;

    }
    static boolean isarm(int n)
    {
        int temp=n;
        int c1=count(n);
        // System.out.println(c1);
        int s=0;
        int last;
        while(temp!=0)
        {
            last=temp%10;
            s=s+(int)Math.pow(last,c1);
            temp=temp/10;
        }
        if(n==s)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i;
        System.out.println("Enter range x and y");
        int x=in.nextInt();
        int y=in.nextInt();
        System.out.println("Armstrong Numbers are:");
        for(i=x;i<=y;i++)
        {
            if(isarm(i))
            {
                System.out.println(i);

            }
        }
    }
}
            