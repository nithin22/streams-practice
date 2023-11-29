package com.begginer.stramsgpt;

import java.util.List;

public class TestTransaction {

    public static void main(String[] args) {
        List<Transactions> testStream = Transactions.getSampleTransactions();
        System.out.println(testStream.toString());
       calculateTotalAmountSpentOnElectronics(testStream);
       calculateAmoountSpentonClothingAndAElectronics(testStream);


    }

    private static void calculateAmoountSpentonClothingAndAElectronics(List<Transactions> testStream) {
        var totalSum=testStream.stream().filter(s->s.getDepartment().equals("Electronics") || s.getDepartment().equals("Clothing")).mapToDouble(Transactions::getItemPrice).sum();
        System.out.println("TOTAL SUM==="+totalSum);
    }

    private static void calculateTotalAmountSpentOnElectronics(List<Transactions> testStream) {
        var ans=testStream.stream().filter(s->s.getDepartment()=="Electronics").mapToDouble(Transactions::getItemPrice).sum();
        System.out.println(ans);

    }




}
