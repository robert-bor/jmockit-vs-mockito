package nl.tweeenveertig.model.case1;

import java.io.IOException;

public class ServiceWithDependencySetter {

    private ToDependency toDep;

    public void setToDependency(ToDependency toDep) {
        this.toDep = toDep;
    }

    public int doSomething() throws IOException {
        int total = 4;
        total += toDep.crashHorribly();
        return total;
    }
}
