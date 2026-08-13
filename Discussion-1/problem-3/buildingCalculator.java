import java.util.Scanner;
class buildingCalculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char ch = sc.next().charAt(0);
        if(ch == '+'){
            System.out.println(a+b);
        }
        else if(ch=='-'){
            System.out.println(a-b);
        }
        else if(ch == '*'){
            System.out.println(a*b);
        }
        else if(ch == '/'){
            if(b!=0){
                System.out.println(a/b);
            }
            else{
                System.out.println("Division by Zero is not allowed");
            }
        }
        else{
            System.out.println("Invalid Operator");
        }
        sc.close();
    }
}