import java.util.Scanner;

class Leapyear {
    public static void main(String[]agrs){

        Scanner sc= new Scanner(System.in);
        int year;

        System.out.print("Enter Year: ");
        year = sc.nextInt();

        if(year % 400 == 0 ||( year % 4 == 0 && year % 100 !=0) ){
            System.out.println("It's Leap Year ");
        }

        else{
            System.out.println("It's not Leap year");
        }

        sc.close();
    }
}
