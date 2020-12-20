package io.ntu.sed;

public class ComplaintHandler extends Handler{

    public ComplaintHandler(Handler next) {
        super(next);
    }

    @Override
    public void handle(Email email) {

        if (email.getType().equals(Email.EmailType.COMPLAINT)) {
            System.out.println("Forward to legal department.");
        }else {
            if(null != this.getNext()){
                this.getNext().handle(email);
            }
        }
    }
}
