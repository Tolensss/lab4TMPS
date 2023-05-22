public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("Colleague B sends message: " + message);
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague B receives message: " + message);
    }
}