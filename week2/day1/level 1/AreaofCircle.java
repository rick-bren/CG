import java.util.Scanner;

public class AreaofCircle {
    public static double calcarea(double radius){
        return 3.14*radius*radius ;
    }
    public static void displayarea(double area) {
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double area = calcarea(radius);
        displayarea(area);
        sc.close();
    }
}
