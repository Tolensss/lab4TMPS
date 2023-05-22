import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues;

    public ConcreteMediator() {
        colleagues = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague sender) {
        for (Colleague colleague : colleagues) {
            if (colleague != sender) {
                colleague.receive(message);
            }
        }
    }
}