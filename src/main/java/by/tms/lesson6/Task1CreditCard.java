package by.tms.lesson6;

public class Task1CreditCard {

    int accountNumber, currentAmount;

    Task1CreditCard(int number, int amount) {
        this.accountNumber = number;
        this.currentAmount = amount;
    }

    int addAmount(int addAmount) {
        return this.currentAmount += addAmount;
    }

    int withdrawAmount(int withdraw) {
        return this.currentAmount -= withdraw;
    }

    void aboutAccount() {
        System.out.print("Аккаунт №: " + accountNumber + " ,");
        System.out.println("Баланс счета: " + currentAmount);
    }


}
