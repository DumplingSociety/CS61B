import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void sort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        // Sort the input array
        Sort.sort(input);
        assertArrayEquals(expected, input);
    }


    @Test
    void swap() {
        // test case 1
        int a = 0;
        int b = 2;
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "have", "i", "egg"};

        // Sort the input array
        Sort.swap(input, a, b);
        assertArrayEquals(expected, input);


    }

    @Test
    void findSmallest() {
        // test case 1
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;

        // Sort the input array
        int actual = Sort.findSmallest(input, 0);
        assertEquals(expected, actual);

        // another test case
        String[] input2 = {"2", "3", "6", "1"};
        int expected2 = 3;

        // Sort the input array
        int actual2 = Sort.findSmallest(input2,2);
        assertEquals(expected2, actual2);
    }
}