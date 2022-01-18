import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the the Sort class. */
public class TestSort {
    /** Test the Sort.sort method. */
    public static void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        // Sort the input array
        Sort.sort(input);

        // wrong example, since != compare the memory address of the two array, check Java Visualizer for detial
//        if(input != expected) {
//            System.out.println("Error");
//        }

        // right way to compare
//        for (int i =0; i < input.length; i += 1){
//            if(!input[i].equals(expected[i])){
//                System.out.println("Mismatch in position " + i + ", expected: " + expected[i] + ", but got: " + input[i]);
//                return; // we just need the first
//            }
//        }

        // better way: Junit
        org.junit.Assert.assertArrayEquals(expected, input);

    }

    /** Test the Sort.findFindSmallest()
     *
     * @param args
     */
    // one annoying thing here is you need to change findSmallest from private to public, kinda ugly but its easiest solution for testing.
    public static void testFindSmallest(){
        // test case 1
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;

        // Sort the input array
        int actual = Sort.findSmallest(input, 0);
        org.junit.Assert.assertEquals(expected, actual);

        // another test case
        String[] input2 = {"2", "3", "6", "1"};
        int expected2 = 3;

        // Sort the input array
        int actual2 = Sort.findSmallest(input2,2);
        org.junit.Assert.assertEquals(expected2, actual2);
    }

    public static void testSwap(){
        // test case 1
        int a = 0;
        int b = 2;
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "have", "i", "egg"};

        // Sort the input array
        Sort.swap(input, a, b);
        org.junit.Assert.assertEquals(expected, input);

    }

    public static void main(String[] args){
        testSort();
        //testFindSmallest();
        //testSwap();
    }

}
