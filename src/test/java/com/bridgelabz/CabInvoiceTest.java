package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceTest {

    CabInvoice cabInvoice = new CabInvoice();

    /* Checking total fare */
    @Test
    void givenDistanceAndTimeShouldReturnTotalFare() {
        double actualFare = cabInvoice.calculateFare(2.0, 5.0);
        Assertions.assertEquals(25, actualFare);
    }

    /* Checking minimum fare */
    @Test
    void givenDistanceAndTimeShouldReturnMinimumFare() {
        double actualFare = cabInvoice.calculateFare(0.1, 0.5);
        Assertions.assertEquals(5, actualFare);
    }
}