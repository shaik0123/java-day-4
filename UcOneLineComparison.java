package day4;

import static java.lang.Math.sqrt;

public class UcOneLineComparison {
    public static void main(String[] args) {
        int x1 = 3;
        int y1 = 5;
        int x2 = 6;
        int y2 = 11;
        int lengthOfTheLine;
        lengthOfTheLine = (int) sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println(lengthOfTheLine);
    }
}
