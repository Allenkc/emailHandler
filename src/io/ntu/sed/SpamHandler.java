package io.ntu.sed;

public class SpamHandler extends Handler {

    protected SpamHandler(Handler next) {
        super(next);
    }

    @Override
    public void handle(Email email) {

        if (email.getType().equals(Email.EmailType.SPAM)) {
            System.out.println("Put mail to the spam box.");
        }else {
            if(null != this.getNext()){
                this.getNext().handle(email);
            }
        }
    }
}
