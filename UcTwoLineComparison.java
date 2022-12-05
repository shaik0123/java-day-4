package day4;

import java.util.Objects;

import static java.lang.Math.sqrt;

public class UcTwoLineComparison {
    public static void main(String[] args) {
        int x1 = 3;
        int y1 = 5;
        int x2 = 6;
        int y2 = 10;
        int x3 = 3;
        int y3 = 5;
        int x4 = 6;
        int y4 = 10;
        int lengthOfTheLine1;
        int lengthOfTheLine2;
        lengthOfTheLine1 = (int) sqrt((x2-x1)^2 + (y2-y1)^2);
        lengthOfTheLine2 = (int) sqrt((x4-x3)^2 + (y4-y3)^2);
        System.out.println(lengthOfTheLine1);
        System.out.println(lengthOfTheLine2);
        //System.out.println(lengthOfTheLine1+".equals"+lengthOfTheLine2+":"+lengthOfTheLine1.equals(int)(lengthOfTheLine2));

        if(Objects.equals(lengthOfTheLine1, lengthOfTheLine2)) {
            System.out.println("equal lines");
        }
        else {
            System.out.println("not equal");
        }
    }
}

