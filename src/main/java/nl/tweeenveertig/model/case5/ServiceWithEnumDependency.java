package nl.tweeenveertig.model.case5;

import java.io.IOException;

public class ServiceWithEnumDependency {

    public int doSomething() throws IOException {
        int total = 4;
        total += ToDependency.TO_DEPENDENCY.crashHorribly();
        return total;
    }
}
