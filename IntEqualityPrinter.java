public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(1,2,4);
    }

    public static void printEqual (int nr1, int nr2, int nr3){

        if (nr1 < 0 || nr2 < 0 || nr3 < 0){
            System.out.println("Invalid Value");
        }
        else if ((nr1 == nr2) && (nr1 == nr3)){
            System.out.println("All numbers are equal");
        }
        else if ((nr1 != nr2) && (nr1 !=nr3)){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither are equal or different");
        }
    }
}
