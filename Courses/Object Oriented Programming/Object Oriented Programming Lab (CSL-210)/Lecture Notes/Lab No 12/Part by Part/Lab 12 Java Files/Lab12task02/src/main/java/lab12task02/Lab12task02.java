package lab12task02;

public class Lab12task02 {

    public static void main(String[] args) {

        Bank ublBank = new UBL();
        ublBank.CreateAccount();
        ublBank.SearchAccountDetails(2);
        ublBank.UpdateCustomerInfo(2, "Abdullah Sadiq", 10000);
        ublBank.CashWithdraw(2, 1100);
        ublBank.CashDeposit(2, 1200);

        Bank askariBank = new AskariBank();
        askariBank.CreateAccount();
        askariBank.SearchAccountDetails(1);
        askariBank.UpdateCustomerInfo(1, "Adil Khan", 1000000);
        askariBank.CashWithdraw(1, 2000);
        askariBank.CashDeposit(1, 5000);
    }
}