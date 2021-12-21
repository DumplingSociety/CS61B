public class HW0 {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int max=0;
        int temp;
        for(int i = 0; i<6 ;i++ )
        {
            if (m[i] > m[i+1])
            {
                if (m[i] > max)
                {
                    max = m[i];
                }
            }else{
                if (m[i+1] > max)
                {
                    max = m[i+1];
                }
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        int maxNum = max(numbers);
        System.out.println(maxNum);
    }


}