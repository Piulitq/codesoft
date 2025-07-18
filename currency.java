import java.util.*;

public class currency {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rate = 0;

        System.out.println(" Simple Currency Converter : ");

        System.out.print("Enter base currency (usd/inr/eur): ");
        String base = in.nextLine();

        System.out.print("Enter target currency (usd/inr/eur): ");
        String target = in.nextLine();

        System.out.print("Enter amount: ");
        double amount = in.nextDouble();

        if (base.equals("usd") && target.equals("inr")) {
            rate = 83.15;
        } else if (base.equals("inr") && target.equals("usd")) {
            rate = 0.012;
        } else if (base.equals("usd") && target.equals("eur")) {
            rate = 0.92;
        } else if (base.equals("eur") && target.equals("usd")) {
            rate = 1.09;
        } else if (base.equals("inr") && target.equals("eur")) {
            rate = 0.011;
        } else if (base.equals("eur") && target.equals("inr")) {
            rate = 90.23;
        } else {
            System.out.println("Currency pair not supported.");
            in.close(); 
            return;
        }

        double result = amount * rate;
        System.out.println("Converted Amount = " + result + " " + target);

        in.close();
    }
}
