import java.util.Scanner;

public class Program_2 {
    public static void generateOddNum(int a) {
        int num = 1;
       
        for (int i = 0; i < a; i++) {
            System.out.print(num + " ");
            num += 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter:");
        int n=sc.nextInt();
        generateOddNum(n);
    }
}
