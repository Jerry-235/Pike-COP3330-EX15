/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 jeremiah pike
 */

import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("State the password: ");
        String state = input1.nextLine();





        if (Objects.equals(state, "abc123")) {
            System.out.printf("Welcome");


        } else {
            System.out.printf("I do not know you");
        }
    }








}
