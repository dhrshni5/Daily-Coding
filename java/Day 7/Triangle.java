public class Triangle {
    public static void main(String args[]){
    for(int i=1;i<5;i++){
        System.out.print("  ".repeat(5-i));
        System.out.println("* ".repeat(2*i-1));
    }
    }
}
