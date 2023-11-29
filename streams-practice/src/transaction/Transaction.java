package transaction;

class Transaction {
    private int transactionId;
    private double amount;
    private String transactionType;

    // Constructor, getters, and setters go here...


    public Transaction(int transactionId, double amount, String transactionType) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }
}
