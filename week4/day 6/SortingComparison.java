import java.util.Arrays;
 import java.util.Random;

 public class SortingComparison {

 	public static void bubbleSort(int[] arr) {
     	int n = arr.length;
     	boolean swapped;
     	for (int i = 0; i < n - 1; i++) {
         	swapped = false;
         	for (int j = 0; j < n - 1 - i; j++) {
             	if (arr[j] > arr[j + 1]) {
                	
                 	int temp = arr[j];
                 	arr[j] = arr[j + 1];
                 	arr[j + 1] = temp;
                 	swapped = true;
             	}
         	}
         	if (!swapped) break;
     	}
 	}

 	public static void mergeSort(int[] arr) {
     	if (arr.length > 1) {
         	int mid = arr.length / 2;
         	int[] left = Arrays.copyOfRange(arr, 0, mid);
         	int[] right = Arrays.copyOfRange(arr, mid, arr.length);

         	mergeSort(left);
         	mergeSort(right);

         	merge(arr, left, right);
     	}
 	}

 	public static void merge(int[] arr, int[] left, int[] right) {
     	int i = 0, j = 0, k = 0;
     	while (i < left.length && j < right.length) {
         	arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
     	}
     	while (i < left.length) arr[k++] = left[i++];
     	while (j < right.length) arr[k++] = right[j++];
 	}

 	public static void quickSort(int[] arr, int low, int high) {
     	if (low < high) {
         	int pivotIdx = partition(arr, low, high);
         	quickSort(arr, low, pivotIdx - 1);
         	quickSort(arr, pivotIdx + 1, high);
     	}
 	}

 	public static int partition(int[] arr, int low, int high) {
     	int pivot = arr[high];
     	int i = (low - 1);
     	for (int j = low; j < high; j++) {
         	if (arr[j] <= pivot) {
             	i++;
             	int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
         	}
     	}
     	int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
     	return i + 1;
 	}

 	public static int[] generateRandomArray(int size) {
     	Random rand = new Random();
     	int[] arr = new int[size];
     	for (int i = 0; i < size; i++) arr[i] = rand.nextInt(size * 10);
     	return arr;
 	}

 	public static void main(String[] args) {
     	int[] sizes = {1000, 10000, 1000000};

     	for (int size : sizes) {
         	System.out.println("Dataset Size: " + size);

         	int[] original = generateRandomArray(size);

         	if (size <= 10000) {
             	int[] bubbleArr = Arrays.copyOf(original, original.length);
             	long start = System.nanoTime();
             	bubbleSort(bubbleArr);
             	long end = System.nanoTime();
             	System.out.println("Bubble Sort Time: " + (end - start) / 1_000_000.0 + " ms");
         	} else {
             	System.out.println("Bubble Sort Time: Skipped (Too slow)");
         	}

         	int[] mergeArr = Arrays.copyOf(original, original.length);
         	long startMerge = System.nanoTime();
         	mergeSort(mergeArr);
         	long endMerge = System.nanoTime();
         	System.out.println("Merge Sort Time: " + (endMerge - startMerge) / 1_000_000.0 + " ms");

         	int[] quickArr = Arrays.copyOf(original, original.length);
         	long startQuick = System.nanoTime();
         	quickSort(quickArr, 0, quickArr.length - 1);
         	long endQuick = System.nanoTime();
         	System.out.println("Quick Sort Time: " + (endQuick - startQuick) / 1_000_000.0 + " ms");

     	}
 	}
 }

