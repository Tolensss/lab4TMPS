// Chain of Responsibility
public interface Handler {
    void setNext(Handler handler);

    void setNextHandler(Handler nextHandler);

    void handleRequest(Request request);
}
