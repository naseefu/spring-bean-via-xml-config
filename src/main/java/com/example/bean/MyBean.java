package com.example.bean;

public class MyBean {

    private String message;

    public String getMessage() {
        return message;
    }

    // it is needed while setting the value from the config xml, if we don't give the setter-
    // it will throw an error
    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage(){
        System.out.println("MESSAGE : " + this.message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
