package ex10;

public class Logs {
    private LogLevel logLevel;

    public Logs() {
        this.logLevel = new Info();
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void log(String message) {
        logLevel.log(message);
    }
}
