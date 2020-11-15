public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2){

        if ((int)(number1*1000) == (int)(number2*1000)) {
            System.out.println("This is true");
            return true;
        }
        else {
            return false;
        }
    }
}
