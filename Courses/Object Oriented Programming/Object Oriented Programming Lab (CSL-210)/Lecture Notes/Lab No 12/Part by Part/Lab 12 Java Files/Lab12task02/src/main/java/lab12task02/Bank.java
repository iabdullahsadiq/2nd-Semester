package lab12task02;

public interface Bank {
    
    void CreateAccount();
    void SearchAccountDetails(int id);
    void UpdateCustomerInfo(int id, String name, int bal);
    void CashWithdraw(int id, int cash);
    void CashDeposit(int id, int cash);
}