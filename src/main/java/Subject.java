import java.util.ArrayList;
import java.util.List;

class Subject {
    private final List<Observer> observers = new ArrayList<>();

    void attach(Observer observer) {
        observers.add(observer);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
