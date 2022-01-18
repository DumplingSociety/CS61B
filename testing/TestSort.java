public class TestSort {
    /** Test the Sort.sort method. */
    public static void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expeced = {"an", "egg", "have", "i"};

        Sort.sort(input);

        if(input != expected) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args){
        testSort();
    }

}
