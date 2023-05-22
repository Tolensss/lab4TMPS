

public class ConcreteHandlerA implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {

    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE_A) {
            System.out.println("ConcreteHandlerA handles the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available for the request.");
        }
    }
}