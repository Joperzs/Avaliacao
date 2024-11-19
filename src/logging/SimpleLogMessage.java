package logging;

public class SimpleLogMessage implements LogMessage {
    private String message;

    public SimpleLogMessage(String message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message;
    }
}
