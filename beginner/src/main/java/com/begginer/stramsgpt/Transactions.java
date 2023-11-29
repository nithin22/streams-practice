package com.begginer.stramsgpt;

import java.util.ArrayList;
import java.util.List;

public class Transactions {

        private int transactionId;
        private String department;
        private String itemName;
        private double itemPrice;
        private int quantityPurchased;

        public Transactions(int transactionId, String department, String itemName, double itemPrice, int quantityPurchased) {
            this.transactionId = transactionId;
            this.department = department;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
            this.quantityPurchased = quantityPurchased;
        }

        public int getTransactionId() {
            return transactionId;
        }

        public String getDepartment() {
            return department;
        }

        public String getItemName() {
            return itemName;
        }

        public double getItemPrice() {
            return itemPrice;
        }

        public int getQuantityPurchased() {
            return quantityPurchased;
        }

    @Override
    public String toString() {
        return "Transactions{" +
                "transactionId=" + transactionId +
                ", department='" + department + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", quantityPurchased=" + quantityPurchased +
                '}';
    }

    public static List<Transactions> getSampleTransactions() {
            List<Transactions> transactions = new ArrayList<>();
            transactions.add(new Transactions(1, "Electronics", "Laptop", 800.00, 2));
            transactions.add(new Transactions(2, "Clothing", "T-Shirt", 20.00, 5));
            transactions.add(new Transactions(3, "Groceries", "Bananas", 1.50, 10));
            transactions.add(new Transactions(4, "Electronics", "Headphones", 50.00, 3));
            transactions.add(new Transactions(5, "Clothing", "Jeans", 40.00, 2));
            return transactions;
        }
    }