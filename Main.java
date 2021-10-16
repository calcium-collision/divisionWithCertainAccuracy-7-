package com.company.calcium_collision;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        System.out.println("Answer is " + division(10, 3, 5));

    }

    public static String division(long divided, long divider, int accuracy){

        double result = (double) divided / (double) divider;
        BigDecimal resultBD = new BigDecimal(result);
        String resultString = resultBD.setScale(accuracy, BigDecimal.ROUND_HALF_UP).toString();
        return resultString;

    }
}
