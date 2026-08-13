import java.util.Scanner;

class gradeCalculate{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        double n;
        n = sc.nextDouble();
        if(n<0 || n>100){
            System.out.println(" Invalid number ");
        }
        else if (n>39 && n < 60){
            System.out.println("Grade : C+ ");
        }
        else if(n>59 && n<70){
            System.out.println("Grade : B ");
        }
         else if(n>69 && n<80){
            System.out.println("Grade : A- ");
        }
        else if(n>79 && n<90){
            System.out.println("Grade : A ");
        }
        else if(n>=90){
            System.out.println("Grade : A+ ");
        }
        else {
            System.out.println("Grade : F ");
        }
        sc.close();
    }
}
