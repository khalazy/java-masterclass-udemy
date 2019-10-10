public class Test {
    public static void main(String[] args) {

        BankAccount bank = new BankAccount();

        bank.setAccountNum(45232);
        bank.setBalance(500);
        bank.setCustomerName("Ryan Garcia");
        bank.setEmail("rg002@email.com");
        bank.setPhoneNum(1231231234);
        bank.withdrawal(20);

        System.out.println(bank.getAccountNum());
        System.out.println(bank.getBalance());
        System.out.println(bank.getCustomerName());
        System.out.println(bank.getEmail());
        System.out.println(bank.getPhoneNum());

        bank.setBalance(0);
        bank.withdrawal(10);

        bank.deposit(100);
        System.out.println(bank.getBalance());
    }
}
