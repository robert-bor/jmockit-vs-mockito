package nl.tweeenveertig.jmockit.case4;

import mockit.Expectations;
import nl.tweeenveertig.model.case4.ServiceWithPrivateDependency;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class ServiceTest {

    @Test
    public void doSomething() throws IOException {
        final ServiceWithPrivateDependency service = new ServiceWithPrivateDependency();
        new Expectations(service) {{
            invoke(service, "crashHorribly");
            result = 5;
        }};
        assertEquals(9, service.doSomething());
    }

}
