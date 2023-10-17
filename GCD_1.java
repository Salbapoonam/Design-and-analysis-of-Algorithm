//Write a program to calculate GCD of Given Two Numbers.


import java.util.Scanner;
public class GCD_1 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int g=0;
        int min=0;
        if(a<b){
            min=a;
        }
        else{
            min=b;
        }
        for(int i=1; i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            {
                g=i;
            }
        }
        System.out.println("GCD = "+g);


    
    }
}
