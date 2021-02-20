import java.util.Scanner;

public class discountMachin {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number of software packages to purchase");
        double purchase = keyboard.nextDouble();
        double cost = 99.0;
        double total = purchase * cost;
        double discountedTotal = 0.0;

        if(purchase < 10){
            System.out.printf("Total cost: $%.2f",total);
        }
        else if(purchase >= 10 && purchase <= 19){
            double twentyDiscount = (((purchase * cost) / 100) * 20);
            discountedTotal = total - twentyDiscount;

            System.out.printf("Since you purchased %.0f packages, you earned a discount of 20%%!\n", purchase);
            System.out.printf("Pre-discount total: $%,.2f\nTotal cost: $%,.2f", total, discountedTotal);
        }
        else if(purchase >= 20 && purchase <= 49){
            double thirtyDiscount = (((purchase * cost) / 100) * 30);
            discountedTotal = total - thirtyDiscount;

            System.out.printf("Since you purchased %.0f packages, you earned a discount of 30%%!\n", purchase);
            System.out.printf("Pre-discount total: $%,.2f\nTotal cost: $%,.2f", total, discountedTotal);
        }
        else if(purchase >= 50 && purchase <= 99){
            double fortyDiscount = (((purchase * cost) / 100) * 40);
            discountedTotal = total - fortyDiscount;

            System.out.printf("Since you purchased %.0f packages, you earned a discount of 40%%!\n", purchase);
            System.out.printf("Pre-discount total: $%,.2f\nTotal cost: $%,.2f", total, discountedTotal);
        }
        else{
            double fiftyDiscount = (((purchase * cost) / 100) * 50);
            discountedTotal = total - fiftyDiscount;

            System.out.printf("Since you purchased %.0f packages, you earned a discount of 50%%!\n", purchase);
            System.out.printf("Pre-discount total: $%,.2f\nTotal cost: $%,.2f", total, discountedTotal);
        }

    }
}
