package lab12task02;

public class UBL implements Bank{

    int id = 2;
    String name = "Abdullah Sadiq";
    int bal = 10000;

    public void CreateAccount() {
        System.out.println("Your account has been created in UBL bank successfully...");
    }
    public void SearchAccountDetails(int id) {
        System.out.println("Searching account details for id # " + id);
    }
    public void UpdateCustomerInfo(int id, String name, int bal) {
        this.id = id;
        this.name = name;
        this.bal = bal;
    }
    public void CashWithdraw(int id, int cash) {
        bal = bal - cash;
        System.out.println("ID # " + id + " has withdrawn " + cash + " PKR");
    }
    public void CashDeposit(int id, int cash) {
        bal = bal + cash;
        System.out.println("ID # " + id + " has deposited " + cash + " PKR");
    }
}