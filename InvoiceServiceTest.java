package com.company;
import org.junit.jupiter.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

    public class InvoiceServiceTest {
        @@ -13,22 +13,22 @@ public void givenDistanceTimeReturnFare() {
            double distance = 2.0;
            int time = 5;
            double fare = invoiceGenerator.calculateFare((double) distance, (int) time);
            Assertions.assertEquals(25.0, fare, 1);
            Assert.assertEquals(25.0, fare, 1);
        }
        @Test
        public void givenLessDistanceTimeReturnMinFare() {
            double distance = 0.1;
            int time = 1;
            double fare = invoiceGenerator.calculateFare((double) time, (int) distance);
            Assertions.assertEquals(10.0, fare, 1);
            Assert.assertEquals(10.0, fare, 1);
        }

        @Test
        public void givenMultipleRideReturnTotalFare() {
            Ride[] rides = new Ride[]{new Ride(2.0, 5), new Ride(0.1, 1)};
            InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
            InvoiceSummary expectedSummary = new InvoiceSummary(2, 30.0);
            Assertions.assertEquals(expectedSummary, summary);
            Assert.assertEquals(expectedSummary, summary);
        }

    }

