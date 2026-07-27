import java.util.Scanner;
public class SumDigit{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    int sum=0;
    while(n>0){
        int digit=n%10;
        n=n/10;
        sum+=digit;

    }
    System.out.println("Sum: "+sum);
    }
}