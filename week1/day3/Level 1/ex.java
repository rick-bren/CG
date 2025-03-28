public class ex {
    public static void main(String[] args) {
	    int i;
		for (i=-2; i>=-5; i+=3) {
		    System.out.println(i);
			if (i--==-2){
			    continue;
			}
			if (i-->3) {
			    break;
			}
			System.out.println(i);
		}
	}
}