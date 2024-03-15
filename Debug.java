package ex10;

class Debug implements LogLevel {

    @Override
    public void log(String message) {
        System.out.println("File::Logger: " + message);
        System.out.println("Standard Console::Logger: " + message);
    }
    
}
