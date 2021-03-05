package org.example.ivvq.transaction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TransactionTest {

    private Transaction transaction;

    @BeforeEach
    void setUp() {
        this.transaction = new Transaction(100);
    }

    @Test
    void should_return_100_when_amount_asked() {
        assertEquals(100, this.transaction.getAmount());
    }

    @Test
    void should_return_150_when_added_50() {
        this.transaction = this.transaction.add(new Transaction(50));
        assertEquals(150, this.transaction.getAmount());
    }

    @Test
    void should_return_50_when_subtracted_50() {
        this.transaction = this.transaction.subtract(new Transaction(50));
        assertEquals(50, this.transaction.getAmount());
    }

    @Test
    void should_throw_IllegalArgumentException_when_amount_is_below_0() {
        try {
            this.transaction = new Transaction(-50);
            fail("Should have an IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // OK
        }
    }
}
