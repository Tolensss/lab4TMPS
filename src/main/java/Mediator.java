public interface Mediator {
    void addColleague(Colleague colleague);
    void send(String message, Colleague sender);
}