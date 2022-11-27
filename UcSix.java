package day4;

public class UcSix {
    public static void main(String[] args) {
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int EMP_RATE_PER_HOUR = 20;
        final int NUM_OF_WORKING_DAYS = 20;
        final int MAX_HOURS_IN_MONTH = 100;
        int empHours = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        while(totalEmpHours <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
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
            totalEmpHours += empHours;
            System.out.println("day:" +totalWorkingDays + " " +"emphours" + empHours);
        }
        int totalEmpWage = (totalEmpHours * EMP_RATE_PER_HOUR);
        System.out.println("total emp wage:" + totalEmpWage);
    }
}

