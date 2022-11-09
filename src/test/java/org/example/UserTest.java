package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user = new User(228,"Pasha",6);
    @Test
    void getId() {
        Assertions.assertEquals(user.getId(), 228);
    }

    @Test
    void getContent() {
        Assertions.assertEquals(user.getContent(), "Pasha");
    }

    @Test
    void getFactorial() {
        Assertions.assertEquals(user.getFactorial(), 720);
    }

    @Test
    void getArrayListFactorial() {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(24);
        arrayList.add(120);
        arrayList.add(720);
        arrayList.add(5040);
        Assertions.assertEquals(user.getArrayListFactorial(), arrayList);
    }
}