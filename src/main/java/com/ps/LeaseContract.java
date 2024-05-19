package com.ps;

public class LeaseContract extends Contract{
    private float endingValue = .5f;
    private float leaseFee = .07f;
    public LeaseContract(String dateOfContract, String customerName, String customerEmail, String vehicleSold) {
        super(dateOfContract, customerName, customerEmail, vehicleSold);
    }

    @Override
    public void getTotalPrice() {

    }

    @Override
    public void getMonthlyPayment() {

    }
}
