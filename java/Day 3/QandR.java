import java.util.Scanner;
public class QandR {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Quotient:"+x/y);
        System.out.println("Remainder:"+x%y);
    }
}
