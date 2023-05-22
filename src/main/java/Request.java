class Request {
    private final RequestType type;

    Request(RequestType type) {
        this.type = type;
    }

    RequestType getType() {
        return type;
    }
}
