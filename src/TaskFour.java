public class TaskFour {
    public static void main(String[] args) {
        int count = 0;
        for (String numbers : args) {
            int number = Integer.parseInt(numbers);
            count += number;
        }
        System.out.println(count);
    }
}
