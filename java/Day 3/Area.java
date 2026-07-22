import java.util.Scanner;

public class Area {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        double r=sc.nextDouble();
        double area=Math.PI * r * r;
        System.out.println("Area of circle: "+area);
        System.out.println("Enter base of triangle:");
        double b=sc.nextDouble();
        System.out.println("Enter height of triangle:");
        double h=sc.nextDouble();
        double area1=(0.5)*b*h;
        System.out.println("Area of triangle:"+area1);
    }
}
