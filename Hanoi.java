import java.util.Scanner;
public class Hanoi{

    public static void towerOfHanoi(int n, char source, char auxiliary,char target)
    {
         // Base case: If there is only one disk to move, move it from the source to the target.
        
        if(n==1)
        {
            System.out.println("Move disk 1 from "+ source + "to " + target);
            return;
        }

        // Move n-1 disks from the source to the auxiliary peg using the target peg as an auxiliary.
        towerOfHanoi(n-1, source,  target, auxiliary);


        // move the n th disk from source to the target peg

        System.out.println("Move disk  "+ n + " from " + source + " to" + target);


          // Move the n-1 disks from the auxiliary peg to the target peg using the source peg as an auxiliar
         towerOfHanoi(n-1, source,  target, auxiliary);


    }
    public static void main(String[] args)
    {
        // int n =4;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();
        scanner.close();
        
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}