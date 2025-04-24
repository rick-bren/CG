public class BubbleSort {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (marks[i - 1] > marks[i]) {
                    // Swap the elements
                    int temp = marks[i - 1];
                    marks[i - 1] = marks[i];
                    marks[i] = temp;
                    swapped = true;
                }
            }
            n--; // Reduce the range to avoid checking the last element
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] marks = {85, 72, 90, 65, 78};
        bubbleSort(marks);
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
