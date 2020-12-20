package io.ntu.sed;

public class Email {

    private EmailType type;

    public Email(EmailType type) {
        this.type = type;
    }

    public EmailType getType() {
        return type;
    }

    public void setType(EmailType type) {
        this.type = type;
    }

    enum EmailType {
        SPAM , COMPLAINT , FAN
    }

}
