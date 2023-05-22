public class ConcreteCommandB implements Command {
    private final ReceiverB receiver;

    ConcreteCommandB(ReceiverB receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.performActionB();
    }
}
