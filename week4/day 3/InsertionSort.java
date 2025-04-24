
public class InsertionSort {
    public static void insertionSort(int[] ids) {
        for (int i = 1; i < ids.length; i++) {
            int key = ids[i];
            int j = i - 1;
            // Shift elements to the right to make space for the key
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] ids = {1245, 1023, 1456, 1307, 1120};
        insertionSort(ids);
        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
}



