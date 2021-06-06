/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */



import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println("Enter price of item 1:");
        Scanner UserInput = new Scanner(System.in);
        String Item1Price = UserInput.nextLine();
        int Item1PriceA = Integer.parseInt(Item1Price);
        System.out.println("Enter the quantity of item 1:");
        String Item1Quantity = UserInput.nextLine();
        int Item1QuantityA = Integer.parseInt(Item1Quantity);
        System.out.println("Enter price of item 2:");
        String Item2Price = UserInput.nextLine();
        int Item2PriceA = Integer.parseInt(Item2Price);
        System.out.println("Enter the quantity of item 2:");
        String Item2Quantity = UserInput.nextLine();
        int Item2QuantityA = Integer.parseInt(Item2Quantity);
        System.out.println("Enter price of item 3:");
        String Item3Price = UserInput.nextLine();
        int Item3PriceA = Integer.parseInt(Item3Price);
        System.out.println("Enter the quantity of item 3:");
        String Item3Quantity = UserInput.nextLine();
        int Item3QuantityA = Integer.parseInt(Item3Quantity);

        int Item1Total = Item1PriceA * Item1QuantityA;
        int Item2Total = Item2PriceA * Item2QuantityA;
        int Item3Total = Item3PriceA * Item3QuantityA;
        int subTotal = Item1Total + Item2Total + Item3Total;
        System.out.println("Subtotal: $"+subTotal);

        double Tax = (subTotal * 5.5)/100;
        System.out.println("Tax: $"+Tax);

        double Total = subTotal + Tax;
        System.out.println("Total: $"+Total);

    }
}