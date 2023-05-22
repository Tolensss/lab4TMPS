public class ConcreteHandlerB implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        nextHandler = handler;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {

    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE_B) {
            System.out.println("ConcreteHandlerB handles the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
