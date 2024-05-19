package com.ps;

public class SalesContract extends Contract{
    private float salesTaxAmount = .05f;
    private int processingFee = 295;
    private int recordingFee = 100;
    public SalesContract(String dateOfContract, String customerName, String customerEmail, String vehicleSold) {
        super(dateOfContract, customerName, customerEmail, vehicleSold);
    }

    @Override
    public void getTotalPrice() {

    }

    @Override
    public void getMonthlyPayment() {

    }
}
