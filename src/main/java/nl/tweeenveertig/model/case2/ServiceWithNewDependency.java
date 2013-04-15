package nl.tweeenveertig.model.case2;

import java.io.IOException;

public class ServiceWithNewDependency {

    public int doSomething() throws IOException {
        int total = 4;
        ToDependency toDep = new ToDependency();
        total += toDep.crashHorribly();
        return total;
    }
}
