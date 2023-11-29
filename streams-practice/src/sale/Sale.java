package sale;

import java.time.LocalDate;

class Sale {
    private String product;
    private String category;
    private double amount;
    private LocalDate date;

    // Constructor, getters, and setters go here...


    public Sale(String product, String category, double amount, LocalDate date) {
        this.product = product;
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "product='" + product + '\'' +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
