package day4;

public class UcThree {
    public static void main(String[] args) {
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int empHour = 0;
        int empWage = 0;
        double check = Math.floor(Math.random()*10)%3;
        if(check == IS_PART_TIME)
            empHour = 4;
        else if (check == IS_FULL_TIME)
            empHour = 8;
        else
            empHour = 0;
        empWage = empHour * EMP_RATE_PER_HOUR;
        System.out.println("empWage" +empWage);

    }

}

