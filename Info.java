package ex10;

class Info implements LogLevel {

    @Override
    public void log(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
    
}
