package day4;

public class UcFive {
    public static void main(String[] args) {
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int EMP_RATE_PER_HOUR = 20;
        final int NUM_OF_WORKING_DAYS = 20;
        int empHours = 0;
        int empWage = 0;
        int totalEarnings = 0;
        for(int day=0;day<NUM_OF_WORKING_DAYS;day++) {
            int check = (int) Math.floor(Math.random() * 10 % 3);
            switch (check) {
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }
            empWage = (empHours * EMP_RATE_PER_HOUR);
            totalEarnings += empWage;
            System.out.println("empWage:" + empWage);
        }
        System.out.println("total emp wage:" + totalEarnings);
    }
}
