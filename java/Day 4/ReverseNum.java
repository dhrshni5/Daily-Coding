import java.util.Scanner;
public class ReverseNum {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    int reverse=0;
    while(n>0){
        int digit=n%10;
        n=n/10;
        reverse=(reverse*10)+digit;

    }
    System.out.println("Reverse: "+reverse);
    }
}
