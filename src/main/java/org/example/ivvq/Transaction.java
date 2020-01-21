package org.example.ivvq;

public class Transaction {
    private int amount;

    public Transaction(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("<0");
        }
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public Transaction add(Transaction t) {
        return new Transaction(this.amount + t.amount);
    }

    public Transaction subtract(Transaction t) {
        return new Transaction(this.amount - t.amount);
    }
}

