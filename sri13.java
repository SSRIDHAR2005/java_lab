import java.util.StringTokenizer;
class sri13
{
public static void main(String[]args)
{
StringTokenizer st=new StringTokenizer("Demonstrating methos from StringTokenizer class is was that those given hair water dhoni kholi","");
while(st.hasMoreElements())
{
System.out.println("Next token is:"+st.nextToken(","));
}
}
}
