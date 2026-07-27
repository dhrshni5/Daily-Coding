import java.util.Scanner;
public class Vowel{
    public static void main(String args[]){
        char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        for (char i:vowels){
            if(ch == i){
                System.out.println("Vowel");
                break;
            }else{
                System.out.println("Consonant");
                break;
            }
        }
    }
}