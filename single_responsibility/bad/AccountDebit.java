package single_responsibility.bad;

public abstract class AccountDebit {

    public abstract void validateBalance(float value);

    public abstract void debitAccount(float value);

    public abstract void printReceipt();

}