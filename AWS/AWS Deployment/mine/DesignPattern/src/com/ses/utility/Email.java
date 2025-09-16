package com.ses.utility;

import com.sun.istack.internal.logging.Logger;

import java.io.InputStream;

public class Email {
    private static final Logger  logger = Logger.getLogger(Email.class);

    private String fromEmail;
    private String toEmailIds;
    private String subject;
    private String emailBody;

    //Optional
    private String cc;
    private String bcc;
    private String attachmentName;
    private InputStream attachment;

    public String getFromEmail() {
        return fromEmail;
    }

    public String getToEmailIds() {
        return toEmailIds;
    }

    public String getSubject() {
        return subject;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public String getCc() {
        return cc;
    }

    public String getBcc() {
        return bcc;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public InputStream getAttachment() {
        return attachment;
    }

    private Email(EmailBuilder builder) {
        this.fromEmail = builder.fromEmail;
        this.toEmailIds = builder.toEmailIds;
        this.subject = builder.subject;
        this.emailBody = builder.emailBody;
        this.cc = builder.cc;
        this.bcc = builder.bcc;
        this.attachmentName = builder.attachmentName;
        this.attachment = builder.attachment;
    }

    public static class EmailBuilder{

        private String fromEmail;
        private String toEmailIds;
        private String subject;
        private String emailBody;

        //Optional
        private String cc;
        private String bcc;
        private String attachmentName;
        private InputStream attachment;

        public EmailBuilder(String fromEmail, String toEmailIds, String subject, String emailBody) {
            this.fromEmail = fromEmail;
            this.toEmailIds = toEmailIds;
            this.subject = subject;
            this.emailBody = emailBody;
        }

        public EmailBuilder setCc(String cc) {
            this.cc = cc;
            return  this;
        }

        public EmailBuilder setBcc(String bcc) {
            this.bcc = bcc;
            return this;
        }

        public EmailBuilder setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }

        public EmailBuilder setAttachment(InputStream attachment) {
            this.attachment = attachment;
            return this;
        }

        public Email build(){
            return new Email(this);
        }

    }
}
