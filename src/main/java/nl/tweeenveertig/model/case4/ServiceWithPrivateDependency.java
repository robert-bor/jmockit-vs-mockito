package nl.tweeenveertig.model.case4;

import java.io.IOException;

public class ServiceWithPrivateDependency {

    public int doSomething() throws IOException {
        int total = 4;
        total += crashHorribly();
        return total;
    }

    private int crashHorribly() throws IOException {
        throw new IOException();
    }

}
