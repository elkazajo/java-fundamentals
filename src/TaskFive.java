public class TaskFive {
    public static void main(String[] args) {
        String month;
        int number = Integer.parseInt(args[0]);

        if (number > 12 || number < 0) {
            System.out.println("Wrong number");
        } else {
            switch (number) {
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                default:
                    month = "December";
                    break;
            }
            System.out.println(month);
        }
    }
}
