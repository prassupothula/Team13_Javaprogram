import java.util.Scanner;
public class PrimeNumber 
{
    public static void main(String args[])
    {
        int i,count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(i=1;i<=n;i++) 
        {
            if (n%i == 0) 
            {
                count++;
            }
        }
        if (count == 2)
        {
            System.out.println("It is a prime number");
        }
        else 
        {
            System.out.println("It is not a prime number");
        }
    }
}