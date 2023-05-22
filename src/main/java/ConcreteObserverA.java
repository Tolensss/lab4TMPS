class ConcreteObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("ConcreteObserverA received an update.");
    }
}
