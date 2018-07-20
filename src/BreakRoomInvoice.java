import java.util.Random;
import java.util.Scanner;
import java.lang.String;

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


                boolean stop = false;
                boolean taxQuestion;

                String itemName;
                String taxRate;

                double itemPrice;
                double salesTax;
                double subTotal;
                double purchaseTotal;


                int itemQuantity;
                int stateTax = 0;

                Scanner sc = new Scanner(System.in);

     //The tax code will be randomly selected from 0-3. Need to fix the structure of this
                switch (stateTax) {
                    case 1:
                    taxRate = "6.00";
                    break;

                    case 2:
                    taxRate = "5.30";
                    break;

                    case 3:
                    taxRate = "5.75";
                    break;

                    default:
                    taxRate = "5.0";
                    break;
                }

        Random randNum = new Random();
        stateTax = 1 + randNum.nextInt(2);



        System.out.println("Welcome to the Behind-The-Door Break Room Cafe!");
        //Implement a loop functionality that allows users to enter in as many item as they want until the user enters in "quit" (do NOT hard code the items)

                while (stop==false) {
                    System.out.println("Enter a food item you want: ");
                    itemName = sc.next();

                    System.out.println("Price: ");
                    itemPrice = sc.nextDouble();

                    System.out.println("Taxable (true or false): ");
                    taxQuestion = sc.nextBoolean();

                    System.out.println("Quantity: ");
                    itemQuantity = sc.nextInt();

                    System.out.println("Do you want to add another item? (Type 'quit' to exit)");




                        }
                    }
//                    Yet to complete: building out the "quit" break in the loop with and if statement. Format the decimals.
//                    Generate the output from the inputed data.


                }








