public class BankAccount {
    private String accountNumber;
    private double balance;
    private double interestRate;
    private boolean active;

    public BankAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        this.active = true;
    }



    public void wtd(double amount) {
        balance -= amount;
    }
    -
    public void withdraw(double amount) {
        balance -= amount;
    }
    // Сокращения для "ускорения" написания метода недопостумы



    public void dep(double amount) {
        balance += amount;
    }
    -
    public void increaseBalance(double amount) {
        balance += amount;
    }
    //  непонятно что делает метод, increaseBalance явно повышает баланс на указанной число


    public double gb() {
        return balance;
    }
    -
    public double getBalance() {
        return balance;
    }
    // сокращение



    public void modify(double rate) {
        interestRate = rate;
    }
    -
    public void setInterestRate(double rate) {
        interestRate = rate;
    }
    //сокращение



    public void sAct(boolean active) {
        this.active = active;
    }
    -
    public void setActive(boolean active) {
        this.active = active;
    }
    //сокращение


    public double calInt() {
        return balance * interestRate;
    }
    -
    public double calculateInterest() {
        return balance * interestRate;
    }
    //сокращение


    public void operation() {
        double randomAmount = Math.random() * 1000;
        balance += randomAmount;
        System.out.println("Performed operation: Added " + randomAmount + " to the balance. New balance: " + balance);
    }
    -
    public void updateBalance() {
        double randomAmount = Math.random() * 500;
        balance += randomAmount;
        System.out.println("Updated balance: " + balance);
    }
    // Операция обновления счета. с названием updateBalance она более наглядна нежели безликая operation





    public void transfer(double amount, BankAccount recipient) {
        recipient.increaseBalance(amount);
        this.withdraw(amount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public void clsAcc() {
        active = false;
    }
    -
    public void closeAccount() {
        active = false;
    }
    // сокращение


    public void rOpAcc() {
        active = true;
    }
    -
    public void reopenAccount() {
        active = true;
    }
    //сокращение

    public void applyInterest() {
        double interest = calculateInterest();
        balance += interest;
    }


    public boolean isBlncPos() {
        return balance > 0;
    }
    -
    public boolean isBalancePositive() {
        return balance > 0;
    }
    // сокращение, хотя из контекста в целом понятно, но правило есть правило :)


    public boolean isBlncNeg() {
        return balance < 0;
    }
    -
    public boolean isBalanceNegative() {
        return balance < 0;
    }
    // сокращение как и выше



    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }


    public void actAcc() {
        active = true;
    }
    -
    public void activateAccount() {
        active = true;
    }
    // сокращение


    public void deActAcc() {
        active = false;
    }
    -
    public void deactivateAccount() {
        active = false;
    }
    //сокращение



}