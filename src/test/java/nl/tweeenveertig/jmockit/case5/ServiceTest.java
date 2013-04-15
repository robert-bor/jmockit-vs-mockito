package nl.tweeenveertig.jmockit.case5;

import mockit.Expectations;
import mockit.Mocked;
import nl.tweeenveertig.model.case5.ServiceWithEnumDependency;
import nl.tweeenveertig.model.case5.ToDependency;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class ServiceTest {

    @Test
    public void doSomething(@Mocked final ToDependency toDep) throws IOException {
        ServiceWithEnumDependency service = new ServiceWithEnumDependency();
        new Expectations() {{
            ToDependency.TO_DEPENDENCY.crashHorribly();
            result = 5;
        }};
        assertEquals(9, service.doSomething());
    }
}
