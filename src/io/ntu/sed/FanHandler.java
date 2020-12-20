package io.ntu.sed;

public class FanHandler extends Handler{
    public FanHandler(Handler next) {
        super(next);
    }

    @Override
    public void handle(Email email) {

        if (email.getType().equals(Email.EmailType.FAN)) {
            System.out.println("Forward to CEO.");
        }else {
            if(null != this.getNext()){
                this.getNext().handle(email);
            }
        }
    }
}
