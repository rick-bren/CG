public class Pen{
	public static void main(String[] args){
		int pen = 14;
		int students = 3;
		int PenPerStudent = pen/students;
		int RemainingPen = pen%students;
		System.out.print("The Pen Per Student is "+ PenPerStudent + " and the remaining pen not distributed is " + RemainingPen);
	}
}