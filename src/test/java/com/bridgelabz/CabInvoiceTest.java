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

    @Test
    void givenNumberOfRidesShouldReturnTotalFare(){
        Ride[] arr = {new Ride(2.0,5.0),new Ride(3.0,7.0),new Ride(0.1,0.3)};
        double fare1 = cabInvoice.calculateFare(arr);
        Assertions.assertEquals(67,fare1);
    }
}