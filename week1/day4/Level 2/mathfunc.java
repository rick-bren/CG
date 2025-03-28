import java.util.Arrays;

public class mathfunc {
    public int[] generate4DigitRandomArray(int size) {
		int [] numbers = new int[size];
		for (int i=0; i<size; i++) {
			numbers[i] = (int) (Math.random()*9000)+1000;
		}
		return numbers;
	}
	public double[] findAverageMinMax(int[] numbers) {
	    int sum = 0;
		int min = numbers[0];
		int max = numbers[0];
		for (int num : numbers) {
			sum += num;
			min = Math.min(min, num);
            max = Math.max(max, num);
        }
		double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
	}
	public static void main(String [] args) {
		mathfunc mathfunc = new mathfunc();
		int [] random = mathfunc.generate4DigitRandomArray(5);
		System.out.println("Generated Numbers: "+Arrays.toString(random));
		double[] results = mathfunc.findAverageMinMax(random);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f\n", results[0], results[1], results[2]);
    }
}		