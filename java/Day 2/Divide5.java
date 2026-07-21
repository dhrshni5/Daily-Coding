import java.util.Scanner;
public class Divide5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a nummber:");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("Divided by 5");
        }else{
            System.out.println("Not divided by 5");
        }
    }
}
