class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be positive!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > balance){
            throw new InsufficientBalanceException("Not enough balance ! Available: "+ balance);
        }else if(amount <=0){
            throw  new IllegalArgumentException("Withdrawal amount must be positive!");
        }

        balance -= amount;
        System.out.println("Withdraw: " + amount);
    }

    public double getBalance(){
        return balance;
    }
}

