import java.util.Scanner;

class oddOreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Enter number:");
        N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println("It's Even");
        } else {
            System.out.println("It's Odd");
        }
        sc.close();
    }
}