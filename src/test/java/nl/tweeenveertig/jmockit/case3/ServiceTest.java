package nl.tweeenveertig.jmockit.case3;

import mockit.Expectations;
import mockit.Mocked;
import nl.tweeenveertig.model.case3.ServiceWithStaticDependency;
import nl.tweeenveertig.model.case3.ToDependency;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class ServiceTest {

    @Test
    public void doSomething(@Mocked final ToDependency toDep) throws IOException {
        ServiceWithStaticDependency service = new ServiceWithStaticDependency();
        new Expectations() {{
            ToDependency.crashHorribly();
            result = 5;
        }};
        assertEquals(9, service.doSomething());
    }

}
