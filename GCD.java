//Write a program to calculate GCD of Given Two Numbers.


import java.util.Scanner;
class GCD
{

    public  static int gcd(int a,int b)
    {
       if(b==0)
         return a;
       else
          return gcd(b,a%b);  
       
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the Second number: ");  
        int num2=sc.nextInt();
        System.out.println(" GCD OF Two numbers: " +gcd(num1,num2));

    }
}
