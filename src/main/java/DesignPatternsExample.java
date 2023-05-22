import java.util.ArrayList;
import java.util.List;

public class DesignPatternsExample {
    public static void main(String[] args) {
        // Chain of Responsibility pattern
        System.out.println("Chain of Responsibility pattern:");
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        ((ConcreteHandlerA) handlerA).setNextHandler(handlerB);
        handlerA.handleRequest(new Request(RequestType.TYPE_A));
        handlerA.handleRequest(new Request(RequestType.TYPE_B));
        System.out.println();

        // Command pattern
        System.out.println("Command pattern:");
        ReceiverA receiverA = new ReceiverA();
        ReceiverB receiverB = new ReceiverB();
        Command commandA = new ConcreteCommandA(receiverA);
        Command commandB = new ConcreteCommandB(receiverB);
        commandA.execute();
        commandB.execute();
        System.out.println();

        // Interpreter pattern
        System.out.println("Interpreter pattern:");
        Expression expression = new NonterminalExpression(new TerminalExpression());
        expression.interpret();
        System.out.println();

        // Iterator pattern
        List<Object> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");

        System.out.println("Iterator pattern:");
        Iterator iterator = new ConcreteIterator(items);
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }
        System.out.println();

        // Mediator pattern
        System.out.println("Mediator pattern:");
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ConcreteColleagueA(mediator);
        Colleague colleagueB = new ConcreteColleagueB(mediator);
        mediator.addColleague(colleagueA);
        mediator.addColleague(colleagueB);
        colleagueA.send("Hello from Colleague A!");
        colleagueB.send("Hi there! - Colleague B");
        System.out.println();

        // Observer pattern
        System.out.println("Observer pattern:");
        Subject subject = new Subject();
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        subject.attach(observerA);
        subject.attach(observerB);
        subject.notifyObservers();
        System.out.println();

        // Strategy pattern
        System.out.println("Strategy pattern:");
        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();
        strategyA.execute();
        strategyB.execute();
    }
}
