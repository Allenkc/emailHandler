package io.ntu.sed;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        if (null == args[0]) {
            throw new IllegalArgumentException();
        }

        BaseHandler baseHandler = new BaseHandler(new SpamHandler(new ComplaintHandler(new FanHandler(null))));

        String fileName = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            Email email;

            String line = reader.readLine();

            while (line != null) {
                if ("SPAM".equals(line)) {
                    email = new Email(Email.EmailType.SPAM);
                    baseHandler.handle(email);
                } else if ("COMPLAINT".equals(line)) {
                    email = new Email(Email.EmailType.COMPLAINT);
                    baseHandler.handle(email);
                } else if ("FAN".equals(line)) {
                    email = new Email(Email.EmailType.FAN);
                    baseHandler.handle(email);
                }
                line = reader.readLine();
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Error! File Not found!" + fileNotFoundException.getMessage());
        }
    }
}
