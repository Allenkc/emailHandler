package io.ntu.sed;

public class BaseHandler {
    private Handler handler;

    public BaseHandler(Handler handler) {
        this.handler = handler;
    }

    public void handle(Email email){
        this.handler.handle(email);
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
