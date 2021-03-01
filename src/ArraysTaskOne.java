public class ArraysTaskOne {
    public static void main(String[] args) {
        String[] arrayOfNumbers = new String[args.length];
        String[] differentDigitsNumbers = new String[arrayOfNumbers.length];
        for (int i = 0; i < args.length; i++) {
            arrayOfNumbers[i] = args[i];
            if (areDigitsDifferent(arrayOfNumbers[i])) {
                differentDigitsNumbers[i] = arrayOfNumbers[i];
            }
        }
        for (String number : differentDigitsNumbers) {
            if (number != null) {
                System.out.println(Integer.parseInt(number));
                break;
            }
        }
    }

    static boolean areDigitsDifferent(String number) {
        int checkNumber = number.length();
        for (int i = 1; i < checkNumber; i++)
            if (number.charAt(i) != number.charAt(0)) {
                return true;
            }
        return false;
    }
}
