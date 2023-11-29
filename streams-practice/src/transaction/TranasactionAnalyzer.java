package transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TranasactionAnalyzer {


    public static void main(String[] args) {
        List<Transaction> transactions= Arrays.asList(
                new Transaction(1,205,"debit"),
                new Transaction(2,100,"debit"),
                new Transaction(3,2,"credit"),
                new Transaction(4,205988,"credit"),
                new Transaction(5,20589,"credit"),
                new Transaction(6,25990,"credit")
        );

//        Find the total sum of all credit transactions.

        sumOfCreditTranssactions(transactions);

//        Find the average amount of debit transactions.
        avgAmountOfDebitTransactions(transactions);

/*        Create a map where the keys are transaction types ("debit" or "credit")
        and the values are lists of transactions of that type.*/

        createMapTransactions(transactions);
    }

    private static void createMapTransactions(List<Transaction> transactions) {
        var ans=transactions.stream().collect(Collectors.groupingBy(Transaction::getTransactionType));

        System.out.println("GROUPG"+ans);

    }

    private static void avgAmountOfDebitTransactions(List<Transaction> transactions) {

        var ans=transactions.stream().filter(s->s.getTransactionType().toLowerCase().equals("debit")).collect(Collectors.averagingDouble(Transaction::getAmount));
        System.out.println(ans);
    }


    private static void sumOfCreditTranssactions(List<Transaction> transactions) {
        var ans=transactions.stream().filter(transaction -> "credit".equals(transaction.getTransactionType())).collect(Collectors.summingDouble(Transaction::getAmount));

        System.out.println(ans);
    }
}
