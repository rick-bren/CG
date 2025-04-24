
public class StringConcatComparison {

	public static void concatWithString(int N) {
    	long start = System.nanoTime();
    	String result = "";
    	for (int i = 0; i < N; i++) {
        	result += "a";
    	}
    	long end = System.nanoTime();
    	System.out.println("String Time: " + (end - start) / 1_000_000.0 + " ms");
	}

	public static void concatWithStringBuilder(int N) {
    	long start = System.nanoTime();
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < N; i++) {
        	sb.append("a");
 	   }
    	long end = System.nanoTime();
    	System.out.println("StringBuilder Time: " + (end - start) / 1_000_000.0 + " ms");
	}

	public static void concatWithStringBuffer(int N) {
    	long start = System.nanoTime();
    	StringBuffer sb = new StringBuffer();
    	for (int i = 0; i < N; i++) {
        	sb.append("a");
    	}
    	long end = System.nanoTime();
    	System.out.println("StringBuffer Time: " + (end - start) / 1_000_000.0 + " ms");
	}

	public static void main(String[] args) {
    	int[] sizes = {1000, 10000, 1_000_000};

    	for (int N : sizes) {
        	System.out.println("Operations Count: " + N);

        	if (N <= 10_000) { // Avoid long runtime for String at 1M
            	concatWithString(N);
        	} else {
            	System.out.println("String Time: Skipped (Too slow)");
        	}

        	concatWithStringBuilder(N);
        	concatWithStringBuffer(N);
        	
    	}
	}
}

