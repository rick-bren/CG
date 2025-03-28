public class Main {
    public static void main(String[] args) {
        int a = -20;
        int b = -8;
        double c = ((double) a+ (double) b)/2;
        if (c<0 && (c*10)%10!=0){
            System.out.print((int)(c-0.5));
        }else{
            System.out.print((int)c);
        }
	}
}