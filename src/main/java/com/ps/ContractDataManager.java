package com.ps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractDataManager {
    public static void saveContract(Contract contract, Vehicle vehicle) {
        try {
            // Open FileWriter in append mode by passing true as the second argument
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter("NewContract.csv", true));

            if (contract instanceof SalesContract) {
                bufWriter.write(String.format("%s|%s|%s|%s|%d|%d|%s|%s|%s|%s|%d|%.2f|%.2f|%d|%d|%.2f\n",
                        "SALE",
                        contract.getDateOfContract(),
                        contract.getCustomerName(),
                        contract.getCustomerEmail(),
                        vehicle.getVin(),
                        vehicle.getYear(),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        vehicle.getOdometer(),
                        vehicle.getPrice(),
                        ((SalesContract) contract).getMonthlyPayment(),
                        ((SalesContract) contract).getRecordingFee(),
                        ((SalesContract) contract).getProcessingFee(),
                        ((SalesContract) contract).getTotalPrice()));
            } else if (contract instanceof LeaseContract) {
                bufWriter.write(String.format("%s|%s|%s|%s|%d|%d|%s|%s|%s|%s|%d|%.2f|%.2f|%.2f|%.2f|%.2f\n",
                        "LEASE",
                        contract.getDateOfContract(),
                        contract.getCustomerName(),
                        contract.getCustomerEmail(),
                        vehicle.getVin(),
                        vehicle.getYear(),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        vehicle.getOdometer(),
                        vehicle.getPrice(),
                        ((LeaseContract) contract).getEndingValue(),
                        ((LeaseContract) contract).getLeaseFee(),
                        ((LeaseContract) contract).getTotalPrice(),
                        ((LeaseContract) contract).getMonthlyPayment()));
            }

            bufWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}