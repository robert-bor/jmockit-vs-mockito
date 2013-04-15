package nl.tweeenveertig.mockito.case6;

import nl.tweeenveertig.model.case6.Fluent;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

public class ServiceTest {

    @Test
    public void doSomething() {
        Fluent fluent = mock(Fluent.class, Mockito.RETURNS_DEEP_STUBS);
        fluent.say().hello().world();
    }
}
