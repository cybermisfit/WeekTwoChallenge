import java.util.Random;
import java.util.Scanner;


public class BreakRoomInvoice {

    public static void main(String[] args) {

//        An item has a name, unit price, quantity, and a taxable field (TRUE or FALSE)
//        There are 4 tax codes the user can use:
//
//        MD = 6.00%
//        VA = 5.30%
//        DC = 5.75%
//        None of these states = 5.0%
//
//        The tax code will be randomly selected from 0-3.
//        Implement a loop functionality that allows users to enter in as many item as they want until the user enters in "quit" (do NOT hard code the items)
//        Calculate the sub-total
//        Calculate the sales tax (only for taxable items)
//        Calculate the total amount
//        Use the number formatting:
//
//        Format the tax rate percentage to 2 decimal places
//        Format all the sub-total, sales tax, and total amount to 2 decimal places
//
//        You should have at least one additional method besides the main! (I don't want to see "System.out.print()" or "System.out.println()"

        //VARIABLES & SCANNER

        double taxRate = 0.00;
        int stateTax = 0;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int taxCode = rand.nextInt(4);

        if (taxCode == 1) {
            taxRate = 0.06;
        } else if (taxCode == 2) {
            taxRate = 0.053;
        } else if (taxCode == 3) {
            taxRate = 0.0575;
        } else {
            taxRate = 0.05;
        }

        String result = "";
        String userInput="";
        double subTotal = 0.0;
        double taxableTotal = 0.0;



        //USER INPUT

        while (!userInput.equalsIgnoreCase("quit")) {
            printout("Enter a food item you want: ");
            String itemName = sc.next();

            printout("Price: ");
            double itemPrice = sc.nextDouble();

            printout("Taxable? True or False: ");
            boolean taxable = sc.nextBoolean();

            printout("Quantity: ");
            int itemQuantity = sc.nextInt();

            String formatPrice = String.format("%.02f", itemPrice);

            result += itemName + "\t\t\t" + itemQuantity + "\t\t\t\t$" + formatPrice + "\t\t" + taxable + "\n";

            //INSIDE WHILE LOOP FOR STRING BUILDER
            subTotal += (itemPrice * itemQuantity);

            if (taxable == true) {
                taxableTotal += (itemPrice * itemQuantity);
            }

            printout("Do you want to add another item? (Type 'quit' to exit): ");
            userInput = sc.next();

        }

        //FORMATTING and CALCULATIONS

        double salesTax = taxableTotal * taxRate;
        double totalAmount = salesTax + subTotal;

        String formatSubTotal = String.format("%.02f", subTotal);
        String formatSalesTax = String.format("%.02f", salesTax);
        String formatTotalAmount = String.format("%.02f", totalAmount);
        String formatTaxRate = String.format("%.02f", taxRate);
        //String formatPrice = String.format("%.02f", itemPrice);


        //OUTPUT DISPLAYED
        printout("\n");
        printout("Item Name" + "\t\t" + "Quantity" + "\t\t" + "Price" + "\t\t" + "Taxable");
        printout(result);
        printout("Sub-Total = $" + formatSubTotal);
        printout("Tax Rate = " + formatTaxRate + " (Tax code = " + taxCode + ")");
        printout("Sales Tax = $" + formatSalesTax);
        printout("__________________________________________________________");
        printout("Total = $" + formatTotalAmount);



    }

    //ADDITIONAL METHOD FOR PRINTING
            public static void printout(String printout){
                System.out.println(printout);
    }
}








