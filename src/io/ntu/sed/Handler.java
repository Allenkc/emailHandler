package io.ntu.sed;

public abstract class Handler {
    private Handler next;

    protected Handler(Handler next) {
        this.next = next;
    }

    public void handle(Email email){
        if(null != next){
            next.handle(email);
        }
    }

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
}
