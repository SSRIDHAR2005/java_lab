import java.util.*;
class lcm {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two nos:");
        int a = in.nextInt();
        int b = in.nextInt();

        // Checking for the largest
        // Number between them
        int ans = (a > b) ? a : b;

        // Checking for a smallest number that
        // can de divided by both numbers
        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }

        // Printing the Result
        System.out.println("LCM of " + a + " and " + b
                           + " : " + ans);
    }
}