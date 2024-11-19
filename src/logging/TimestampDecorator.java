package logging;

import java.time.LocalDateTime;

public class TimestampDecorator extends LogDecorator {

    public TimestampDecorator(LogMessage logMessage) {
        super(logMessage);
    }

    @Override
    public String getContent() {
        return "[" + LocalDateTime.now() + "] " + logMessage.getContent();
    }
}
