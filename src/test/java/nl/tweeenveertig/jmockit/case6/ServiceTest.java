package nl.tweeenveertig.jmockit.case6;

import mockit.Cascading;
import nl.tweeenveertig.model.case6.Fluent;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void doSomething(@Cascading Fluent fluent) {
        fluent.say().hello().world();
    }
}
