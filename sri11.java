import java.util.StringTokenizer;
class sri11
{
public static void main(String[]args)
{
StringTokenizer st=new StringTokenizer("Ronaldo is the GOAT","");
while(st.hasMoreTokens())
{
System.out.println("Next token is:"+st.nextToken(","));
}
}
}
