package com.company;
import javafx.stage.StageStyle;

import javax.swing.text.Style;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner atmOption = new Scanner(System.in);
        int accountBalance = 500;


        do {
            System.out.println("Welcome to the ATM! Please enter a number to select a option below.");
            System.out.println("1. Withdraw Funds");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Account Balance");
            System.out.println("4. End Transaction");
            int pickedOption = atmOption.nextInt();
            if (pickedOption == 1) {
                System.out.println("How mush money would you like to withdraw?  Please enter Dollar amount below.");
                if (accountBalance >= atmOption.nextInt()) {
                   int withdrawResults = accountBalance - atmOption.nextInt();
                    System.out.println("The amount of money you are withdrawing is $" + withdrawResults);3

                } else {
                    System.out.println("Insufficient Balance");
                }


            } else if (pickedOption == 2) {
                System.out.println("How much money would you like to Deposit? Please enter Dollar amount below.");
                atmOption.nextInt();
               int deposit = atmOption.nextInt();
                accountBalance = accountBalance + deposit;
                System.out.println("You have successfully deposited money into your account");
                System.out.println("Your current balance is " + accountBalance);
            } else if (pickedOption == 3) {
                System.out.println("Your account balance is " + accountBalance);
            } else {
                break;
            }


        } while (true);



    }


}

