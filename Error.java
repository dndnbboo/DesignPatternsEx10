package ex10;

class Error implements LogLevel {

    @Override
    public void log(String message) {
        System.err.println("Error Console::Logger: " + message);
        System.out.println("File::Logger: " + message);
        System.out.println("Standard Console::Logger: " + message);
    }
    
}
