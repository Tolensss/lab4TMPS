public class ConcreteCommandA implements Command {
    private final ReceiverA receiver;

    ConcreteCommandA(ReceiverA receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.performActionA();
    }
}
