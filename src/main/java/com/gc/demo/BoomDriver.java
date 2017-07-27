package com.gc.demo;

import java.util.Scanner;

/**
 * Created by michaelgleeson on 7/27/17.
 */
public class BoomDriver {
    public static void main(String[] args) {
        BoomFizz boomFizz = new BoomFizz();
        Scanner scnr = new Scanner(System.in);
        int userInput = scnr.nextInt();

        boomFizz.boom(userInput);
    }
}
