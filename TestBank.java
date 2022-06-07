public class TestBank {
    public static void main(String[] args) {
        BankAccount user1= new BankAccount();
        BankAccount user2= new BankAccount(760333,53323);


        user1.depositMoney(5000,"savings");
        user2.depositMoney(5000,"somewhere");

        user1.withdrawMoney(100000,"checking");
        user2.withdrawMoney(50000,"savings");

        user1.accountBalance();
        user2.accountBalance();
    }
}
