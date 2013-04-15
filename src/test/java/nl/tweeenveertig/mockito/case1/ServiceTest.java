package nl.tweeenveertig.mockito.case1;

import nl.tweeenveertig.model.case1.ServiceWithDependencySetter;
import nl.tweeenveertig.model.case1.ToDependency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {

    @Test
    public void doSomething() throws IOException {
        ToDependency toDep = mock(ToDependency.class);
        ServiceWithDependencySetter service = new ServiceWithDependencySetter();
        service.setToDependency(toDep);
        when(toDep.crashHorribly()).thenReturn(5);
        assertEquals(9, service.doSomething());
    }

}
