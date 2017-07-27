package com.gc.demo;

/**
 * Created by michaelgleeson on 7/27/17.
 */
public class BoomFizz {
    public String boom(int number) {
        // Accepts int input values, and returns "Boom" if input number is 7 or divisible by 7 or contains a 7,
        // otherwise print the number
        String boom = "Boom";

        for (int i = 1; i < number + 1 ; i++) {
////            int k = i;
////            while (k > 0) {
////                int j = k % 10;
////                j = j / 10;
////                if (j == 7) {
////                    System.out.println(boom);
////                }
//
//
//            }
            if (i%7 != 0) {
                System.out.println(i);
            }
            if (i%7 == 0){
                System.out.println(boom);
            }


        }
        return "";
    }
}
