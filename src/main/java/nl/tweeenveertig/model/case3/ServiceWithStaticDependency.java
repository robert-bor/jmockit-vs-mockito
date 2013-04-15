package nl.tweeenveertig.model.case3;

import java.io.IOException;

public class ServiceWithStaticDependency {

    public int doSomething() throws IOException {
        int total = 4;
        total += ToDependency.crashHorribly();
        return total;
    }

}
