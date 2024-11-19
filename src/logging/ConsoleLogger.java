package logging;

public class ConsoleLogger {
    public void log(LogMessage logMessage) {
        System.out.println(logMessage.getContent());
    }

}
