class sri9
{
    public static void main(String[]args)

    {
        StringBuffer sb=new StringBuffer("hello");
        System.out.println(sb.capacity());
        sb.append("hello");
        System.out.println(sb.capacity());
        sb.append("java is a good program");
        System.out.println(sb.capacity());
    }
}