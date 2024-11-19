package logging;

public abstract class LogDecorator implements LogMessage {
    protected LogMessage logMessage;

    public LogDecorator(LogMessage logMessage) {
        this.logMessage = logMessage;
    }

    @Override
    public String getContent() {
        return logMessage.getContent();
    }
}
