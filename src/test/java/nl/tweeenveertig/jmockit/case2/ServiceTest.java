package nl.tweeenveertig.jmockit.case2;

import mockit.Expectations;
import mockit.Mocked;
import nl.tweeenveertig.model.case2.ServiceWithNewDependency;
import nl.tweeenveertig.model.case2.ToDependency;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class ServiceTest {

    @Test
    public void doSomething(@Mocked(stubOutClassInitialization = false) final ToDependency toDep) throws IOException {
        ServiceWithNewDependency service = new ServiceWithNewDependency();
        new Expectations() {{
            new ToDependency();
            result = toDep;
            toDep.crashHorribly();
            result = 5;
        }};
        assertEquals(9, service.doSomething());
    }

}
