public class Account {
    private int balance = 0;//첫 계좌만들면 0원.
    public int getBalance() {
        return this.balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        if(money > balance){
            throw new IllegalArgumentException();
        }
        else {
            balance -= money;
        }
    }
}
