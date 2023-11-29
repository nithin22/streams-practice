package ip;

import java.util.*;
import java.util.stream.Collectors;

public class LogAnalyzer {

//    Find the top three IP addresses with the highest number of requests.
    public static List<String> findTopThreeIPs(List<LogEntry> logEntries) {
        // Your code here
        return logEntries.stream().collect(Collectors.groupingBy(
                LogEntry::getIpAddress,Collectors.counting()
        )).entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }

//    Find the average response time for each HTTP method.

    public static Map<String, Double> averageResponseTimePerMethod(List<LogEntry> logEntries) {
        // Your code here
        return logEntries.stream().collect(Collectors.groupingBy(LogEntry::getHttpMethod,Collectors.averagingLong(LogEntry::getResponseTime)));
    }

    public static void main(String[] args) {
        List<LogEntry> logEntries = Arrays.asList(
                // Populate with sample log entries
                new LogEntry("192.168.1.1", "user1", "2023-11-09T10:15:30", "GET", "/api/resource", 200, 120),
                new LogEntry("192.168.1.2", "user2", "2023-11-09T10:16:45", "POST", "/api/resource", 404, 150),
                new LogEntry("192.168.1.1", "user1", "2023-11-09T10:17:15", "GET", "/api/resource", 200, 130),
                new LogEntry("192.168.1.3", "user3", "2023-11-09T10:18:00", "GET", "/api/resource", 500, 180),
                new LogEntry("192.168.1.2", "user2", "2023-11-09T10:19:30", "POST", "/api/resource", 200, 200),
                new LogEntry("192.168.1.1", "user1", "2023-11-09T10:20:45", "GET", "/api/resource", 404, 110),
                new LogEntry("192.168.1.3", "user3", "2023-11-09T10:21:30", "GET", "/api/resource", 200, 150)
        );

        List<String> topIPs = findTopThreeIPs(logEntries);
        System.out.println("Top 3 IP Addresses:");
        topIPs.forEach(System.out::println);

        Map<String, Double> avgResponseTimes = averageResponseTimePerMethod(logEntries);
        System.out.println("Average Response Time per HTTP Method:");
        avgResponseTimes.forEach((method, avgTime) ->
                System.out.println(method + ": " + avgTime + " ms")
        );
    }
}
