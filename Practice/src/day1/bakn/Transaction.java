package day1.bakn;

import java.time.LocalDate;

public class Transaction {

    private double amount;
    private TransactionType type;
    private LocalDate timestamp;

    public Transaction() {
    }

    public Transaction(double amount, TransactionType type, LocalDate timestamp) {
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", type=" + type +
                ", timestamp=" + timestamp +
                '}';
    }
}
