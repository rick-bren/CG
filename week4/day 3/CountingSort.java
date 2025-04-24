
public class CountingSort {
    public static void countingSort(int[] ages) {
        int maxAge = 18; // Since ages range from 10 to 18
        int[] count = new int[maxAge + 1];

        for (int age : ages) {
            count[age]++;
        }

        int index = 0;
        for (int i = 10; i <= maxAge; i++) {
            while (count[i] > 0) {
                ages[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 14, 16, 15, 13};
        countingSort(ages);
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}

