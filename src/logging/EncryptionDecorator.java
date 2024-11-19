package logging;

public class EncryptionDecorator extends LogDecorator {

    public EncryptionDecorator(LogMessage logMessage) {
        super(logMessage);
    }

    @Override
    public String getContent() {
        return encrypt(logMessage.getContent());
    }

    private String encrypt(String message) {
        return new StringBuilder(message).reverse().toString();
    }
}
