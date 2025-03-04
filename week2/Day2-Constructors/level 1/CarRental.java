public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    int Rate=100;

    public CarRental(String customerName, String carModel, int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
    }
    
    public double rentalCost(){
        return rentalDays*Rate;
    }

    void display() {
        System.out.println("Custome Name: "+customerName);
        System.out.println("Model: "+carModel);
        System.out.println("Days of rental: "+rentalDays);
        System.out.println("Total Cost: "+rentalCost());
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Adhi","SUV",5);
        cr.display();
    }
    
}
