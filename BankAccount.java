
public class BankAccount {
  
  private double balance;
  private String ID;
  
  public BankAccount(String initID, double initBalance) {
    ID = initID;
    balance = initBalance;
  }

  public double getBalance() {
    return balance;
  }

  public String getID() {
    return ID;
  }

  public void deposit(double amount) {
    balance += amount;
  }
}
