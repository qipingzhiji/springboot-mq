package com.springboot.springbootmq.mq;

import java.io.Serializable;

public class Email implements Serializable {
    private String topic;
    private String message;

    public Email() {
    }

    public Email(String topic, String message) {
        this.topic = topic;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Email{" +
                "topic='" + topic + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
