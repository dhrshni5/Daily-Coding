import java.util.Scanner;
public class Multiple7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a nummber:");
        int n=sc.nextInt();
        if(n%7==0){
            System.out.println("Multiple of 7");
        }else{
            System.out.println("Not a multiple 7");
        }
    }
}
