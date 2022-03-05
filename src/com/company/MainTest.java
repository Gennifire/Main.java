package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void tipValueTest() {

        System.out.println("Test for tip amount");
        Main twentyFive = new Main();
        var actResult = twentyFive.tipValue();
        assertEquals(1.25, actResult);

    }

    @Test
    void voteCheckTest(){

        System.out.println("test for 18 vote");
        var age = 19;
        Main eighteen = new Main();
        var actResult = eighteen.voteCheck(age);
        assertEquals("you are eligible to vote", actResult);

    }

    @Test
    void voteNoCheckTest(){

        System.out.println("test for no vote");
        var age = 17;
        Main Noteighteen = new Main();
        var actResult = Noteighteen.voteCheck(age);
        assertEquals("You are Not eligible to vote", actResult);

    }

    @Test
    void cardPaymentUnderTest(){
        System.out.println("Check for contactless");
        var price = 10;
        var vat = 0.21;
        Main underThirty = new Main();
        var actResult = underThirty.cardPayment(price, vat);
        assertEquals("Contactless", actResult);

    }

    @Test
    void cardPaymentOverTest(){
        System.out.println("Check for Pin");
        var price = 30;
        var vat = 0.21;
        Main overThirty = new Main();
        var actResult = overThirty.cardPayment(price, vat);
        assertEquals("PIN required", actResult);
    }

    @Test
    void disCountJuniorTest(){
        System.out.println("Junior check");
        Main junior = new Main();
        var actResult = junior.discountCheck(15);
        assertEquals("You are entitled to a junior discount", actResult);
    }

    @Test
    void disCountseniorTest(){
        System.out.println("senior check");
        Main senior = new Main();
        var actResult = senior.discountCheck(75);
        assertEquals("You are entitled to a senior discount", actResult);
    }

    @Test
    void nodisCountTest(){
        System.out.println("no discount check");
        Main nope = new Main();
        var actResult = nope.discountCheck(30);
        assertEquals("You must pay full price", actResult);
    }

    @Test
    void calculateNetPay10() {
        System.out.println("Test for 10 hours");
        Main tenHours = new Main();
        var actResult = tenHours.calculateNetPay(10, 15, false);
        assertEquals(150, actResult);
    }

    @Test
    void calculateNetPay20() {
        System.out.println("Test for 20 hours");
        Main twentyHours = new Main();
        var actResult = twentyHours.calculateNetPay(20, 15, false);
        assertEquals(280, actResult);
    }

    @Test
    void calculateNetPay30() {
        System.out.println("Test for 30 hours");
        Main thirtyHours = new Main();
        var actResult = thirtyHours.calculateNetPay(30, 15,false);
        assertEquals(400, actResult);
    }

    @Test
    void calculateNetPay40() {
        System.out.println("Test for 40 hours");
        Main fortyHours = new Main();
        var actResult = fortyHours.calculateNetPay(40, 15, false);
        assertEquals(535, actResult);
    }

    @Test
    void calculateNetPay45() {
        System.out.println("Test for 45 hours");
        Main forty5Hours = new Main();
        var actResult = forty5Hours.calculateNetPay(45, 15, false);
        assertEquals(610, actResult);
    }

    @Test
    void calculateNetPay50() {
        System.out.println("Test for 50 hours");
        Main fiftyHours = new Main();
        var actResult = fiftyHours.calculateNetPay(50, 15, false);
        assertEquals(685, actResult);
    }

    @Test
    void calculateNetPay55() {
        System.out.println("Test for 55 hours");
        Main fifty5Hours = new Main();
        var actResult = fifty5Hours.calculateNetPay(55, 15, false);
        assertEquals(760, actResult);
    }
    @Test
    void calculateNetPay60() {
        System.out.println("Test for 60 hours");
        Main sixtyHours = new Main();
        var actResult = sixtyHours.calculateNetPay(60, 15, false);
        assertEquals(835, actResult);
    }

    @Test
    void calculateNetPay70() {
        System.out.println("Test for 70 hours");
        Main seventyHours = new Main();
        var actResult = seventyHours.calculateNetPay(70, 15, false);
        assertEquals(985, actResult);
    }

    @Test
    void calculateNetPay0() {
        System.out.println("Test for 0 hours");
        Main zeroHours = new Main();
        var actResult = zeroHours.calculateNetPay(0, 15, false);
        assertEquals(0, actResult);
    }

    @Test
    void netPayPension() {
        System.out.println("Test for 40 hours + pension");
        Main pensionHours = new Main();
        var actResult = pensionHours.calculateNetPay(40, 15, true);
        assertEquals(535.1400000000001, actResult);
    }
}