public class CreditCard {
    public static void main(String[] args) {
        double balance = 4000000;
        String Bank = "Bank of Java";
        String Account = "BOJ1234500";
        String Customer = "John Doe";
        int limit = 2000000;

        String getCustomer = Customer;
        String getBank = Bank;
        String getAccount = Account;
        /*
        String getLimit = limit;
         */
        Double getBalance = balance;

        Double Charge = 500000.0;
        Double makePayment = getBalance - Charge;

        System.out.println(getBank);
        System.out.println(getAccount);
        System.out.println(getCustomer);
        System.out.println("Your current balance is: " + getBalance);
        System.out.println("You made a payment of: " + Charge);
        System.out.println("Your remaining balance is: " + makePayment);


    }
}
