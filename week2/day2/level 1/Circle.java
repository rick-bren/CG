class Circle {
    double radius;
    double area;
    double cir;

    public Circle() {
        radius = 5;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getarea() {
        return Math.PI*radius*radius; 
    }
    public double getcir() {
        return 2*Math.PI*radius; 
    }
    public void display(){
        System.out.println("Circle Details:");
        System.out.println("Enter radius: "+radius);
        System.out.println("Area: "+getarea());
        System.out.println("Circumference: "+getcir());
    }
    public static void main(String[] args) {
        Circle def = new Circle();
        def.display();
        Circle notdef = new Circle(10);
        notdef.display();
    }
}
