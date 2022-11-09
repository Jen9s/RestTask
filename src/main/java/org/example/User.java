package org.example;

import java.util.ArrayList;

public class User {

    private final long id;
    private final String content;

    private Facade facade = new Facade();

    public User(long id, String content,int n) {
        this.id = id;
        this.content = content;
        this.facade = new Facade(n);
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getFactorial(){
        return facade.GetNumberFactorial();
    }

    public ArrayList getArrayListFactorial(){
        return facade.GetArrayListFactorial();
    }

}

