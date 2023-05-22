public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("Colleague A sends message: " + message);
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague A receives message: " + message);
    }
}