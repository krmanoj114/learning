package com.ses.utility;

public class TestEmailBuilder {
    public static void main(String[] args) {
        Email email = new Email.EmailBuilder("krmananya5952@gmail.com", "krmanoj114@gmail.com", "test mail", "This is test email").build();
        System.out.println("email.getFromEmail() = " + email.getFromEmail());
        System.out.println("email.getToEmailIds() = " + email.getToEmailIds());
        System.out.println("email.getSubject() = " + email.getSubject());
        System.out.println("email.getEmailBody() = " + email.getEmailBody());
        System.out.println("email.getBcc() = " + email.getBcc());

        Email email1 = new Email.EmailBuilder("krmananya5952@gmail.com", "krmanoj114@gmail.com", "test mail", "This is test email").setBcc("BCC@gmail.com").build();
        System.out.println("email.getFromEmail() = " + email1.getFromEmail());
        System.out.println("email.getToEmailIds() = " + email1.getToEmailIds());
        System.out.println("email.getSubject() = " + email1.getSubject());
        System.out.println("email.getEmailBody() = " + email1.getEmailBody());
        System.out.println("email.getBcc() = " + email1.getBcc());
    }
}
