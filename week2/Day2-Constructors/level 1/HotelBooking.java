import java.util.Scanner;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking(){
        guestName="Unknown";
        roomType="Unknown";        
        nights=0;        
    }
    
    public HotelBooking(String guestName, String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }

    public HotelBooking(HotelBooking previousGuest){
        this.guestName=previousGuest.guestName;
        this.roomType=previousGuest.roomType; 
        this.nights=previousGuest.nights;
    }
    void display(){
        System.out.println("Guest Name: "+guestName);
        System.out.println("Room Type: "+roomType);
        System.out.println("No.of Nights: "+nights);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String room = sc.nextLine();
        int night = sc.nextInt();
        HotelBooking def = new HotelBooking();
        HotelBooking para = new HotelBooking(name,room,night);
        HotelBooking copy = new HotelBooking(para);
        def.display();
        para.display();
        copy.display();
        sc.close();
    }    
}
