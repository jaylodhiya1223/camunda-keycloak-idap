package com.camundakeycloak.identity.model;

public class Model
{


    private String message;
    private String name;

    public Model() { }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + message + ", " + name;
    }
}
