public class BankAccount {

    private int accountNum;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNum;

    public int getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void deposit(double depositDollars) {
        balance += depositDollars;
    }

    public void withdrawal(double withdrawalDollars) {
        if(balance < 0) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= withdrawalDollars;
        }
    }
}
