import logging.*;

public class Main {
    public static void main(String[] args) {
        LogMessage message = new SimpleLogMessage("Este é um log de exemplo");

        LogMessage decoratedMessage = new TimestampDecorator(new EncryptionDecorator(message));

        ConsoleLogger logger = new ConsoleLogger();
        logger.log(decoratedMessage);

        System.out.println("Log gerado usando o padrão Decorator:");
        System.out.println("Mensagem original: " + message.getContent());
        System.out.println("Mensagem decorada: " + decoratedMessage.getContent());
    }
}
