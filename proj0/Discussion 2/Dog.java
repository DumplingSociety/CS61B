public class Dog {
    public int weightInPounds;
    //public static String binomen = ''

    public Dog(int w) {
        weightInPounds = w;
    }

    // static
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip!");
        }
    }

    public static void main(String[] args) {
        // makeNoise();
    }
}