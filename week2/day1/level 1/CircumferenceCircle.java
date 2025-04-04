import java.util.Scanner;

public class CircumferenceCircle {
    public double radius;
    CircumferenceCircle (double radius) {
        this.radius = radius;
    }
    public void display(){
        double Cir=2*3.14*radius;

        System.out.println("Circumference of Circle: "+Cir);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        CircumferenceCircle c = new CircumferenceCircle(radius);
        c.display();
        sc.close();
    }
}
