package sale;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SaleAnalyzer {

    public static void main(String[] args) {
        List<Sale> salesData = Arrays.asList(
                new Sale("Laptop", "Electronics", 1500.0, LocalDate.of(2023, 1, 15)),
                new Sale("Refrigerator", "Appliances", 1200.0, LocalDate.of(2023, 2, 8)),
                new Sale("Smartphone", "Electronics", 800.0, LocalDate.of(2023, 3, 20)),
                new Sale("Washing Machine", "Appliances", 1000.0, LocalDate.of(2023, 4, 5)),
                new Sale("Headphones", "Electronics", 200.0, LocalDate.of(2023, 1, 25)),
                new Sale("Microwave", "Appliances", 300.0, LocalDate.of(2023, 3, 10)),
                new Sale("Tablet", "Electronics", 600.0, LocalDate.of(2023, 2, 18))
        );

//        Find the total sales amount for each category.
//        Identify the top-selling product in each category.
//        Determine the total sales amount for each month.

        totalSalesOfEachCategory(salesData);
        totalSalesinEachMonth(salesData);
    }

    private static void totalSalesinEachMonth(List<Sale> salesData) {

        var ans=salesData.stream().collect(Collectors.groupingBy(s->s.getDate().getMonthValue(),Collectors.summingDouble(Sale::getAmount)));
        System.out.println("Based on Date:"+ans);
    }

    private static void totalSalesOfEachCategory(List<Sale> salesData) {
        var ans=salesData.stream().collect(Collectors.groupingBy(Sale::getCategory,Collectors.summingDouble(Sale::getAmount)));
        System.out.println(ans);
    }
}
