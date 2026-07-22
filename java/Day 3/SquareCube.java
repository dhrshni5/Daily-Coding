import java.util.Scanner;
public class SquareCube{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int x=sc.nextInt();
        System.out.println("Square:"+(x*x));
        System.out.println("Cube:"+(x*x*x));
    }
}