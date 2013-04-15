package nl.tweeenveertig.jmockit.case1;

import mockit.Expectations;
import mockit.Mocked;
import nl.tweeenveertig.model.case1.ServiceWithDependencySetter;
import nl.tweeenveertig.model.case1.ToDependency;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class ServiceTest {

    @Test
    public void doSomething(@Mocked final ToDependency toDep) throws IOException {
        ServiceWithDependencySetter service = new ServiceWithDependencySetter();
        service.setToDependency(toDep);
        new Expectations() {{
            toDep.crashHorribly();
            result = 5;
        }};
        assertEquals(9, service.doSomething());
    }

}
