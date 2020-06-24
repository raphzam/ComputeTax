import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String customerName;
        double purchaseAmount;
        int taxCode;
        double taxRate = 0;
        double salesTax;
        double totalAmountDue;

        System.out.println("Customer name:  ");
        customerName = input.nextLine();

        System.out.println("Purchase amount: ");
        purchaseAmount = input.nextDouble();

        System.out.println("Tax code: ");
        taxCode = input.nextInt();

        switch (taxCode){
            case 0: taxRate = 0;
            break;

            case 1: taxRate = .03;
            break;

            case 2: taxRate = .05;
            break;

            case 3: taxRate = .07;
            break;
        }

        salesTax = (purchaseAmount * taxRate);

        totalAmountDue = purchaseAmount + salesTax;

//        OUTPUT
        System.out.println("Customer name: " + customerName);
        System.out.println("Purchase amount: $" + purchaseAmount);
        System.out.printf("Sales tax: $%.2f\n", salesTax);
        System.out.printf("Total amount due: $%.2f\n", totalAmountDue);









    }
}
