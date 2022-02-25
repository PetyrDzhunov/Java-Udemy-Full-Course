public class Challenge {
    public static void main(String[] args) {
        byte myByteNumber = 100;
        short myShortNumber = 500;

        int myIntNumber = 5000000;
        long myLongNumber = 50000L + 10 * (myByteNumber+myShortNumber+myIntNumber);
        System.out.println(myLongNumber);
    }
}
