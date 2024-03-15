package ex10;

public class App {
    public static void main(String[] args) {
        Logs logs = new Logs();
        
        logs.setLogLevel(new Info());
        logs.log("This is an information.");

        logs.setLogLevel(new Debug());
        logs.log("This is a debug information.");

        logs.setLogLevel(new Error());
        logs.log("This is an error information.");
    }
}
