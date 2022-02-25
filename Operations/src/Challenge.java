public class Challenge {
    public static void main(String[] args) {
        double myDoubleNumber = 20d;
        double mySecondDoubleNumber = 80d;

        double total = (myDoubleNumber+mySecondDoubleNumber) * 100.00;
        System.out.println("Total"+ total);
        double theRemainder = total % 40.00d;

        System.out.println("Reminder" + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;

        System.out.println("Is No Remainder" + isNoRemainder);

        if(!isNoRemainder) {
            System.out.println("Got some remainder");
        }


    }
}
