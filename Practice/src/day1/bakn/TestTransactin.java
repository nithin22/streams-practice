package day1.bakn;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Given a list of transactions, write a Java method
        that returns the total amount of all credit
        transactions that occurred in the last 30 days.
        The method signature should be:*/

public class TestTransactin {

    public static List<Transaction> getFakeTransactions() {
        return Arrays.asList(
                new Transaction(100.0, TransactionType.CREDIT, LocalDate.now().minusDays(10)),
                new Transaction(50.0, TransactionType.DEBIT, LocalDate.now().minusDays(25)),
                new Transaction(200.0, TransactionType.CREDIT, LocalDate.now().minusDays(5)),
                new Transaction(75.0, TransactionType.CREDIT, LocalDate.now().minusDays(35)),
                new Transaction(120.0, TransactionType.DEBIT, LocalDate.now().minusDays(15)),
                new Transaction(80.0, TransactionType.CREDIT, LocalDate.now().minusDays(28)),
                new Transaction(30.0, TransactionType.CREDIT, LocalDate.now().minusDays(2))
        );
    }

    public static void main(String[] args) {

        List<Transaction>transactionsList=getFakeTransactions();
        creditTranasactionsValueOftheLastThirtyDays(transactionsList);

        /*Given a list of transactions, write a Java method
        that calculates the average amount of debit*/
        averageAmountOfDebitTransactins(transactionsList);
     /*   Given a list of transactions, write a Java method that
        finds the transaction with the highest amount.*/
        heighestAmountOftheTransaactions(transactionsList);

/*        Write a Java method that calculates the total amount of
        transactions for each transaction type (credit and debit) separately*/
        totalAmountOfTrasactionsOfEachType(transactionsList);

        /*Write a Java method that identifies the
        timestamp of the earliest credit transaction.*/
        timeStampOfEarliestCreditTransaction(transactionsList);

    }

    private static void timeStampOfEarliestCreditTransaction(List<Transaction> transactionsList) {
       var ans= transactionsList.stream().filter(s -> s.getType().equals(TransactionType.DEBIT)).map(Transaction::getTimestamp).min(LocalDate::compareTo);
        System.out.println(ans);

    }


    private static void totalAmountOfTrasactionsOfEachType(List<Transaction> transactionsList) {
        var ans=transactionsList.stream().collect(Collectors.groupingBy(Transaction::getType,Collectors.summingDouble(Transaction::getAmount)));
        System.out.println(ans);
    }

    private static void heighestAmountOftheTransaactions(List<Transaction> transactionsList) {
       var ans=transactionsList.stream()
                .collect(Collectors.groupingBy(Transaction::getType, Collectors.maxBy(Comparator.comparing(Transaction::getAmount))));
        System.out.println(ans);
    }

    private static void averageAmountOfDebitTransactins(List<Transaction> transactionsList) {
       var ans = transactionsList.stream().filter(s -> s.getType().equals(TransactionType.DEBIT)).collect(Collectors.groupingBy(Transaction::getType, Collectors.averagingDouble(Transaction::getAmount)));
        System.out.println(ans);
    }

    private static void creditTranasactionsValueOftheLastThirtyDays(List<Transaction> transactionsList) {
        var ans=transactionsList.stream().filter(s->s.getType().equals(TransactionType.CREDIT)).collect(Collectors.groupingBy(Transaction::getType,Collectors.counting()));
        System.out.println(ans);
    }
}
