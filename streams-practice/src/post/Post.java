package post;

import java.time.LocalDateTime;

public class Post {
    private String userId;
    private String content;
    private LocalDateTime timestamp;

    // Constructors, getters, and setters


    public Post(String userId, String content, LocalDateTime timestamp) {
        this.userId = userId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId='" + userId + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
