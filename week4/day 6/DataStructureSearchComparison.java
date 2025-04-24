import java.util.*;

public class DataStructureSearchComparison {

	public static void searchArray(int[] arr, int target) {
    	long start = System.nanoTime();
    	boolean found = false;
    	for (int num : arr) {
        	if (num == target) {
            	found = true;
            	break;
        	}
    	}
    	long end = System.nanoTime();
    	System.out.println("Array Search Time: " + (end - start) / 1_000_000.0 + " ms");
	}

	public static void searchHashSet(HashSet<Integer> set, int target) {
    	long start = System.nanoTime();
    	boolean found = set.contains(target);
    	long end = System.nanoTime();
    	System.out.println("HashSet Search Time: " + (end - start) / 1_000_000.0 + " ms");
	}

	public static void searchTreeSet(TreeSet<Integer> set, int target) {
    	long start = System.nanoTime();
    	boolean found = set.contains(target);
    	long end = System.nanoTime();
    	System.out.println("TreeSet Search Time: " + (end - start) / 1_000_000.0 + " ms");
	}

	public static void runTest(int N) {
    	System.out.println("Dataset Size: " + N);
    	Random rand = new Random();

    	int[] array = new int[N];
    	HashSet<Integer> hashSet = new HashSet<>();
    	TreeSet<Integer> treeSet = new TreeSet<>();

    	for (int i = 0; i < N; i++) {
        	int val = rand.nextInt(Integer.MAX_VALUE);
        	array[i] = val;
        	hashSet.add(val);
        	treeSet.add(val);
    	}

    	int target = array[N / 2];

    	searchArray(array, target);
    	searchHashSet(hashSet, target);
    	searchTreeSet(treeSet, target);
   	
	}

	public static void main(String[] args) {
    	runTest(1000);
    	runTest(100_000);
    	runTest(1_000_000);
	}
}

