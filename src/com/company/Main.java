package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    public double tipValue(){
        var tip = 0.05;
        var billAmount = 25;

        return billAmount*tip;
    }

    public String voteCheck(int age){
        String message;
        if (age < 18)
            message = "You are Not eligible to vote";
        else
            message =   "you are eligible to vote";
        return message;
    }

    public String cardPayment(double price, double vat){
        String message;
        if (price + vat < 30)
            message = "Contactless";
        else
            message = "PIN required";

        return message;
    }

    public String discountCheck(int age){
        String message;
        if (age < 16){
            message = "You are entitled to a junior discount";
        }else if (age > 65){
            message = "You are entitled to a senior discount";
        }else
            message = "You must pay full price";

        return message;
    }

    public double calculateNetPay(int hours, double hourlyPay, boolean inPension) {
        double tax = .20;
        double grossPay = hours * hourlyPay;
        double taxedPay = (grossPay - 200) * tax;
        double pension = .06;


        if (grossPay > 200)
        {
            grossPay -= taxedPay;
        }

        if (hours >= 35)
        {
            double addedHours = (hours - 35);
            grossPay = ((hours * hourlyPay) + ((addedHours * hourlyPay) * .20));
            grossPay -= taxedPay;

        }

        if (inPension)
        {
            return ((grossPay - pension ) + tax);
        }
        return grossPay;
    }
}
