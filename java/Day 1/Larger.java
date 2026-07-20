import java.util.Scanner;
public class Larger {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a=sc.nextInt(),b=sc.nextInt();
        if(a>b){
            System.out.println(a+" is larger");
        }else{
            System.out.println(b+" is larger");
        }
    }
}
