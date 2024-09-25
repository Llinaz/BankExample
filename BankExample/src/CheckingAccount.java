public class CheckingAccount extends Account {
    public CheckingAccount(int balance) {
        super(balance);
    }
    @Override
    public void withdraw(int n) {
        balance -= n;
    }
    public int getBalance() {
        return balance < 0 ? -balance : 0;
    }
}
