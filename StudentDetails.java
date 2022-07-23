import java.util.Scanner;
class StudentDetails
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name : ");
        String a=sc.next();
        System.out.println("Enter the Id: ");
        int b=sc.nextInt();
        System.out.println("Enter the gender : ");
        char c=sc.next().charAt(0);
        System.out.println("Enter the ph.no : ");
        String d=sc.next();
        System.out.println("Enter the address : ");
        String e=sc.next();
        System.out.println("Enter the college name : ");
        String f=sc.next();
        System.out.println("Enter the branch : ");
        String g=sc.next();
        System.out.println("all details of stundent are : ");
        System.out.println("name " + a);
        System.out.println("Id " + b);
        System.out.println("gender " + c);
        System.out.println("ph.no " + d);
        System.out.println("address " + e);
        System.out.println("college " + f);
        System.out.println("branch " + g);
    }
}   
    
    

             