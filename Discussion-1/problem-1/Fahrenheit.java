import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celcious temp:");
        double celcious = sc.nextDouble();

        double Fahrenheit = ((9*celcious)/5) + 32;
        System.out.println("Celcious to Fahrenheit = " +Fahrenheit);

        sc.close();

    }
}