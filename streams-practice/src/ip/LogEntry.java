package ip;

public class LogEntry {
    private String ipAddress;
    private String username;
    private String timestamp;
    private String httpMethod;
    private String endpoint;
    private int responseCode;
    private long responseTime;

    public LogEntry(String ipAddress, String username, String timestamp, String httpMethod, String endpoint, int responseCode, long responseTime) {
        this.ipAddress = ipAddress;
        this.username = username;
        this.timestamp = timestamp;
        this.httpMethod = httpMethod;
        this.endpoint = endpoint;
        this.responseCode = responseCode;
        this.responseTime = responseTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "ipAddress='" + ipAddress + '\'' +
                ", username='" + username + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                ", endpoint='" + endpoint + '\'' +
                ", responseCode=" + responseCode +
                ", responseTime=" + responseTime +
                '}';
    }
}
