package day4;

public class UcTwo {
    public static void main(String[] args) {
        int IS_PRESENT = 1;
        int EMP_WAGE_PER_HOUR = 20;
        int empWorkPerHour = 0;
        int totalEarnings = 0;
        double check = (Math.floor(Math.random() * 10) % 2);
        if(check == IS_PRESENT) {
            empWorkPerHour = 8;
        }
        else{
            empWorkPerHour = 0;
        }
        totalEarnings = (empWorkPerHour * EMP_WAGE_PER_HOUR );
        System.out.println("empWage" +totalEarnings);
    }
}
