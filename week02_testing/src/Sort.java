public class Sort {
    /** Sorts strings destructively. */
    public static void sort(String[] x) {
        //sort(x, 0);
        // Find the smallest item [done]
//		int smallestIdx = findSmallest(x);
//		swap(x, 0, smallestIdx);
        // Move it to the front [done]
        // Selection sort the rest(using recursion??)
        sort(x, 0);
    }

    /** helper Method to achive x[1:] in Java/
     *
     */
    public static void sort(String[] x, int start){
        if (start == x.length){
            return;
        }
        int smallestIdx = findSmallest(x, start);
        swap(x, start, smallestIdx);
        sort(x, start + 1);
    }

    /** Sawp item a with b */
    public static void swap(String[] input, int a, int b){
        String temp;
        temp = input[b];
        input[b] = input[a];
        input[a] = temp;
    }


    /** Return the smallest index of String in input */
    public static int findSmallest(String[] input, int start){
        int smallestIdx = start;
        for (int i = start; i < input.length; i+=1){
            // if we found the smallest string,
            //if (input[i] < input[smallestIdx]){
            if(input[i].compareTo(input[smallestIdx])<0){
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }

//
//	/** Sorts x starting at position start. */
//	private static void sort(String[] x, int start) {
//	    if (start == x.length) {
//	        return;
//        }
//	    int smallestIndex = findSmallest(x, start);
//	    swap(x, start, smallestIndex);
//	    sort(x, start + 1);
//    }
//
//	/** Swap item a with b. */
//	public static void swap(String[] x, int a, int b) {
//	    String temp = x[a];
//	    x[a] = x[b];
//	    x[b] = temp;
//    }
//
//	/** Return the index of the smallest String in x, starting at start. */
//	public static int findSmallest(String[] x, int start) {
//        int smallestIndex = start;
//        for (int i = start; i < x.length; i += 1) {
//            int cmp = x[i].compareTo(x[smallestIndex]);
//            // from the internet, if x[i] < x[smallestIndex], cmp will be -1.
//            if (cmp < 0) {
//                smallestIndex = i;
//            }
//        }
//        return smallestIndex;
//    }
}