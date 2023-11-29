package post;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


//Total number of posts by each user.
//        Average word length of posts for each user.
//        Most common word used by each user.
public class SocialMediaAnalytics {

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(
                new Post("user1", "Hello World!", LocalDateTime.now().minusDays(2)),
                new Post("user2", "Java is fun.", LocalDateTime.now().minusDays(1)),
                new Post("user1", "Programming is exciting.", LocalDateTime.now().minusHours(12)),
                new Post("user2", "I love coding.", LocalDateTime.now().minusHours(6)),
                new Post("user3", "Java is fun.", LocalDateTime.now().minusMinutes(30)),
                new Post("user1", "Java is powerful.", LocalDateTime.now().minusMinutes(15)),
                new Post("user3", "Hello World!", LocalDateTime.now().minusMinutes(10)),
                new Post("user1", "Coding is awesome!", LocalDateTime.now())
        );

        // Now you can use the SocialMediaAnalytics methods to analyze this data

        totalNumberOfPostsByEachUser(posts);
        averageLengthOfWordsByeachUser(posts);

        mostCommonWordUsedByEachUser(posts);


    }

    private static void mostCommonWordUsedByEachUser(List<Post> posts) {
       var ans= posts.stream()
                .collect(Collectors.groupingBy(Post::getUserId,
                        Collectors.flatMapping(post -> Arrays.stream(post.getContent().split("\\s+")),
                                Collectors.groupingBy(Function.identity(), Collectors.counting())
                        )))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> entry.getValue().entrySet().stream()
                                .max(Map.Entry.comparingByValue())
                                .map(Map.Entry::getKey)
                                .orElse("")));
        System.out.println("Most Common Word"+ans);
    }

    private static void averageLengthOfWordsByeachUser(List<Post> posts) {


    }

    private static void totalNumberOfPostsByEachUser(List<Post> posts) {
        var ans=posts.stream().map(s->s.getUserId()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        var annssss=posts.stream().collect(Collectors.groupingBy(Post::getUserId,Collectors.counting()));
        System.out.println(ans);
        System.out.println(annssss);
    }


}
