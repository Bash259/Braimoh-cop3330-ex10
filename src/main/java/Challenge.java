/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */



import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("Enter price of item 1:");
        Scanner UserInput = new Scanner(System.in);
        int Item1Price = UserInput.nextInt();

        System.out.println("Enter the quantity of item 1:");
        int Item1Quantity = UserInput.nextInt();

        System.out.println("Enter price of item 2:");
        int Item2Price = UserInput.nextInt();

        System.out.println("Enter the quantity of item 2:");
        int Item2Quantity = UserInput.nextInt();

        System.out.println("Enter price of item 3:");
        int Item3Price = UserInput.nextInt();

        System.out.println("Enter the quantity of item 3:");
        int Item3Quantity = UserInput.nextInt();


        int Item1Total = Item1Price * Item1Quantity;
        int Item2Total = Item2Price * Item2Quantity;
        int Item3Total = Item3Price * Item3Quantity;
        int subTotal = Item1Total + Item2Total + Item3Total;
        System.out.println("Subtotal: $"+subTotal);

        double Tax = (subTotal * 5.5)/100;
        System.out.println("Tax: $"+Tax);

        double Total = subTotal + Tax;
        System.out.println("Total: $"+Total);

    }
}