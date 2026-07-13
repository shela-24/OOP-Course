import java.util.Scanner;
public class BallVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius, volume;

        System.out.print("Enter radius:");
        radius = sc.nextDouble();

        volume = (4.0/3.0)* Math.PI * Math.pow(radius,3);

        System.out.println("Volume of Ball = " + volume);

        sc.close();
    }
}
