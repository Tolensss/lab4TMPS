class ConcreteObserverB implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserverB received an update.");
    }
}
